package cn.ylcf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import cn.ylcf.server.FirstTestServer;

@RestController
@RequestMapping("/test")
public class FristTestController {

    @Autowired
    private FirstTestServer firstTestServer;

    @RequestMapping(value = "/doTest", method = RequestMethod.GET)
    public String doTest(){
        String aas = "ad";
        return firstTestServer.doTestServer();
    }
}
