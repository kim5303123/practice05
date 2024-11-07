package com.javaex.ex01;

public class Member {
	
	private String id;
	private String name;
	private String point;
	
	
	public String getId() {
		
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPoint() {
		return point;
	}
	
	public void setPoint(String point) {
		this.point = point;
	}
	
	
	public void showInfo() {
		System.out.printf("회원정보: %s(%s), %s%n",name,id,point);
	}
	
}
