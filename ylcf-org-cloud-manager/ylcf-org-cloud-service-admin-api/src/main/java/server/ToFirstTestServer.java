package server;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import server.hystrix.HystrixToFirstTestFactory;

@FeignClient(value = "org-portal-service", fallback = HystrixToFirstTestFactory.class)
public interface ToFirstTestServer {

    @RequestMapping(value = "/hi",method = RequestMethod.POST)
    String sencondToFirst(@RequestParam(value = "name") String name);
}
