package cn.ylcf;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
@Configuration
@EnableTransactionManagement
/*@MapperScan(basePackages = "cn.yilucaifu.mapper")*/
public class YlcfOrgServicePortalApplication {
    public static void main(String[] args) {
        SpringApplication.run(YlcfOrgServicePortalApplication.class, args);
    }

}
