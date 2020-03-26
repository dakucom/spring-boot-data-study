package com.dakuzai.mapper;

import com.dakuzai.pojo.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: spring-boot-mybatis-scaffold
 * @description: 部门映射类
 * @author: dakuzai
 * @create: 2020-03-23 13:34
 */
@Mapper
@Repository
public interface DepartmentMapper {
    /**
     * 获取部门信息
     * @return
     */
    List<Department> getDepartments();

    /**
     * 根据id获取部门信息
     * @param id
     * @return
     */
    Department getDepartmentById(Integer id);

}
