package cn.ylcf;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class YlcfOrgServicePortalApplication {
    public static void main(String[] args) {
        SpringApplication.run(YlcfOrgServicePortalApplication.class, args);
    }

    @Value("${phone.gatherinfo}")
    String phone;
    @Value("${http.server.url}")
    String server;

    @RequestMapping(value = "/server")
    public String hi() {
        return phone + server;
    }
}
