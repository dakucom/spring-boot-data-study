package com.dakuzai.controller;

import com.dakuzai.mapper.DepartmentMapper;
import com.dakuzai.mapper.EmployeeMapper;
import com.dakuzai.pojo.Department;
import com.dakuzai.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeMapper employeeMapper;
    @Autowired
    DepartmentMapper departmentMapper;

    @GetMapping("/emps")
    public String list(Model model){
        List<Employee> employees = employeeMapper.getEmployees();
        model.addAttribute("emps",employees);
        return "emp/list";
    }

    @GetMapping("/emp")
    public String toAddPage(Model model) {
        // 应该要携带部门的数据信息
        List<Department> departments = departmentMapper.getDepartments();
        model.addAttribute("departments", departments);
        return "emp/add";
    }

    @PostMapping("/emp")
    public String addEmp(Employee employee){
        // TODO : 添加员工的逻辑
        System.out.println(employee);
        employeeMapper.saveEmployee(employee);
        // 添加完毕后应该返回首页，重定向url会变化，请求转发url不会变化
        return "redirect:/emps";
    }

    // 跳转到员工修改页面
    @GetMapping("/emp/{id}")
    public String toUpdateEmp(@PathVariable("id") Integer id,Model model){
        // 回显出用户的信息
        Employee employee = employeeMapper.getEmployeeById(id);
        model.addAttribute("employee",employee);
        // 应该要携带部门的数据信息
        List<Department> departments = departmentMapper.getDepartments();
        model.addAttribute("departments", departments);
        return "emp/update";
    }

    @PostMapping("/updateEmp")
    public String updateEmp(Employee employee){
        System.out.println(employee);
        employeeMapper.update(employee);
        return "redirect:/emps";
    }

    // 删除
    @GetMapping("/delEmp/{id}")
    public String delEmp(@PathVariable("id") Integer id){
        employeeMapper.deleteEmployeeById(id);
        return "redirect:/emps";
    }

}



