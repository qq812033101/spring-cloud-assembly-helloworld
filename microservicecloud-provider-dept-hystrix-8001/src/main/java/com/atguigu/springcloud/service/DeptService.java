package com.atguigu.springcloud.service;


import com.atguigu.springcloud.entites.Dept;

import java.util.List;

public interface DeptService
{
    boolean add(Dept dept);

    Dept get(Long id);

    List<Dept> list();
}
