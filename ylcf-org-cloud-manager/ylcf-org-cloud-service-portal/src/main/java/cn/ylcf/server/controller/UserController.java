package cn.ylcf.server.controller;

import cn.yilucaifu.domain.Users;
import cn.yilucaifu.mapper.persistence.UsersDao;
import cn.yilucaifu.utils.JsonUtils;
import cn.yilucaifu.utils.JwtUtils;
import cn.yilucaifu.utils.RedisUtil;
import cn.yilucaifu.utils.YlcfResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RefreshScope
@RequestMapping("/user")
public class UserController {
    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Value("${jwt.secret}")
    private String JWT_SECRET;
    @Value("${jwt.expires}")
    private String JWT_EXPIRES;
    @Value("${redisKey.prefix.user_info}")
    private String USER_INFO;

    @Autowired
    private RedisTemplate redisTemplate;
   /* @Autowired
    private UsersDao usersDao;*/

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public YlcfResult register(HttpServletRequest req, HttpServletResponse res,
                               @RequestParam(value = "username", required = true) String username,
                               @RequestParam(value = "password", required = true) String password) {

        //注册验证通过,保持数据
        Users user = new Users();
        user.setUserId(1);
        user.setUsername(username);
        user.setPassword("6IJ68kjksjaHHK55HJ");
        user.setCompanyName("一路财富");

        //存入redis，有关该用户的详细信息
        RedisUtil redisUtil = new RedisUtil();
        redisUtil.set(String.valueOf(user.getUserId()), JsonUtils.objectToJson(user));

        //生成token
        String token = "";
        JwtUtils.JwtUser jwtUser = new JwtUtils.JwtUser(1, username);
        try {
            token = JwtUtils.createToken(jwtUser, Long.parseLong(JWT_EXPIRES), JWT_SECRET);
        } catch (Exception e) {
            logger.info("用户注册生成token jwt加密失败");
            e.printStackTrace();
        }
        //设置token至请求头
        res.addHeader("Authorization", "Bearer " + token);

        return YlcfResult.ok(token);
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public YlcfResult login(HttpServletRequest req, HttpServletResponse res,
                            @RequestParam(value = "username", required = true) String username,
                            @RequestParam(value = "password", required = true) String password) {

        //登录验证通过,查询用户信息

        //生成token
        String token = "";
        JwtUtils.JwtUser jwtUser = new JwtUtils.JwtUser(1, username);
        try {
            //token = JwtUtils.createToken(jwtUser, Long.parseLong(jwtExpires), jwtSecret);
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
