package com.topview.www.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;

import org.springframework.stereotype.Component;

import com.topview.www.demo.impl.HelloWorldImpl;
import com.topview.www.entity.Role;
import com.topview.www.entity.User;

/*
 * ��Ҫ��¶�ķ����������@Component(name) name Ϊspring�ӹܵ�����
 */
@Component("HelloWorldImpl")
@WebService
public class HelloWorld implements HelloWorldImpl {

	
	
	
	public HelloWorld() {
		System.out.println("helloworld�Ĺ��췽��ִ�С�������");
	}

	public String say(String str) {
		return "hello:"+str;
	}

	public List<Role> getRoleByUser(User user) {
		List<Role> roleList = new ArrayList<Role>();
		if(user!=null) {
			if(user.getUserName().equals("java")&&user.getPassword().equals("123456")) {
				roleList.add(new Role(1,"�����ܼ�"));
				roleList.add(new Role(2,"�ܹ�ʦ"));
			} else if(user.getUserName().equals("jack")&&user.getPassword().equals("123456")) {
				roleList.add(new Role(3,"����Ա"));
			} else {
				roleList = null;
			}
		}
		return roleList;
	}

	public Map<String, List<Role>> getRole() {
		Map<String,List<Role>> map = new HashMap<String,List<Role>>();
		List<Role> roleList1 = new ArrayList<Role>();
		roleList1.add(new Role(1,"�����ܼ�"));
		roleList1.add(new Role(2,"�ܹ�ʦ"));
		map.put("java", roleList1);
		
//		List<Role> roleList2 = new ArrayList<Role>();
//		roleList2.add(new Role(3,"����Ա"));
//		map.put("jack", roleList2);
		return map;
	}

}
