package com.peng.test03;
//直接选择排
public class demo2 {
	
	public void sort(int[] arry) {
		
		int index;
		for (int i = 0; i < arry.length; i++) {
			index=0;
			for (int j = 1; j < arry.length-i; j++) {
				if(arry[j]>arry[index])
					index=j;
			}
			int temp=arry[arry.length-i];
			arry[arry.length-i]=arry[index];
			arry[index]=temp;
		}
//		showArray(array);
	}
	
	public static void main(String[] args) {
		
	}
}
