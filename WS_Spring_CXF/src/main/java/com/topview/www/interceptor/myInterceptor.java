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
		super(Phase.PRE_INVOKE); //�ڵ��÷���֮ǰ�����Զ�������  Phase.PRE_INVOKE
	}

	public void handleMessage(SoapMessage message) throws Fault {
		System.out.println("�����ҵ��������Ĵ������------");
		List<Header> headers = message.getHeaders();  //��ȡͷ��Ϣ
		if(headers==null && headers.size()==0) {
			throw new Fault(new IllegalArgumentException("û��Headers,������ʵʩ����"));
		}
		Header firstHeader = headers.get(0);
		Element ele = (Element)firstHeader.getObject();
		NodeList uList = ele.getElementsByTagName("userName");
		NodeList pList = ele.getElementsByTagName("password");
		if(uList.getLength()!=1) {
			throw new Fault(new IllegalArgumentException("�û�����ʽ����"));
		}
		if(pList.getLength()!=1) {
			throw new Fault(new IllegalArgumentException("�����ʽ����"));
		}
		String userName = uList.item(0).getTextContent();
		String password = pList.item(0).getTextContent();
		if(!userName.equals("java") || !password.equals("123456")) {
			throw new Fault(new IllegalArgumentException("�û��������������"));
		}
	}

}
