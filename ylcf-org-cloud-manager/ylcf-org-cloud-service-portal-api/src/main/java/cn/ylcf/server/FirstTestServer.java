package cn.ylcf.server;

import cn.ylcf.server.hystrix.HystrixFirstTestFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "firstTestServer", fallback = HystrixFirstTestFactory.class)
public interface FirstTestServer {

    @RequestMapping(value = "/doTestServer", method = RequestMethod.GET)
    String doTestServer();
}
