package com.lon.staticproxy;

public class UserDaoImpl implements UserDao{

	@Override
	public void add() {
		System.out.println("新增用户");
	}

	@Override
	public void delete() {
		System.out.println("删除用户");
	}

	
}
