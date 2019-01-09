package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entites.Dept;
import com.atguigu.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Classname DeotController
 * @Description TODO
 * @Date 2019/1/7 22:46
 * @Created by Mis Yang
 */
@RestController
@RequestMapping("/dept/")
public class DeptController
{
    @Autowired
    private DeptService deptService;

    @Qualifier("discoveryClient")
    @Autowired
    private DiscoveryClient client;

    @GetMapping("discovery")
    public Object discovery()
    {
        List<String> list = client.getServices();
        System.out.println(list);

        List<ServiceInstance> srvList = client.getInstances("microservicecloud-dept");
        for (ServiceInstance instance : srvList)
        {
            System.out.println(instance.getServiceId() + "\t" + instance.getHost() + "\t" + instance.getPort() + "\t" + instance.getUri());
        }
        return this.client;
    }


    @PostMapping("add")
    public String add(Dept dept)
    {
        if (deptService.addDept(dept))
        {
            return "true";
        }
        return "false";
    }

    @GetMapping("get/{id}")
    public Dept getById(@PathVariable("id") Long id)
    {
        return deptService.findById(id);
    }

    @GetMapping("list")
    public List<Dept> getAll()
    {
        return deptService.findAll();
    }

}
