package com.lon.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 
 * @author Administrator
 *@Aspect 该注解定义该类是一个切面，切面中包含各种通知（方法）
 *
 */
@Aspect
public class Aop {

	
	/**
	 * @Pointcut("execution(* com.lon.aop.UserDaoImpl.*(..))")定义切入点表达式,符合表达式的方法都是切入点，切入点名称pointcut（）
	 * 表达式说明：com.lon.aop.UserDaoImpl类中的所有方法（任意参数，任意返回值）
	 * 
	 */
	@Pointcut("execution(* com.lon.aop.*.*(..))")
	public void pointcut() {}
	
	/**
	 * @Before 前置通知，在切入点pointcut()之前插入
	 */
	@Before("pointcut()")
	public void check() {
		System.out.println("用户权限校验");
	}
	
	/**
	 * @After 后置通知，在切入点pointcut()之后插入
	 */
	@After("pointcut()")
	public void saveLog() {
		System.out.println("保存日志");
	}
}
