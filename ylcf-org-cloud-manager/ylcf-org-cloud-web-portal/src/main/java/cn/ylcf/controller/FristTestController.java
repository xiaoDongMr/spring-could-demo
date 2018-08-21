package cn.ylcf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cn.ylcf.server.FirstTestServer;

@RestController
@RequestMapping("/test")
public class FristTestController {

    @Autowired
    private FirstTestServer firstTestServer;

    @GetMapping(value = "doTest")
    public String doTest(@PathVariable Integer code){

        return firstTestServer.doTestServer(code);

    }
}
