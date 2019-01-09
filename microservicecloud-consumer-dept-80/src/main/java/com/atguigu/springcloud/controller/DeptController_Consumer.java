package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entites.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Classname DeptController_Consumer
 * @Description TODO
 * @Date 2019/1/7 23:08
 * @Created by Mis Yang
 */
@RestController
public class DeptController_Consumer
{
    @Autowired
    private RestTemplate restTemplate;

    //private static final String REST_URL_PREFIX = "http://localhost:8001";
    private static final String REST_URL_PREFIX = "http://microservicecloud-dept";

    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept)
    {
        return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, Boolean.class);

    }

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept getById(@PathVariable("id") Long id)
    {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/" + id, Dept.class);
    }

    @GetMapping("/consumer/dept/list")

    public List<Dept> getAll()
    {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
    }
}
