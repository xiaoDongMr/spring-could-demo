package cn.ylcf.server.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cn.ylcf.server.FirstTestServer;


@RestController
@RefreshScope
public class FirstTestServerImpl implements FirstTestServer {
    /*@Value("${phone.gatherinfo}")
    private String phone;
    @Value("${http.server.url}")
    private String server;*/

    private static Logger logger = Logger.getLogger(FirstTestServerImpl.class);

    /*@GetMapping(value = "/doTest")*/
    public String doTestServer() {
       /* logger.info("==================="+phone);
        String bb = "dass";*/
        /*return phone + "," + server + "," + 66 + 1;*/
        return "ads";
    }
}
