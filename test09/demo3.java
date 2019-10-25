package com.peng.test09;

public class demo3 {
	private static int puta(int i) {
		if(i==0) {
			return 1;
		}else {
			return puta(i-1)+i;
		}
	}
	public static void main(String args[]) {
		int a[] = new int[20];
		for (int i = 0; i < a.length; i++) {
			a[i]=puta(i);
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(" "+a[i]+"\t");
		}
	}
}
//1，2，4，7，11，（    ），22，（    ）。