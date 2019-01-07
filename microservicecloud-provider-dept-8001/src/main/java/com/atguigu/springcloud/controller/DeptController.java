package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entites.Dept;
import com.atguigu.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
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
