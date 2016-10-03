package com.topview.www.demo.impl;

import java.util.List;
import java.util.Map;

import javax.jws.WebService;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.springframework.stereotype.Component;

import com.topview.www.adapter.MapAdapter;
import com.topview.www.entity.Role;
import com.topview.www.entity.User;

@WebService
public interface HelloWorldImpl {
	public String say(String str);
	
	public List<Role> getRoleByUser(User user);
	
	
	@XmlJavaTypeAdapter(MapAdapter.class)
	public Map<String,List<Role>> getRole();
}
