package com.peng.test02;

public class demo02 {
	
	public static void main(String[] args) {
	
	int arr2[][] = {{1,23,3},{45,6,8}};
	System.out.println("数组元素：");
	for(int x[]:arr2) {
		for(int e:x) {//foreach语句简化便利操作
			if(e==x.length) {
				System.out.println(e);
			}else {
				System.out.println(e+"、");
			}
		}
	}
	}
	
}
