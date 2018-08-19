package ylcf.org.xiaodong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @SpringBootApplication注解呢是SpringBoot的一个组合注解，
 * 主要注解为@Configuration、@EnableAutoConfiguration、@ComponentScan
 */
@SpringBootApplication
public class OrgYlcfAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrgYlcfAdminApplication.class, args);
    }
}
