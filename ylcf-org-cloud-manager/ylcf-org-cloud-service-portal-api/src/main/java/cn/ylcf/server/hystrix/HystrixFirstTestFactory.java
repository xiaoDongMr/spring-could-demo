package cn.ylcf.server.hystrix;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import cn.ylcf.server.FirstTestServer;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Component
public class HystrixFirstTestFactory implements FirstTestServer {

    private static final Logger LOGGER = LoggerFactory.getLogger(HystrixFirstTestFactory.class);

    private static final String MESSAGE = "服务器开小差，请稍后再试";

    @Override
    public String doTestServer(@RequestParam(value = "name") String name) {
        return MESSAGE;
    }

   /* @Override
    public String firstToSencond(String name) {
        return MESSAGE;
    }*/

}
