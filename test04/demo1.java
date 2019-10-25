package com.peng.test04;
public class demo1 extends Thread{

	private int count =10;
	@Override
	public void run() {
		while(true) {
			System.out.println("run: "+count+" ");
			if(--count == 0)
				return;
		}
	}
	
	public static void main(String[] args) {
		demo1 d = new demo1();
		d.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("main: "+i);
		}

	}

}
