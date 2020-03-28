package com.dakuzai.controller;

import com.dakuzai.pojo.User;
import com.dakuzai.service.EmployeeService;
import com.dakuzai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @program: spring-boot-data-study
 * @description: 登录
 * @author: dakuzai
 * @create: 2020-03-26 19:18
 */
@Controller
public class LoginController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private UserService userService;

    @PostMapping("/user/login")
    public String login(@RequestParam(value = "username", required = false) String username,
                        @RequestParam(value = "password", required = false) String password,
                        Model model, HttpSession session) {
        System.out.println("=====" + username);
        List<User> userList = userService.getUserByNameAndPassword(username, password);
        if (!userList.isEmpty()) {
            session.setAttribute("loginUser", username);
            return "redirect:/main.html";
        } else {
            model.addAttribute("msg", "用户名和密码错误");
            return "login";
        }
    }

    /**
     *  注销请求
     * @param session
     * @return
     */
    @GetMapping("/user/loginOut")
    public String loginOut(HttpSession session){
        session.invalidate();
        return "login";
    }
}
