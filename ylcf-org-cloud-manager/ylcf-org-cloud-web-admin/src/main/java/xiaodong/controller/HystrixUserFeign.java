package xiaodong.controller;

import cn.ylcf.pojo.TbUser;
import feign.Logger;
import feign.hystrix.FallbackFactory;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class HystrixUserFeign implements FallbackFactory<UserFeignClient> {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(HystrixUserFeign.class);

    @Override
    public UserFeignClient create(Throwable cause) {
        HystrixUserFeign.LOGGER.info("the provider error is: {}", cause.getMessage());
        return new UserFeignClient() {
            @Override
            public TbUser getUser(Long id) {
                TbUser user = new TbUser();
                user.setUsername("???");
                return user;
            }
        };
    }
}