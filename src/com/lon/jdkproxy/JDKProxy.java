package com.lon.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxy implements InvocationHandler{
	
	private Object targetObject;
	
	
	public Object createProxyInstance(Object targetObject){
		this.targetObject = targetObject;
		/*
		* 第一个参数设置代码使用的类装载器,一般采用跟目标类相同的类装载器
		* 第二个参数设置代理类实现的接口
		* 第三个参数设置回调对象,当代理对象的方法被调用时,会委派给该参数指定对象的invoke方法
		*/
		return Proxy.newProxyInstance(this.targetObject.getClass().getClassLoader(),
				this.targetObject.getClass().getInterfaces(), this);
	}

	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if(!method.getName().equals("query")) {
			System.out.println("用户权限校验");
		}
		
		//通过反射调用对象方法，接收返回值
		Object result = method.invoke(this.targetObject, args);
		System.out.println("保存日志");
		return result;
	}
/*
	public Object invoke(Object proxy,Method method,Object[] args) throws Throwable{
		if(!method.getName().equals("query")) {
			System.out.println("用户权限校验");
		}
		Object reslut = method.invoke(this.targetObject, args);
		System.out.println("保存日志");
		return result;
		
	};*/
	
}
