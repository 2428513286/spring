package com.lon.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		/*
		UserDao dao = (UserDao)ac.getBean("userDao2");
		dao.add();
		dao.delete();
		dao.update();
		dao.query();*/
		
		StudentDao dao = (StudentDao)ac.getBean("studentDao");
		dao.add();
		
		
		
	}
}
