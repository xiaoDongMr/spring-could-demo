package cn.ylcf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;
import cn.ylcf.server.FirstTestServer;
import cn.ylcf.service.SencondTestServer;

@RestController
@RefreshScope
@RequestMapping("/test")
public class FristTestController {

    @Autowired
    private FirstTestServer firstTestServer;
    @Autowired
    private SencondTestServer sencondTestServer;

    @RequestMapping(value = "/doTest/{code}", method = RequestMethod.POST)
    public String doTest(@PathVariable("code") Integer code){
        return firstTestServer.doTestServer(code);
    }

    @RequestMapping(value = "/doTestServer2/{code}", method = RequestMethod.POST)
    public String doTestServer2(@PathVariable("code") Integer code){
        return sencondTestServer.doTestServer2(code);
    }

}
