package cn.ylcf.controller;

import cn.ylcf.server.ThirdTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;
import cn.ylcf.server.FirstTestServer;

@RestController
@RefreshScope
@RequestMapping("/test")
public class FristTestController {

    @Autowired
    private FirstTestServer firstTestServer;
    /*@Autowired
    private SencondTestServer sencondTestServer;*/
    @Autowired
    private ThirdTestService thirdTestService;

    @RequestMapping(value = "/doTest/{code}", method = RequestMethod.POST)
    public String doTest(@PathVariable("code") Integer code){
        return firstTestServer.doTestServer(code);
    }

    /**
     * maven import ylcf-org-cloud-service-admin-api
     * @param code
     * @return
     */
    /*@RequestMapping(value = "/doTestServer2/{code}", method = RequestMethod.POST)
    public String doTestServer2(@PathVariable("code") Integer code){
        return sencondTestServer.doTestServer2(code);
    }*/

    @RequestMapping(value = "/doTestServer3/{code}", method = RequestMethod.POST)
    public String doTestServer3(@PathVariable("code") Integer code){
        return thirdTestService.doTestServer3(code);
    }

}
