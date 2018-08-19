package xiaodong.controller;

import cn.ylcf.pojo.TbUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * @RestController注解呢，其实就是@ResponseBody ＋ @Controller的组合注解，
 * @GetMapping呢，相当于@RequestMapping(value="", method = RequestMethod.GET)
 */

@RestController
@RequestMapping("/user")
public class UserController {

    /*    @Autowired
        private RestTemplate restTemplate;*/
    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping(value = "/getUser/{id}")
    public TbUser getUser(@PathVariable Long id) {
        return userFeignClient.getUser((long) 1);
        /*return restTemplate.getForObject("http://provider-admin-server/user/getUser/" + id, TbUser.class);*/
    }
}
