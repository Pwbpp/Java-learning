package com.peng.test02;

import java.util.Date;

public class demo1 {
	
	public static void main(String[] args) {
		/*
//		int i = 8;
//		int a = 7;
//		System.out.println(i&a);
//		char b[]= {'a','s','d','t','g'};
//		String s = new String(b,2,4);
//		
		String aString= "             i wase time to looking book!             ";
//		int size = aString.length();
		
		int size;
		int lastS;
		size=aString.indexOf('t');
		lastS = aString.lastIndexOf('t');
//		System.out.println(size);
//		System.out.println(lastS);
//		System.out.println(lastS-size-1);
//		
		char s = aString.charAt(4);
//		System.out.println(s);
		
		String aString2="hello";
		String cString=aString2.substring(1, 3);
//		System.out.println(aString+"asd");
		
//		System.out.println(aString.trim()+"asd");
		aString.toString();
		
		String dString=new String("asd,qwe,ert,asd,dsrg,zxv,");
		String[] eStrings=dString.split(",", 5);
		for(int i=0;i<eStrings.length;i++) {
			System.out.println(eStrings[i]);
		}
		*/
		Date date = new Date();
		String  s = String.format("%tc", date);
		System.out.println(date);
		
	}

}
