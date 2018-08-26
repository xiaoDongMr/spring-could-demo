package cn.ylcf.controller;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

@RestController
@RefreshScope
@RequestMapping("/test")
public class SencondTestController {

   /* @Autowired
    private ToFirstTestServer toFirstTestServer;*/

    @RequestMapping(value = "/firstToSencond/{name}", method = RequestMethod.POST)
    public String firstToSencond(@PathVariable("name") String name){
        return "this is form " + name;
    }

    /*@RequestMapping(value = "/sencondToFirst", method = RequestMethod.POST)
    public String sencondToFirst(){
        return toFirstTestServer.sencondToFirst("sencond");
    }*/
}
