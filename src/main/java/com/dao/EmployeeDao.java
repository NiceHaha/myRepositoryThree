package com.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entry.Employee;

@Repository
public class EmployeeDao {
	private Session session;
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession() {
		//return sessionFactory.openSession();//获取会话对象每一次都产生一个新的会话对象，使用完毕需要手动关闭。会有连接池饱和问题
		return sessionFactory.getCurrentSession();//获取上下文的一个会话对象，有旧的就用旧的，没有旧的就创建一个新的，不需要手动关闭，需要在cfg.xml中配置session的生命周期
	}
	
	public List<Employee> query() {
		Criteria criteria = getSession().createCriteria(Employee.class);
		List<Employee> employees = criteria.list();
		return employees;
	}
}
