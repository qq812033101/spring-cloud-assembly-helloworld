
dept.sql 数据表

microservicecloud-api 这是一个公共模块，目前提供了一个 数据库封装对象。

microservicecloud-consumer-dept-80 消费者模块，主要用于对外提供访问服务接口。 采用Ribbon+RestTemplate的模式
microservicecloud-consumer-dept-feign  接口加注解的声明式WEB服务调用模块   feign是前者的进一步封装。


microservicecloud-provider-dept-8001 生产者模块，该模块用来真正用来处理请求跟返回数据。
microservicecloud-provider-dept-8002 生产者负载均衡
microservicecloud-provider-dept-8003

microservicecloud-provider-dept-hystrix-8001 演示 服务熔断

microservicecloud-eureka-7001  eureka服务端模块，用于服务的注册跟发现
microservicecloud-eureka-7002  eureka LB
microservicecloud-eureka-7003



microservicecloud-config-3344  服务端配置中心
microservicecloud-config-client-3355 测试-用来读取服务端的配置
microservicecloud-config-dept-client-8001 从配置中心读取配置的生产者模块
microservicecloud-config-eureka-client-7001 从配置心读取配置的注册中心模块