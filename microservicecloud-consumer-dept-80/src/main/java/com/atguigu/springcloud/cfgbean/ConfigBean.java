package com.atguigu.springcloud.cfgbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Classname ConfigBean
 * @Description TODO
 * @Date 2019/1/7 23:03
 * @Created by Mis Yang
 */
@Configuration
public class ConfigBean
{
    @Bean
    public RestTemplate getRestTemplate()
    {
        return new RestTemplate();
    }
}
