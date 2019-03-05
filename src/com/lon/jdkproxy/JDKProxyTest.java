package com.lon.jdkproxy;

public class JDKProxyTest {

	public static void main(String[] args) {
		/*
		JDKProxy p = new JDKProxy();
		UserDao dao = (UserDao)p.createProxyInstance(new UserDaoImpl());
		dao.add();
		dao.delete();
		dao.update();
		dao.query();
		*/
		
		
		//JDK动态代理的目标对象必须实现接口
		JDKProxy p = new JDKProxy();
		UserDaoImpl2 dao = (UserDaoImpl2)p.createProxyInstance(new UserDaoImpl2());
		dao.add();
		dao.delete();
		dao.update();
		dao.query();
		
	}
}
