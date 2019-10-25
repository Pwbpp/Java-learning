package com.peng.test03;

import java.util.Scanner;
//冒泡
public class demo1 {
	public static void main(String[] args) {
		int[] arry= new int[5];
		Scanner scanner= new Scanner(System.in);
		for (int i = 0; i < arry.length; i++) {
			arry[i] = scanner.nextInt();
		}
		
		demo1 d=new demo1();
		d.sort(arry);
		
	}
	
	public void sort(int[] arry) {
		for (int i = 1; i < arry.length; i++) {
			for (int j = 0; j < arry.length-i; j++) {
				if (arry[j]<arry[j+1]) {
					int temp = arry[j];
					arry[j] = arry[j+1];
					arry[j+1] = temp;
				}
			}
		}
		showsort(arry);
	}
	
	public void showsort(int[] arry) {
		for(int i: arry) {
			System.out.println(">"+i);
		}
	}
}
