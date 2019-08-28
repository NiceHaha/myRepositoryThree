package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entry.Employee;
import com.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/index")
	public String testIndex() {
		return "index";
	}
	
	@ResponseBody
	@RequestMapping("/employees")
	public List<Employee> query() {
		List<Employee> employees = employeeService.query();
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		return employees;
	}
}
//我现在在Github，我在这里修改了一句话，Look me!
//我是github 
//我在eclipse修改，哈哈哈
