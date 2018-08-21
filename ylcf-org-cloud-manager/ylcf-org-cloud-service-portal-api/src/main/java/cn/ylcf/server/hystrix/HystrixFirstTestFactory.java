package cn.ylcf.server.hystrix;

import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import cn.ylcf.server.FirstTestServer;

public class HystrixFirstTestFactory implements FallbackFactory<FirstTestServer> {

    private static final Logger LOGGER = LoggerFactory.getLogger(HystrixFirstTestFactory.class);

    @Override
    public FirstTestServer create(Throwable throwable) {
        HystrixFirstTestFactory.LOGGER.info("the provider error is: {}", throwable.getMessage());
        return new FirstTestServer() {
            @Override
            public String doTestServer(Integer code) {
                return "服务器开小差，请稍后再试";
            }
        };
    }
}
