package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entites.Dept;

import java.util.List;

/**
 * @Classname DeptService
 * @Description TODO
 * @Date 2019/1/7 22:42
 * @Created by Mis Yang
 */

/**
 * 这个接口来处理部门相关的业务
 */
public interface DeptService
{
    //添加
    boolean addDept(Dept dept);
    //根据ID查找
    Dept findById(Long id);
    //查找所有
    List<Dept> findAll();
}
