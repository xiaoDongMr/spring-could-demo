package cn.ylcf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import cn.ylcf.server.FirstTestServer;
import org.springframework.web.client.RestTemplate;

@RestController
@RefreshScope
@RequestMapping("/test")
public class FristTestController {

    @Autowired
    private FirstTestServer firstTestServer;

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @RequestMapping(value = "/doTest/{code}", method = RequestMethod.POST)
    public String doTest(@PathVariable("code") Integer code) {
        return firstTestServer.doTestServer(code);
    }


    @RequestMapping(value = "/sencondToFirst/{name}", method = RequestMethod.POST)
    public String sencondToFirst(@PathVariable("name") Integer name) {
        return "this is form " + name;
    }

    @RequestMapping(value = "/firstToSencond", method = RequestMethod.GET)
    public String firstToSencond() {
        /*return firstTestServer.firstToSencond("First");*/
        return restTemplate.getForObject("http://org-admin-web/test/firstToSencond/First", String.class);
    }

}
