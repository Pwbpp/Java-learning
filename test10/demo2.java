package com.peng.test10;

public class demo2 {

	private String nameString;
	private int age;
	
	public demo2() {
		System.out.println("无参构造");
	}
	
	public demo2(String nameString,int age) {
		System.out.println("有参构造 数据： "+ nameString+"  "+age);
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
