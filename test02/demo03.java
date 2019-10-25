package com.peng.test02;

import java.util.Arrays;

public class demo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int [5];
		for (int S = 0; S < arr.length; S++) {
			System.out.println("di"+S+"yuansu is "+arr[S]);
		}
		Arrays.fill(arr, 8);
		for (int S = 0; S < arr.length; S++) {
			System.out.println("di"+S+"yuansu is "+arr[S]);
		}
		
	}

}
