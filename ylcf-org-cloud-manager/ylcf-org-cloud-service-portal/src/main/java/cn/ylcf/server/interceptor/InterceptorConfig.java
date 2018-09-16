package cn.ylcf.server.interceptor;

import cn.yilucaifu.domain.Users;
import cn.yilucaifu.utils.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class InterceptorConfig implements HandlerInterceptor {
    private final static Logger logger = LoggerFactory.getLogger(InterceptorConfig.class);
    @Value("${jwt.secret}")
    private String JWT_SECRET;
    @Value("${jwt.expires}")
    private String JWT_EXPIRES;
    @Value("${redisKey.prefix.user_info}")
    private String USER_INFO;
    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 进入controller层之前拦截请求
     *
     * @param req
     * @param res
     * @param o
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object o) throws Exception {


       /* String origin = httpServletRequest.getHeader("Origin");
        httpServletResponse.setHeader("Access-Control-Allow-Origin", origin);
        httpServletResponse.setHeader("Access-Control-Allow-Methods", "*");
        httpServletResponse.setHeader("Access-Control-Allow-Headers","Origin,Content-Type,Accept,token,X-Requested-With");
        httpServletResponse.setHeader("Access-Control-Allow-Credentials", "true");*/

        logger.info("---------------------开始进入请求地址拦截----------------------------");
        logger.info("------token验证-------");
        String token = req.getHeader("Authorization");
        try {
            token = token.replace("Bearer ", "");

            //jwt是否失效
            JwtUtils.JwtUser jwtUser = JwtUtils.verifyToken(token, JWT_SECRET);

            //退出,修改用户名密码时清空redis用户信息,使jwt无效
            RedisUtil redisUtil = new RedisUtil(redisTemplate);
            Users user = (Users) JsonUtils.jsonToPojo((String) redisUtil.get(USER_INFO + jwtUser.getUserId()), Users.class);
            if(user == null){
                YlcfResult result = YlcfResult.build(-2, "token 已失效请重新登录");
                res.setHeader("Content-type", "application/json;charset=UTF-8");
                PrintWriter printWriter = res.getWriter();
                printWriter.write(JsonUtils.objectToJson(result));
                return false;
            }

            //更新失效时间
            token = JwtUtils.createToken(jwtUser, Long.parseLong(JWT_EXPIRES), JWT_SECRET);
            //设置token至请求头
            res.addHeader("Authorization", "Bearer " + token);

            //request请求添加userId及username
            req.setAttribute("jwtUserId", jwtUser.getUserId());
            req.setAttribute("jwtUserName", jwtUser.getUsername());

        } catch (Exception e) {
            e.printStackTrace();
            logger.info("拦截器解析令牌失败");
            YlcfResult result = YlcfResult.build(-2, "token 验证失败请重新登录");
            res.setHeader("Content-type", "application/json;charset=UTF-8");
            PrintWriter printWriter = res.getWriter();
            printWriter.write(JsonUtils.objectToJson(result));
            return false;
        }
        // 拦截请求路径 request.getRequestURI().toString();
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        logger.info("--------------处理请求完成后视图渲染之前的处理操作---------------");
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        logger.info("---------------视图渲染之后的操作-------------------------0");
    }
}
