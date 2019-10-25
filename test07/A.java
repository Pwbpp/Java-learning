package com.peng.test07;

public class A {
	public void depend1(method1 m) {
		m.meth1();
	}
	public void depend2(method23 m) {
		m.meth2();
		m.meth3();
	}
}
