package cn.ylcf.server.interceptor;

import cn.yilucaifu.utils.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class InterceptorConfig implements HandlerInterceptor {
    private final static Logger logger = LoggerFactory.getLogger(InterceptorConfig.class);
    @Value("${jwt.secret}")
    private String JWT_SECRET;
    @Value("${jwt.expires}")
    private String JWT_EXPIRES;

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

        logger.info("---------------------开始进入请求地址拦截----------------------------");
        logger.info("------token验证-------");
        String token = req.getHeader("Authorization");
        if (token == null || !token.startsWith("Bearer ")) {
            token = token.replace("Bearer ", "");
            try {
                JwtUtils.JwtUser jwtUser = JwtUtils.verifyToken(token, JWT_SECRET);
                //jwt是否失效
                if (new Date().after(jwtUser.getExpires())) {
                    logger.info("请求拦截检查jwt已过期");
                    YlcfResult result = YlcfResult.build(-2, "token 验证令牌已过期请重新登录");
                    PrintWriter printWriter = res.getWriter();
                    printWriter.write(JsonUtils.objectToJson(result));
                    return false;
                }

                //更新失效时间
                try {
                    token = JwtUtils.createToken(jwtUser, Long.parseLong(JWT_EXPIRES), JWT_SECRET);
                    //设置token至请求头
                    res.addHeader("Authorization", "Bearer " + token);
                } catch (Exception e) {
                    logger.info("请求拦截更新失效时间jwt加密失败");
                    YlcfResult result = YlcfResult.build(-2, "请求拦截更新失效时间失败");
                    e.printStackTrace();
                    PrintWriter printWriter = res.getWriter();
                    printWriter.write(JsonUtils.objectToJson(result));
                    return false;
                }

                //request请求添加userId及username
                try {
                    Map<String, Object> extraParams = new HashMap<String, Object>();
                    extraParams.put("userId", jwtUser.getUserId());
                    extraParams.put("username", jwtUser.getUsername());
                    RequestParameterWrapper requestParameterWrapper = new RequestParameterWrapper(req);
                    requestParameterWrapper.addParameters(extraParams);
                } catch (Exception e) {
                    e.printStackTrace();
                    logger.info("请求拦截追加用户信息失败");
                    YlcfResult result = YlcfResult.build(-2, "追加用户信息失败请重新登录");
                    PrintWriter printWriter = res.getWriter();
                    printWriter.write(JsonUtils.objectToJson(result));
                    return false;
                }

            } catch (Exception e) {
                e.printStackTrace();
                logger.info("拦截器解析令牌失败");
                YlcfResult result = YlcfResult.build(-2, "token 验证失败请重新登录");
                PrintWriter printWriter = res.getWriter();
                printWriter.write(JsonUtils.objectToJson(result));
                return false;
            }
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
