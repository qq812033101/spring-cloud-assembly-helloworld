package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Classname EurekaServer7001_App
 * @Description TODO
 * @Date 2019/1/8 1:21
 * @Created by Mis Yang
 */
@SpringBootApplication
@EnableEurekaServer //标明这是一个服务端
public class EurekaServer7002_App
{
    public static void main(String[] args)
    {
        SpringApplication.run(EurekaServer7002_App.class, args);
    }
}
