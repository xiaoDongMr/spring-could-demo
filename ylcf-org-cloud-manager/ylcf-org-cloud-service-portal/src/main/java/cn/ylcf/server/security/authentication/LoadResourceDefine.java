package cn.ylcf.server.security.authentication;

import cn.ylcf.server.entity.Resource;
import cn.ylcf.server.impl.IResourceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.servlet.util.matcher.MvcRequestMatcher;
import org.springframework.security.web.util.matcher.RequestMatcher;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerMappingIntrospector;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by zhoutaoo on 2018/5/25.
 */
@Component
class LoadResourceDefine {
    private final static Logger log = LoggerFactory.getLogger(LoadResourceDefine.class);


    @Autowired
    private IResourceService resourceService;

    @Autowired
    private HandlerMappingIntrospector mvcHandlerMappingIntrospector;

    @Bean
    public Map<RequestMatcher, ConfigAttribute> resourceConfigAttributes() {
        Set<Resource> resources = resourceService.findAll();
        Map<RequestMatcher, ConfigAttribute> map = resources.stream()
                .collect(Collectors.toMap(
                        resource -> {
                            MvcRequestMatcher mvcRequestMatcher = new MvcRequestMatcher(mvcHandlerMappingIntrospector, resource.getUrl());
                            mvcRequestMatcher.setMethod(HttpMethod.resolve(resource.getMethod()));
                            return mvcRequestMatcher;
                        },
                        resource -> new SecurityConfig(resource.getCode())
                        )
                );
        log.debug("resourceConfigAttributes:{}", map);
        return map;
    }
}
