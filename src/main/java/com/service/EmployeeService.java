package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.EmployeeDao;
import com.entry.Employee;

@Transactional
@Service
public class EmployeeService {
	@Autowired
	private EmployeeDao employeeDao;
	
	public List<Employee> query() {
		List<Employee> employees = employeeDao.query();
		return employees;
	}
}
