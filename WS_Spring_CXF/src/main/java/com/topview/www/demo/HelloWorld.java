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
 * 在要暴露的服务类上添加@Component(name) name 为spring接管的名字
 */
@Component("HelloWorldImpl")
@WebService
public class HelloWorld implements HelloWorldImpl {

	
	
	
	public HelloWorld() {
		System.out.println("helloworld的构造方法执行。。。。");
	}

	public String say(String str) {
		return "hello:"+str;
	}

	public List<Role> getRoleByUser(User user) {
		List<Role> roleList = new ArrayList<Role>();
		if(user!=null) {
			if(user.getUserName().equals("java")&&user.getPassword().equals("123456")) {
				roleList.add(new Role(1,"技术总监"));
				roleList.add(new Role(2,"架构师"));
			} else if(user.getUserName().equals("jack")&&user.getPassword().equals("123456")) {
				roleList.add(new Role(3,"程序员"));
			} else {
				roleList = null;
			}
		}
		return roleList;
	}

	public Map<String, List<Role>> getRole() {
		Map<String,List<Role>> map = new HashMap<String,List<Role>>();
		List<Role> roleList1 = new ArrayList<Role>();
		roleList1.add(new Role(1,"技术总监"));
		roleList1.add(new Role(2,"架构师"));
		map.put("java", roleList1);
		
//		List<Role> roleList2 = new ArrayList<Role>();
//		roleList2.add(new Role(3,"程序员"));
//		map.put("jack", roleList2);
		return map;
	}

}
