package com.topview.www.entity;

import java.util.List;

/*
 * 自定义实体 cxf能接受
 * 
 */
public class MyRole {
	private String key;
	private List<Role> value;
	public MyRole() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MyRole(String key, List<Role> value) {
		super();
		this.key = key;
		this.value = value;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public List<Role> getValue() {
		return value;
	}
	public void setValue(List<Role> value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "MyRole [key=" + key + ", value=" + value + "]";
	}
	
}
