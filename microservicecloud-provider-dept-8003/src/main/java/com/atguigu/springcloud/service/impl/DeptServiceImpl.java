package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.DeptDao;
import com.atguigu.springcloud.entites.Dept;
import com.atguigu.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname DeptServiceImpl
 * @Description TODO
 * @Date 2019/1/7 22:43
 * @Created by Mis Yang
 */
@Service
public class DeptServiceImpl implements DeptService
{

    @Autowired
    private DeptDao deptDao;

    //添加
    @Override
    public boolean addDept(Dept dept)
    {
        boolean result = deptDao.addDept(dept);
        if (result)
        {
            return true;
        }
        return false;
    }

    //根据ID查找
    @Override
    public Dept findById(Long id)
    {
        return deptDao.findById(id);
    }

    //查询所有
    @Override
    public List<Dept> findAll()
    {
        return deptDao.findAll();
    }
}
