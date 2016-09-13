package agent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class pro_test {
	/**
	 * JDK动态代理测试类
	 */
	  public static void main(String[] args) {
	
		movable car = new Car();
		InvocationHandler h1=new mypro_start(car);
		Class<?> cls = car.getClass();
		/**
		 * loader  类加载器
		 * interfaces  实现接口
		 * h InvocationHandler
		 */
		movable m = (movable)Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(), h1);
		mypro_log h = new mypro_log(m);
		movable m1=(movable)Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(), h);
		m1.move();
	  }
}
