package cn.ylcf.portal.service;

import cn.ylcf.utils.JedisClient;
import cn.ylcf.utils.impl.JedisClientSingle;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/*@EnableHystrix*/
@Configuration
//@EnableApolloConfig
@SpringBootApplication
@EnableDiscoveryClient
@EnableTransactionManagement
@MapperScan(basePackages = "cn.ylcf.mapper")
public class XbinStoreServicePortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(XbinStoreServicePortalApplication.class, args);

	}

	@Bean
	public JedisClient jedisClient() {
		return new JedisClientSingle();
	}
}
