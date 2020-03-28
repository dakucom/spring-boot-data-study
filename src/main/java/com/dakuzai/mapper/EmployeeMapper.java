package com.dakuzai.mapper;

import com.dakuzai.pojo.Department;
import com.dakuzai.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: spring-boot-mybatis-scaffold
 * @description: 职工映射类
 * @author: dakuzai
 * @create: 2020-03-23 13:34
 */
@Mapper
@Repository
public interface EmployeeMapper {
    /**
     * 获取职工信息
     *
     * @return
     */
    List<Employee> getEmployees();

    /**
     * 增加职工
     * @param employee
     * @return
     */
    int saveEmployee(Employee employee);

    /**
     * 根据Id删除职工
     *
     * @param id
     * @return
     */
    int deleteEmployeeById(Integer id);

    /**
     * 根据id获取职工信息
     *
     * @param id
     * @return
     */
    Employee getEmployeeById(Integer id);


    /**
     * 更新员工信息
     * @param employee
     */
    void update(Employee employee);
}
