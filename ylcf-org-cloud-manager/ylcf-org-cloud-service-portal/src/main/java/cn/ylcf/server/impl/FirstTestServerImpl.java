package cn.ylcf.server.impl;

import cn.ylcf.server.ThirdTestService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Value("${phone.gatherinfo}")
    private String phone;
    @Value("${http.server.url}")
    private String server;

    private static Logger logger = Logger.getLogger(FirstTestServerImpl.class);

    /*@GetMapping(value = "/doTest")*/
    public String doTestServer(@PathVariable("code") Integer code) {
        logger.info("==================="+phone);
        //thirdTestService.doTestServer3(444);
        return phone + "," + server + "," + code + 3;
    }
}
