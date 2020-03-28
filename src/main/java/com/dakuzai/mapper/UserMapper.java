package com.dakuzai.mapper;

import com.dakuzai.pojo.Department;
import com.dakuzai.pojo.User;
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
public interface UserMapper {
    /**
     * 获取用户信息
     * @return
     */
    List<User> getUsers();

    /**
     * 根据id获取用户信息
     * @param id
     * @return
     */
    User getUserById(String id);

    /**
     * login:登录
     * @param username
     * @param password
     * @return
     */
    List<User> getUserByNameAndPassword(String username,String password);

    /**
     * register: 注册
     * @param user
     */
    void register(User user);

}
