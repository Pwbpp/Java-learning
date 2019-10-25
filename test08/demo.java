package com.peng.test08;

public class demo {

	public static void main(String[] args) {
		System.out.println("父类");
		A a = new A();
		a.fun(1, 2);
		System.out.println("zi类");
		B b = new B();
		b.fun(1, 2);
		A c = new A();
		c.fun(2, 1);
	}
}
