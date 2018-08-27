package cn.ylcf.server.impl;

import cn.yilucaifu.domain.Users;
import cn.yilucaifu.domain.UsersExample;
import cn.yilucaifu.mapper.persistence.UsersDao;
import io.swagger.annotations.*;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import cn.ylcf.server.FirstTestServer;

import java.util.List;


@Api(value = "API - FirstTestServerImpl", description = "FirstTestServer操作")
@RestController
@RefreshScope
public class FirstTestServerImpl implements FirstTestServer {
    @Value("${phone.gatherinfo}")
    private String phone;
    @Value("${http.server.url}")
    private String server;
    @Autowired
    private UsersDao usersDao;

    private static Logger logger = Logger.getLogger(FirstTestServerImpl.class);

    @ApiOperation("获取手机号码")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "code", value = "", required = true, dataType = "Integer"),
            }
    )
    public String doTestServer(@PathVariable("code") Integer code) {
        logger.info("==================="+phone);
        //thirdTestService.doTestServer3(444);

        UsersExample usersExample = new UsersExample();
        UsersExample.Criteria uCrit = usersExample.createCriteria();
        uCrit.andUserIdEqualTo(999);
        List<Users> usersList = usersDao.selectByExample(usersExample);
        Users user = usersList.get(0);

        return user.getCompanyName()+phone + "," + server + "," + code + 3;
    }
}
