package cn.ylcf.service;

import cn.ylcf.service.hystrix.HystrixSencondTestFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "org-admin-service", fallback = HystrixSencondTestFactory.class)
public interface SencondTestServer {

    @RequestMapping(value = "/doTestServer2/{code}", method = RequestMethod.POST)
    String doTestServer2(@PathVariable("code") Integer code);

}
