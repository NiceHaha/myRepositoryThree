package com.entry;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonManagedReference;

//多对一的  一
public class Department implements Serializable{
	private int id;
	private String name;
	private Set<Employee> employees = new HashSet<>();
	
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
	@JsonManagedReference
	public Set<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", employees=" + employees + "]";
	}
}
