package com.lon.cglibproxy;

public class CGLIBProxyTest {

	public static void main(String[] args) {
		
	/*	CGLIBProxy  c= new CGLIBProxy();
		UserDao dao = (UserDao)c.createProxyInstance(new UserDaoImpl());
		dao.add();
		dao.delete();
		dao.update();
		dao.query();
		*/
		
		CGLIBProxy c = new CGLIBProxy();
		UserDaoImpl2 dao = (UserDaoImpl2)c.createProxyInstance(new UserDaoImpl2());
		dao.add();
		dao.delete();
		dao.update();
		dao.query();
		
		
	}
}
