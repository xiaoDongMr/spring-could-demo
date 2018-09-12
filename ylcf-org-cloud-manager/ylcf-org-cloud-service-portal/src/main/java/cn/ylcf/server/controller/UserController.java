package cn.ylcf.server.controller;

import cn.yilucaifu.utils.JwtUtils;
import cn.yilucaifu.utils.YlcfResult;
import cn.ylcf.server.impl.FirstTestServerImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RefreshScope
@RequestMapping("/user")
public class UserController {
    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Value("${jwt.secret}")
    private String jwtSecret;
    @Value("${jwt.expires}")
    private String jwtExpires;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public YlcfResult register(HttpServletRequest req, HttpServletResponse res,
                        @RequestParam(value = "username", required = true) String username,
                        @RequestParam(value = "password", required = true) String password) {

        //注册验证通过,保持数据

        //生成token
        String token = "";
        JwtUtils.JwtUser jwtUser = new JwtUtils.JwtUser(1, username, "一路财富");
        try {
            token = JwtUtils.createToken(jwtUser, Long.parseLong(jwtExpires), jwtSecret);
        } catch (Exception e) {
            logger.info("用户注册生成token jwt加密失败");
            e.printStackTrace();
        }
        //设置token至请求头
        res.addHeader("Authorization", "Bearer " + token);


        //存入redis，，，有关该用户的详细信息

        return YlcfResult.ok(token);
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public YlcfResult login(HttpServletRequest req, HttpServletResponse res,
                           @RequestParam(value = "username", required = true) String username,
                           @RequestParam(value = "password", required = true) String password) {

        //登录验证通过,查询用户信息

        //生成token
        String token = "";
        JwtUtils.JwtUser jwtUser = new JwtUtils.JwtUser(1, username, "一路财富");
        try {
            token = JwtUtils.createToken(jwtUser, Long.parseLong(jwtExpires), jwtSecret);
        } catch (Exception e) {
            logger.info("用户注册生成token jwt加密失败");
            e.printStackTrace();
        }
        //设置token至请求头
        res.addHeader("Authorization", "Bearer " + token);


        //存入redis，，，有关该用户的详细信息

        return YlcfResult.ok(token);
    }


}
