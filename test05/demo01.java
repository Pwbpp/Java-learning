package com.peng.test05;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class demo01{
	
	public static void main(String[] args) {
		File file = new File("tet1.txt");
		InputStream is = null;
		try {
			is = new FileInputStream(file);
			int temp;
			while((temp=is.read())!=-1) {
				System.out.println((char)temp);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
	
}