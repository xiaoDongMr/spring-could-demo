package cn.ylcf.controller;

import cn.ylcf.server.ThirdTestService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;
import cn.ylcf.server.FirstTestServer;
import io.swagger.annotations.Api;


@Api(value = "/test", tags = "swagger测试Controller")
@RefreshScope
@RestController("/test")
public class FristTestController {

    @Autowired
    private FirstTestServer firstTestServer;
    /*@Autowired
    private SencondTestServer sencondTestServer;*/
    @Autowired
    private ThirdTestService thirdTestService;

    @ApiOperation(value = "随机手机号", notes = "随机手机号")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "code", value = "随机号", dataType = "string", defaultValue = "222"),
            @ApiImplicitParam(name = "phone", value = "手机号", dataType = "string")
    })
    @RequestMapping(value = "/doTest/{code}", method = RequestMethod.POST)
    public String doTest(@PathVariable("code") Integer code) {
        return firstTestServer.doTestServer(code);
    }

    /**
     * maven import ylcf-org-cloud-service-admin-api
     *
     * @param code
     * @return
     */
    /*@RequestMapping(value = "/doTestServer2/{code}", method = RequestMethod.POST)
    public String doTestServer2(@PathVariable("code") Integer code){
        return sencondTestServer.doTestServer2(code);
    }*/


    @ApiOperation(value = "随机号加三", notes = "随机号加三")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "code", value = "随机号", dataType = "string")
    })
    @RequestMapping(value = "/doTestServer3/{code}", method = RequestMethod.POST)
    public String doTestServer3(@PathVariable("code") Integer code) {
        return thirdTestService.doTestServer3(code);
    }

}
