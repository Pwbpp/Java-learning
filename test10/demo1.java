package com.peng.test10;

public class demo1 {
	public static void main(String args[]) {
		demo2 d1 = new demo2();
		 
        System.out.println("================");
 
        demo2 student1 = new demo2("石头", 23);
 
        System.out.println("=================");
 
        student1.setNameString("王瓜娃");
        student1.setAge(23);
 
        System.out.println("我是"+student1.getNameString()+"，年龄是"+student1.getAge());
 
         student1.setAge(21);
        System.out.println("我是"+student1.getNameString()+"，年龄是"+student1.getAge());
	}
}
