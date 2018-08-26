package cn.ylcf.server.impl;

import io.swagger.annotations.*;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import cn.ylcf.server.FirstTestServer;


@Api(value = "API - FirstTestServerImpl", description = "FirstTestServer操作")
@RestController
@RefreshScope
public class FirstTestServerImpl implements FirstTestServer {
    @Value("${phone.gatherinfo}")
    private String phone;
    @Value("${http.server.url}")
    private String server;

    private static Logger logger = Logger.getLogger(FirstTestServerImpl.class);

    @ApiOperation("获取手机号码")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "code", value = "", required = true, dataType = "Integer"),
            }
    )
    @ApiResponses(
            {
                    @ApiResponse(code = 200, message = "Successful — 请求已完成"),
                    @ApiResponse(code = 400, message = "请求中有语法问题，或不能满足请求"),
                    @ApiResponse(code = 401, message = "未授权客户机访问数据"),
                    @ApiResponse(code = 404, message = "服务器找不到给定的资源；文档不存在"),
                    @ApiResponse(code = 500, message = "服务器不能完成请求")
            }
    )
    public String doTestServer(@PathVariable("code") Integer code) {
        logger.info("==================="+phone);
        //thirdTestService.doTestServer3(444);
        return phone + "," + server + "," + code + 3;
    }
}
