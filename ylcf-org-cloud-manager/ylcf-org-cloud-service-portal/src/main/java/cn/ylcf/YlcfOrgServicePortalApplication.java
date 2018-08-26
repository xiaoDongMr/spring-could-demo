package cn.ylcf;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@Configuration
public class YlcfOrgServicePortalApplication {
    public static void main(String[] args) {
        SpringApplication.run(YlcfOrgServicePortalApplication.class, args);
    }

}
