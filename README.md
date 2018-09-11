
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



状态码（场景值）	说明
 -1	系统繁忙
 0	请求成功
 40001	验证失败
 40002	不合法的凭证类型
 40003	不合法的OpenID
 40004	不合法的媒体文件类型
 40005	不合法的文件类型
 40006	不合法的文件大小
 40007	不合法的媒体文件id
 40008	不合法的消息类型
 40009	不合法的图片文件大小
 40010	不合法的语音文件大小
 40011	不合法的视频文件大小
 40012	不合法的缩略图文件大小
 40013	不合法的APPID
 40014	不合法的access_token
 40014	不合法的access_token
 40015	不合法的菜单类型
 40016	不合法的按钮个数
 40017	不合法的按钮个数
 40018	不合法的按钮名字长度
 40019	不合法的按钮KEY长度
 40020	不合法的按钮URL长度 
 40021	不合法的菜单版本号
 40022	不合法的子菜单级数
 40023	不合法的子菜单按钮个数
 40024	不合法的子菜单按钮类型
 40025	不合法的子菜单按钮名字长度
 40026	不合法的子菜单按钮KEY长度
 40027	不合法的子菜单按钮URL长度
 40028	不合法的自定义菜单使用用户
 41001	缺少access_token参数
 41002	缺少appid参数
 41003	缺少refresh_token参数
 41004	缺少secret参数
 41005	缺少多媒体文件数据
 41006	缺少media_id参数
 41007	缺少子菜单数据
 42001	access_token超时
 43001	需要GET请求
 43002	需要POST请求
 43003	需要HTTPS请求
 44001	多媒体文件为空
 44002	POST的数据包为空
 44003	图文消息内容为空
 45001	多媒体文件大小超过限制
 45002	消息内容超过限制
 45003	标题字段超过限制
 45004	描述字段超过限制
 45005	链接字段超过限制
 45006	图片链接字段超过限制
 45007	语音播放时间超过限制
 45008	图文消息超过限制
 45009	接口调用超过限制
 45010	创建菜单个数超过限制
 46001	不存在媒体数据
 46002	不存在的菜单版本
 46003	不存在的菜单数据
40029	登录多次导致code重复/appid和secret对应不上，不是同一个小程序
