package com.topview.www.demo.impl;

import javax.xml.ws.Endpoint;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import com.topview.www.demo.HelloWorld;
import com.topview.www.interceptor.myInterceptor;

public class Server {
//	public static void main(String[] args) {
//		System.out.println("web service start");
//		HelloWorldImpl implementor = new HelloWorld();
//		String address = "http://localhost:9995/HelloWorldImpl";
//		//Endpoint.publish(address, implementor);
//		JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();
//		factoryBean.setAddress(address);
//		factoryBean.setServiceClass(HelloWorldImpl.class);	//ʵ�����������
//		factoryBean.setServiceBean(implementor);			//ʵ����
//		factoryBean.getInInterceptors().add(new LoggingInInterceptor());	//����������
//		factoryBean.getOutInterceptors().add(new LoggingOutInterceptor());	//����������
//		
//		factoryBean.getInInterceptors().add(new myInterceptor());
//		factoryBean.create();								//����webService
//		System.out.println("web service started");
//	}
}
