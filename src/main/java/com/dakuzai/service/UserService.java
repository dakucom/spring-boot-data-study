package com.dakuzai.service;

import com.dakuzai.mapper.EmployeeMapper;
import com.dakuzai.mapper.UserMapper;
import com.dakuzai.pojo.Employee;
import com.dakuzai.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: spring-boot-data-study
 * @description: 用户逻辑层
 * @author: dakuzai
 * @create: 2020-03-26 20:02
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public List<User> getUserByNameAndPassword(String username,String password){
        return userMapper.getUserByNameAndPassword(username,password);
    }
}
