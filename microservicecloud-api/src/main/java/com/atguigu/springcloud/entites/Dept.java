package com.atguigu.springcloud.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Classname Dept
 * @Description TODO
 * @Date 2019/1/7 21:48
 * @Created by Mis Yang
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable
{
    //主键
    private Long deptId;
    //部门名称
    private String dname;
    //来自哪个数据库
    private String db_source;
}
