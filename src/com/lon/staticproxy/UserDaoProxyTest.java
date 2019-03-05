package com.lon.staticproxy;

public class UserDaoProxyTest {

	public static void main(String[] args) {
		UserDaoProxy u = new UserDaoProxy(new UserDaoImpl());
		u.add();
		u.delete();
		
	}
}
