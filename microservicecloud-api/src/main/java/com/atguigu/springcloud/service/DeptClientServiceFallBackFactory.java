package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entites.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Classname DeptClientServiceFallBackFactory
 * @Description TODO
 * @Date 2019/1/10 2:01
 * @Created by Mis Yang
 */
@Component
public class DeptClientServiceFallBackFactory implements FallbackFactory<DeptClientService>
{
    @Override
    public DeptClientService create(Throwable throwable)
    {
        return new DeptClientService()
        {
            @Override
            public boolean add(Dept dept)
            {
                return false;
            }

            @Override
            public Dept getById(Long id)
            {
                return new Dept().setDeptId(id).
                        setDname("该ID：" + id + "没有没有对应的信息,Consumer客户端提供降级信息，此刻服务Provider已关闭")
                        .setDb_source("no this database in MySQL");
            }

            @Override
            public List<Dept> getAll()
            {
                return null;
            }
        };
    }
}
