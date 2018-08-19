package ylcf.org.xiaodong.controller;

import cn.ylcf.pojo.TbUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @RestController注解呢，其实就是@ResponseBody ＋ @Controller的组合注解，
 * @GetMapping呢，相当于@RequestMapping(value="", method = RequestMethod.GET)
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping(value = "/getUser/{id}")
    public TbUser getUser(@PathVariable Long id){
        TbUser user=new TbUser();
        user.setId((long) 1);
        user.setEmail("1027331569@qq.com");
        user.setPassword("12345600");
        user.setUsername("xiaodong");
        return user;
    }
    @GetMapping(value = "/getName")
    public String getName(){
        return "张三";
    }
}
