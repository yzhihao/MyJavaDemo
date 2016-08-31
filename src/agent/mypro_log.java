package agent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class mypro_log implements InvocationHandler{
	public Object target;
	
	public mypro_log(Object target) {
		super();
		this.target = target;
	}
	

	/*
	 * 参数：
	 * proxy  被代理对象
	 * method  被代理对象的方法
	 * args 方法的参数
	 * 
	 * 返回值：
	 * Object  方法的返回值
	 * */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("汽车日志开始....");
		method.invoke(target);
		System.out.println("汽车日志结束....  ");
		return null;
	}
}
