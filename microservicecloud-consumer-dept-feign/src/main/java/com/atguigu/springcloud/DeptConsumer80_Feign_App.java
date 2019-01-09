package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @Classname DeptConsumer80_App
 * @Description TODO
 * @Date 2019/1/7 23:25
 * @Created by Mis Yang
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.atguigu.springcloud.service"})
public class DeptConsumer80_Feign_App
{
    public static void main(String[] args)
    {
        SpringApplication.run(DeptConsumer80_Feign_App.class, args);
    }
}
