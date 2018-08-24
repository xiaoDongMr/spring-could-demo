package cn.ylcf.server.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import cn.ylcf.service.SencondTestServer;


@RestController
@RefreshScope
public class SencondTestServerImpl implements SencondTestServer {
    @Value("${phone.gatherinfo}")
    private String phone;
    @Value("${http.server.url}")
    private String server;

    private static Logger logger = Logger.getLogger(SencondTestServerImpl.class);



    public String doTestServer2(@PathVariable("code") Integer code) {
        return "手机号："+phone + ", 服务地址：" + server + ", 随机号：" + code;
    }
}
