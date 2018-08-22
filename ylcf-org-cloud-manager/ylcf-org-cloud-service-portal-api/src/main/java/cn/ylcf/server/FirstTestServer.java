package cn.ylcf.server;

import cn.ylcf.server.hystrix.HystrixFirstTestFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "org-portal-service", fallback = HystrixFirstTestFactory.class)
public interface FirstTestServer {

    @RequestMapping(value = "/doTestServer/{code}", method = RequestMethod.POST)
    String doTestServer(@PathVariable("code") Integer code);

    /*@RequestMapping(value = "/firstToSencond", method = RequestMethod.POST)
    String firstToSencond(@RequestParam(value = "name") String name);*/
}
