package cn.ylcf.server.impl;

import cn.ylcf.service.ThirdTestService;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ThirdTestServiceImpl implements ThirdTestService {

    @Override
    public String doTestServer3(@RequestParam(value = "code") Integer code) {
        return "input code "+code;
    }
}
