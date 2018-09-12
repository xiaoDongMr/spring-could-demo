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
import java.util.HashMap;
import java.util.Map;

public class InterceptorConfig implements HandlerInterceptor {
    private final static Logger logger = LoggerFactory.getLogger(InterceptorConfig.class);
    @Value("${jwt.secret}")
    private String jwtSecret;

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
                JwtUtils.JwtUser jwtUser = JwtUtils.verifyToken(token, jwtSecret);
                //redis中查看是否过期

                //没过期刷新token失效时间

                //request请求添加userId及username
                Map<String, Object> extraParams = new HashMap<String, Object>();
                extraParams.put("userId", jwtUser.getUserId());
                extraParams.put("username", jwtUser.getUsername());
                RequestParameterWrapper requestParameterWrapper = new RequestParameterWrapper(req);
                requestParameterWrapper.addParameters(extraParams);

            } catch (Exception e) {
                e.printStackTrace();
                logger.info("拦截器解析令牌失败");
                YlcfResult result = YlcfResult.build(40003, "token 解析失败请重新登录");
                PrintWriter printWriter = res.getWriter();
                printWriter.write(JsonUtils.objectToJson(result));
                return false;
            }
        }
        // 拦截请求路径 request.getRequestURI()
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
