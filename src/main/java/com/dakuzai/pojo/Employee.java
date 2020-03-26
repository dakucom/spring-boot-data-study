package com.dakuzai.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @program: spring-boot-mybatis-scaffold
 * @description: 员工类
 * @author: dakuzai
 * @create: 2020-03-23 13:29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private Integer id;
    private String lastName;
    private String email;
    /**
     * 性别 1-man 0-woman
     */
    private Integer gender;
    /**
     * 部门使用id来表示，真是情况是一个类
     */
    private Integer department;
    private Date birth;
    /**
     * 大厂不允许我们用联表查询，我们需要设计冗余字段
     */
    private Department eDepartment;
}
