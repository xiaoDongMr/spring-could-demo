package cn.ylcf;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@Configuration
@EnableTransactionManagement
@EnableAuthorizationServer
@EnableGlobalMethodSecurity(prePostEnabled = true)//开启注解
/*@MapperScan(basePackages = "cn.yilucaifu.mapper")*/
public class YlcfOrgServicePortalApplication {
    public static void main(String[] args) {
        SpringApplication.run(YlcfOrgServicePortalApplication.class, args);
    }

}
