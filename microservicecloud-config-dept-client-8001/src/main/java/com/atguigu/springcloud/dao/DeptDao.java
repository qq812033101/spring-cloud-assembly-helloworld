package com.atguigu.springcloud.dao;

import java.util.List;

import com.atguigu.springcloud.entites.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Mapper
public interface DeptDao
{
	public boolean addDept(Dept dept);

	public Dept findById(Long id);

	public List<Dept> findAll();
}
