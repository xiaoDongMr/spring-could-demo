package cn.ylcf.server.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import cn.ylcf.server.FirstTestServer;


@RestController
public class FirstTestServerImpl implements FirstTestServer {
    @Value("${phone.gatherinfo}")
    private String phone;
    @Value("${http.server.url}")
    private String server;

    private static Logger logger = Logger.getLogger(FirstTestServerImpl.class);

    public String doTestServer(Integer code) {
        return phone + "," + server + "," + code + 1;
    }
}
