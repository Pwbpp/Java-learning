package com.peng.test09;

public class demo2 {
	private static int getRe(int n) {
		if(n==0||n==1) {
			return 2;
		}else return getRe(n-2)+getRe(n-1);
	}
	public static void main(String args[]) {
		int a[] = new int[20];
		for(int i = 0 ; i<20;i++) {
			a[i] = getRe(i);
		}
		System.out.println("数组是:");
		for(int i = 0;i<a.length;i++) {
			System.out.println(a[i]+"\t");
		}
	}
}
