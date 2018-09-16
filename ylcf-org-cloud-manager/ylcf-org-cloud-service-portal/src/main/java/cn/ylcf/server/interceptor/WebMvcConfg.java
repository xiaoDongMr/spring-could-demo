package cn.ylcf.server.interceptor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class WebMvcConfg extends WebMvcConfigurationSupport {

    @Bean
    public HandlerInterceptor interceptorConfig() {
        return new InterceptorConfig();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //拦截路由
        List<String> addPathList = new ArrayList<String>();
        addPathList.add("/**");
        //不拦截路由
        List<String> excludePathList = new ArrayList<String>();
        excludePathList.add("/user/login");
        excludePathList.add("/user/register");
        excludePathList.add("/doTestServer");


        registry.addInterceptor(interceptorConfig())
                .addPathPatterns(addPathList)
                .excludePathPatterns(excludePathList);
        super.addInterceptors(registry);
    }
}