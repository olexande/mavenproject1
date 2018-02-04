package com.mycompany.mavenproject1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.mycompany.mavenproject1.model.Employee;
import com.mycompany.mavenproject1.service.EmployeeService;
import com.mycompany.mavenproject1.dao.EmployeeDao;
import com.mycompany.mavenproject1.controller.EmployeeController;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/listEmployee", method = RequestMethod.GET)
    public @ResponseBody
    List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();

    }

    @RequestMapping(value = "/validateEmployee", method = RequestMethod.GET)
    public ModelAndView validateEmployee() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("employeeFromServer", new Employee());
        modelAndView.setViewName("employees_check_page");
        return modelAndView;
    }

    @RequestMapping(value = "/checkEmployee", method = RequestMethod.POST)
    public @ResponseBody
    String checkEmployee(@ModelAttribute("employeeFromServer") Employee employee) {
        if ("admin".equals(employee.getName()) && "admin".equals(employee.getPassword())) {
            return "valid";
        }
        return "invalid";
    }
}
