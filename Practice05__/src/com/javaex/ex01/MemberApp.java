package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {

		Member m1 = new Member();
		m1.setId("jws");
		m1.setName("정우성");
		m1.setPoint("50000점");
		m1.showInfo();
		
		Member m2 = new Member();
		m2.setId("yjs");
		m2.setName("유재석");
		m2.setPoint("30000점");
		m2.showInfo();
		
		Member m3 = new Member();
		m3.setId("lhr");
		m3.setName("이효리");
		m3.setPoint("40000점");
		m3.showInfo();
	}

}
