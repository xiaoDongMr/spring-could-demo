package server.hystrix;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import server.SencondTestServer;

@Component
public class HystrixSencondTestFactory implements SencondTestServer {

    private static final Logger LOGGER = LoggerFactory.getLogger(HystrixSencondTestFactory.class);

    private static final String MESSAGE = "服务器开小差，请稍后再试";


    @Override
    public String doTestServer2(Integer code) {
        return MESSAGE;
    }
}
