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
	 * ������
	 * proxy  ���������
	 * method  ���������ķ���
	 * args �����Ĳ���
	 * 
	 * ����ֵ��
	 * Object  �����ķ���ֵ
	 * */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("������־��ʼ....");
		method.invoke(target);
		System.out.println("������־����....  ");
		return null;
	}
}
