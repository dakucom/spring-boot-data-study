package com.dakuzai.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: spring-boot-data-study
 * @description: 用户表
 * @author: dakuzai
 * @create: 2020-03-26 21:51
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String username;
    private String password;
}
