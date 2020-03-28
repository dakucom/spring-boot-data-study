package com.dakuzai.service;

import com.dakuzai.mapper.EmployeeMapper;
import com.dakuzai.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: spring-boot-data-study
 * @description: 职工逻辑层
 * @author: dakuzai
 * @create: 2020-03-26 20:02
 */
@Service
public class EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;

    public List<Employee> getEmployees(){
        return employeeMapper.getEmployees();
    }
}
