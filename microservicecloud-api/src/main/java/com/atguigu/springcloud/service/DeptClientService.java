package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entites.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Classname DeptClientService
 * @Description TODO
 * @Date 2019/1/9 19:13
 * @Created by Mis Yang
 */
@FeignClient(value = "MICROSERVICECLOUD-DEPT")
@Component
public interface DeptClientService
{
    @RequestMapping("/dept/add")
    boolean add(Dept dept);


    @RequestMapping("/dept/get/{id}")
    Dept getById(@PathVariable("id") Long id);


    @GetMapping("/dept/list")
    List<Dept> getAll();

}
