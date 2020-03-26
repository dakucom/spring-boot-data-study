package com.dakuzai.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: spring-boot-mybatis-scaffold
 * @description: 部门类
 * @author: dakuzai
 * @create: 2020-03-23 13:15
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    private Integer id;
    private String departmentName;
}
