package com.dakuzai;

import com.dakuzai.mapper.UserMapper;
import com.dakuzai.pojo.Employee;
import com.dakuzai.pojo.User;
import com.dakuzai.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringBootDataStudyApplicationTests {
    @Autowired
    EmployeeService employeeService;
    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {
        User user = new User();
        user.setUsername("dakuzai");
        user.setPassword("123456");
        userMapper.register(user);
    }

    @Test
    public void login(){

    }
    @Test
    public void getEmployees() {
        List<Employee> employeeList = employeeService.getEmployees();
        employeeList.forEach(employee -> {
            System.out.println(employee.getLastName());
        });

    }

}
