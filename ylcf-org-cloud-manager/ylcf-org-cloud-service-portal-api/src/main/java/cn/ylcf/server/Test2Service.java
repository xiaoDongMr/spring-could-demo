package cn.ylcf.server;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "org-portal-service")
public interface Test2Service {
    @RequestMapping(value = "/test2", method = RequestMethod.GET)
    String test2(@RequestParam(value = "name") String name);
}
