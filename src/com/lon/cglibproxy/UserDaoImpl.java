package com.lon.cglibproxy;

public class UserDaoImpl implements UserDao{

	@Override
	public void add() {
		System.out.println("新增用户");
	}

	@Override
	public void delete() {
		System.out.println("删除用户");
	}

	@Override
	public void update() {
		System.out.println("更新用户");
		
	}

	@Override
	public void query() {
		System.out.println("查询用户");
		
	}

	
}
