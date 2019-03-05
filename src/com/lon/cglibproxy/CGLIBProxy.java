package com.lon.cglibproxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CGLIBProxy implements MethodInterceptor{

	//要代理的目标对象
	private Object targetObject;

	public Object createProxyInstance(Object targetObject){
		this.targetObject = targetObject;
		Enhancer enhancer = new Enhancer();//该类用于生成代理对象
		enhancer.setSuperclass(this.targetObject.getClass());//设置父类
		enhancer.setCallback(this);//设置回调用对象为本身
		return enhancer.create();
	}
	public Object intercept(Object proxy, Method method, Object[] args,
			MethodProxy methodProxy) throws Throwable {
		if(!method.getName().equals("query")) {
			System.out.println("用户权限校验");
		}
		Object result =  methodProxy.invoke(this.targetObject, args);
		System.out.println("保存日志");
		return result;
	}
}

	
