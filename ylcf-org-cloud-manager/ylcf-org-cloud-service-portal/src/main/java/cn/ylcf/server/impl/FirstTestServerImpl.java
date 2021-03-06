package cn.ylcf.server.impl;

import cn.yilucaifu.domain.Users;
import cn.yilucaifu.domain.UsersExample;
import cn.yilucaifu.mapper.persistence.UsersDao;
import cn.yilucaifu.utils.DateUtils;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import cn.ylcf.server.FirstTestServer;

import java.util.List;


@Api(value = "API - FirstTestServerImpl", description = "FirstTestServer操作")
@RestController
@RefreshScope
public class FirstTestServerImpl implements FirstTestServer {

    private final static Logger logger = LoggerFactory.getLogger(FirstTestServerImpl.class);

    @Value("${phone.gatherinfo}")
    private String phone;
    @Value("${http.server.url}")
    private String server;
    @Autowired
    private UsersDao usersDao;
    @Autowired
    private RabbitTemplate rabbitTemplate;
    /*@Autowired
    private FundDao fundDao;*/


    @ApiOperation("获取手机号码")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "code", value = "", required = true, dataType = "Integer"),
            }
    )
    public String doTestServer(@RequestParam String name) {
        logger.info("===================" + phone);
        //thirdTestService.doTestServer3(444);
        //String name = req.getParameter("name");

        UsersExample usersExample = new UsersExample();
        UsersExample.Criteria uCrit = usersExample.createCriteria();
        uCrit.andUserIdEqualTo(999);
        List<Users> usersList = usersDao.selectByExample(usersExample);
        Users user = usersList.get(0);

        String fundcode = "999";
        CorrelationData correlationData = new CorrelationData();
        correlationData.setId("user-firstTest-"+String.valueOf(user.getUserId())+ DateUtils.getNowDate());
        rabbitTemplate.convertAndSend("user-exchange", "user.lalla", user, correlationData);

        return user.getCompanyName() + phone + "," + server + "," + fundcode;
    }
}
