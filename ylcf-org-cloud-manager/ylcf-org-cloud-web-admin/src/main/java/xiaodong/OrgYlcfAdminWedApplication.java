package xiaodong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

/**
 * @SpringBootApplication注解呢是SpringBoot的一个组合注解，
 * 主要注解为@Configuration、@EnableAutoConfiguration、@ComponentScan
 */
@SpringBootApplication
@EnableEurekaClient

/**
 * 为Feign客户端 删除RestTemplate类，对RestTemplate进行过二次封装
 */

@EnableFeignClients
//注解就是表示开启断路器模式的注解
@EnableCircuitBreaker

/**
 * 指定provider-demo服务使用的是LoadBalanced类提供的规则
 */
@RibbonClient(name = "provider-demo", configuration = xiaodong.config.LoadBalanced.class)
public class OrgYlcfAdminWedApplication {
    /**
     * RestTemplate类呢，是一个对于HTTP请求封装的一个类，相信大家都知道我们使用原生API访问一个URL需要的代码是很多的，这个呢，就是一个封装简化的版本。
     * @Bean注解呢，其实就等同于以前在xml中配置的如下代码
     * @return
     */
   /* @Bean
    @LoadBalanced//开启负载均衡
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }*/

    public static void main(String[] args) {
        SpringApplication.run(OrgYlcfAdminWedApplication.class, args);
    }
}
