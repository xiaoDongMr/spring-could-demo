package cn.ylcf.server;

import cn.ylcf.server.hystrix.HystrixFirstTestFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import cn.ylcf.server.hystrix.HystrixFirstTestFactory;

@FeignClient(value = "ylcf-org-cloud-service-portal", fallback = HystrixFirstTestFactory.class)
public interface FirstTestServer {

    @RequestMapping(value = "/doTestServer", method = RequestMethod.POST)
    String doTestServer(@RequestParam("code") Integer code);
}
