
服务链路追踪
springcloud2.0后不用自己配置 直接去官网下载jar包运行即可
java -jar zipkin-server-2.9.4-exec.jar

查看断路器状况
locahost:8001/hystrix
http://localhost:8001/actuator/hystrix.stream



## 项目结构
```
ylcf-cloud
├─ylcf-cloud-config             // 远程配置文件中心
├─ylcf-cloud-eureka             // 服务注册发现中心
├─ylcf-cloud-turbine            // 断路聚合监控（暂时不用）
├─ylcf-cloud-sleuth             // 服务链路追踪（暂时不用）
├─ylcf-cloud-zuul               // 路由网关（暂时不用）
└─ylcf-org-cloud-manager        
   ├─ylcf-org-cloud-common      // org项目公共工具类
   ├─ylcf-org-cloud-mapper      // org项目公共mapper
   ├─ylcf-org-cloud-pojo        // org项目公共pojo
   ├─ylcf-org-cloud-api         // org项目暴露的接口
   ├─ylcf-org-cloud-admin-api   // org后台项目暴露的接口
   ├─ylcf-org-cloud-task-api    // org定时任务暴露的接口
   ├─ylcf-org-cloud             // org项目
   ├─ylcf-org-cloud-task        // org定时任务
   └─ylcf-org-cloud-admin       // org后台
    
    
ylcf-org-cloud
 ├─org.ylcf.controller           // 控制层
 ├─org.ylcf.service              // 服务实现层
 ├─org.ylcf.interceptor          // 拦截器
 ├─org.ylcf.jms                  // 消息服务消费者
 ├─org.ylcf.druid                // 德鲁伊链接数据源
 ├─org.ylcf.thread               // 多线程服务
```

api实现服务消费者feign+hystrix断路器
服务实现层按模块划分，Redis可做存取， activityMQ做消息服务生产者。
通过服务消费者feign在controller中可调用任意不同项目api接口实现请求。
使用swagger生成接口文档。
远程配置文件分为dev开发环境配置，prod生产。
druid连接池配置多源数据库
