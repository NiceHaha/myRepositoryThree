package com.entry;

import java.io.Serializable;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

//多对一的  多
public class Employee implements Serializable{
	private int id;
	private String name;
	private int age;
	private Department department;
	
	public Employee() {
		super();
	}
	public Employee(String name,Department department) {
		this.name = name;
		this.department = department;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Department getDepartment() {
		return department;
	}
	
	@JsonBackReference 
	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", department=" + department + "]";
	}
}
