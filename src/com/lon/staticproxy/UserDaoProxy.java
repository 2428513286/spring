package com.lon.staticproxy;

public class UserDaoProxy implements UserDao{

	private UserDao userDao;

	
	public UserDaoProxy(UserDao userDao) {
		this.userDao = userDao;
	}
	
	
	@Override
	public void add() {
		System.out.println("用户权限校验");
		userDao.add();
		System.out.println("日志保存");
	}

	@Override
	public void delete() {
		System.out.println("用户权限校验");
		userDao.delete();
		System.out.println("日志保存");
	}
	
	
}
