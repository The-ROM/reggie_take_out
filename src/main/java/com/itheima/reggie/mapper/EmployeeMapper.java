package com.itheima.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.reggie.entity.Employee;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
