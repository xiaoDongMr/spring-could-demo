package server.hystrix;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import server.ToFirstTestServer;

@Component
public class HystrixToFirstTestFactory implements ToFirstTestServer {

    private static final Logger LOGGER = LoggerFactory.getLogger(HystrixToFirstTestFactory.class);

    private static final String MESSAGE = "服务器开小差，请稍后再试";


    @Override
    public String sencondToFirst(String name) {
        return MESSAGE;
    }

    @Override
    public String sencondServer() {
        return MESSAGE;
    }
}
