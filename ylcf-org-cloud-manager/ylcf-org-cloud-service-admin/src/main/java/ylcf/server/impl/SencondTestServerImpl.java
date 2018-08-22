package ylcf.server.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import server.ToFirstTestServer;


@RestController
@RefreshScope
public class SencondTestServerImpl implements ToFirstTestServer {
    @Value("${phone.gatherinfo}")
    private String phone;
    @Value("${http.server.url}")
    private String server;

    private static Logger logger = Logger.getLogger(SencondTestServerImpl.class);


    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Override
    public String sencondToFirst(String name) {
        return restTemplate.getForObject("http://org-portal-web/test/sencondToFirst/"+name, String.class);
    }

    @Override
    public String sencondServer() {
        return null;
    }
}
