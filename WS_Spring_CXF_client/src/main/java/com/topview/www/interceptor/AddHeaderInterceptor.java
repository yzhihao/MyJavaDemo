package com.topview.www.interceptor;

import java.util.List;

import javax.xml.namespace.QName;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.helpers.DOMUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.interceptor.Interceptor;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class AddHeaderInterceptor extends AbstractPhaseInterceptor<SoapMessage> {

	private String userName;
	private String password;
	
	
	public AddHeaderInterceptor(String userName,String password) {
		super(Phase.PREPARE_SEND);   //准备发送soap消息的时候调用拦截器
		this.userName=userName;
		this.password=password;
		System.out.println("AddHeaderInterceptor.....");
	}

	
	/*
	 * <Envelope>
	 * 	<head>
	 * 		<authHeader>
	 * 			<name>....</name>
	 * 			<password>....</password>
	 * 		</authHeader>
	 * 	</head>
	 * 	<Body>
	 * 		<sayHello>
	 * 			<arg0>...</arg0>
	 * 		</sayHello>
	 * 	</Body>
	 * </Envelope>
	 */
	
	public void handleMessage(SoapMessage message) throws Fault {
		List<Header> headerList = message.getHeaders();			//请求头
		
		Document doc = DOMUtils.createDocument();				//创建document文件
		Element ele = doc.createElement("authHeader");			//创建
		Element uElement = doc.createElement("userName");
		uElement.setTextContent(userName);
		Element pElement = doc.createElement("password");
		pElement.setTextContent(password);
		ele.appendChild(pElement);
		ele.appendChild(uElement);
		headerList.add(new Header(new QName("authHeader"),ele));	//
	}
	
}
