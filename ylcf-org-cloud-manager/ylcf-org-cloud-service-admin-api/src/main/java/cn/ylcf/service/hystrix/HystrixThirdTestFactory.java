package cn.ylcf.service.hystrix;

import cn.ylcf.service.ThirdTestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class HystrixThirdTestFactory implements ThirdTestService {

    private static final Logger LOGGER = LoggerFactory.getLogger(HystrixThirdTestFactory.class);

    private static final String MESSAGE = "服务器开小差，请稍后再试";


    @Override
    public String doTestServer3(Integer code) {
        return MESSAGE;
    }
}
