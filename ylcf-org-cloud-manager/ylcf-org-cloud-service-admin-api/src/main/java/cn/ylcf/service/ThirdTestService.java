package cn.ylcf.service;

import cn.ylcf.service.hystrix.HystrixThirdTestFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "org-admin-service", fallback = HystrixThirdTestFactory.class)
public interface ThirdTestService {

    @RequestMapping(value = "/doTestServer3", method = RequestMethod.POST)
    String doTestServer3(@RequestParam(value = "code") Integer code);
}
