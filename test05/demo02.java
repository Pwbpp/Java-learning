package com.peng.test05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class demo02{
	public static void main(String args[]) {
		File desFile = new File("dest.txt");
		OutputStream oStream= null;
		try {
			oStream = new FileOutputStream(desFile,true);
			String msdString = "wjdoaisjd";
			byte[] d = msdString.getBytes();
			oStream.write(d,0,d.length);
			oStream.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				oStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}