package com.peng.test09;

import java.util.Scanner;;

public class demo1 {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("输入十进制");
		Integer integer = sc.nextInt();
		String binaryString = Integer.toBinaryString(integer);
		String octalString = Integer.toOctalString(integer);
		String hexString = Integer.toHexString(integer);
		System.out.println("i的二进制："+binaryString);
		System.out.println("i的八进制："+octalString);
		System.out.println("i的十六进制："+hexString);
		System.out.println("输入进制数：");
		Integer jInteger = sc.nextInt();
		int t = Integer.parseInt(String.valueOf(jInteger),2);
		int b = Integer.parseInt(String.valueOf(jInteger),8);
		int s = Integer.parseInt(String.valueOf(jInteger),16);
		System.out.println("j的十进制："+t);
		System.out.println("j的十进制："+b);
		System.out.println("j的十进制："+s);
		sc.close();	
	}

}
