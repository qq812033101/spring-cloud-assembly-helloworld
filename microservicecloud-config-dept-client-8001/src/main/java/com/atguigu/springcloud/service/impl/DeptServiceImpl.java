package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.DeptDao;
import com.atguigu.springcloud.service.DeptService;
import java.util.List;

import com.atguigu.springcloud.entites.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DeptServiceImpl implements DeptService
{
	@Autowired
	private DeptDao dao;
	
	@Override
	public boolean add(Dept dept)
	{
		return dao.addDept(dept);
	}

	@Override
	public Dept get(Long id)
	{
		return dao.findById(id);
	}

	@Override
	public List<Dept> list()
	{
		return dao.findAll();
	}

}
