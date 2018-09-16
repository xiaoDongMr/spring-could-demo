package cn.yilucaifu.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JwtUtils {

    /**
     * 生成token
     *
     * @param jwtUser 对象
     * @param maxAge  最大生存时间
     * @param secret  密钥
     * @return 令牌
     */
    public static String createToken(JwtUser jwtUser, long maxAge, String secret) throws Exception {

        // 设置header
        Map<String, Object> headers = new HashMap<String, Object>();
        headers.put("alg", "HS256"); //加密算法
        headers.put("typ", "JWT");

        // 生成token  头信息 设置过期时间  签名时间 将用户信息设置json
        String token = JWT.create()
                .withHeader(headers)
                .withExpiresAt(new Date(System.currentTimeMillis() + maxAge))
                .withIssuedAt(new Date())
                .withClaim("jwtUser", new ObjectMapper().writeValueAsString(jwtUser))
                .sign(Algorithm.HMAC256(secret));

        return token;
    }

    /**
     * 解析令牌成为对象
     *
     * @param token  传入令牌
     * @param secret 密钥
     * @return // 返回对象
     * @throws Exception
     */
    public static JwtUser verifyToken(String token, String secret) throws Exception {
        // 创建解析器，用来将String的令牌解析成jwt对象
        JWTVerifier verifier = JWT.require(Algorithm.HMAC256(secret)).build();

        // 解析
        DecodedJWT jwt = verifier.verify(token);
        // 从对象中拿出来user的键值对
        Claim userClaim = jwt.getClaim("jwtUser");
        String json = userClaim.asString();

        // 用jackson将String转换成对象
        JwtUser user = new ObjectMapper().readValue(json, JwtUser.class);

        return user;
    }


    public static class JwtUser {
        private Integer userId;
        private String username;

        public JwtUser() {
        }

        public JwtUser(Integer userId, String username) {
            this.userId = userId;
            this.username = username;
        }

        public Integer getUserId() {
            return userId;
        }

        public void setUserId(Integer userId) {
            this.userId = userId;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        @Override
        public String toString() {
            return "JwtUser{" +
                    "userId=" + userId +
                    ", username='" + username + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        String token = null;
        //加密
        try {
            token = createToken(new JwtUser(1, "张三"), 10000, "yilucaifu2018");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(token);
        //解密
        JwtUser user = null;
        try {
            user = verifyToken(token, "yilucaifu2018");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(user);
    }
}