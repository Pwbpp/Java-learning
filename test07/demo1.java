package com.peng.test07;

public class demo1 {

	public static void main(String[] args) {
		A a = new A();
		C c = new C();
		a.depend1(new B());
		a.depend2(new B());
		System.out.println("--------------");
		c.depend1(new D());
		c.depend2(new D());
	}

}
