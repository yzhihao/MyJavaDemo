package com.topview.www.interceptor;

import java.util.List;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class myInterceptor extends AbstractPhaseInterceptor<SoapMessage> {

	public myInterceptor() {
		super(Phase.PRE_INVOKE); //在调用方法之前调用自定拦截器  Phase.PRE_INVOKE
	}

	public void handleMessage(SoapMessage message) throws Fault {
		System.out.println("进入我的拦截器的处理代码------");
		List<Header> headers = message.getHeaders();  //获取头信息
		if(headers==null && headers.size()==0) {
			throw new Fault(new IllegalArgumentException("没有Headers,拦截器实施拦截"));
		}
		Header firstHeader = headers.get(0);
		Element ele = (Element)firstHeader.getObject();
		NodeList uList = ele.getElementsByTagName("userName");
		NodeList pList = ele.getElementsByTagName("password");
		if(uList.getLength()!=1) {
			throw new Fault(new IllegalArgumentException("用户名格式不对"));
		}
		if(pList.getLength()!=1) {
			throw new Fault(new IllegalArgumentException("密码格式不对"));
		}
		String userName = uList.item(0).getTextContent();
		String password = pList.item(0).getTextContent();
		if(!userName.equals("java") || !password.equals("123456")) {
			throw new Fault(new IllegalArgumentException("用户名或者密码错误"));
		}
	}

}
