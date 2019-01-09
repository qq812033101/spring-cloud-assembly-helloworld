package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entites.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Classname DeptDao
 * @Description TODO
 * @Date 2019/1/7 22:29
 * @Created by Mis Yang
 */

/**
 * 部门相关的DAO
 */
@Mapper
public interface DeptDao
{
    //添加
    boolean addDept(Dept dept);
    //根据ID查找
    Dept findById(Long id);
    //查找所有
    List<Dept> findAll();

}
