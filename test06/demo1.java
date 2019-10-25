package com.peng.test06;

public class demo1 implements Runnable{
	
	private Integer costInteger = Integer.valueOf(30);
	
	
	private static String winner;
	
	@Override
	public void run() {
		for(int steeps=1;steeps<=100;steeps++) {
			if(Thread.currentThread().getName().equals("rubbit")&&steeps%10==0)
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			System.out.println(Thread.currentThread().getName()+"-->"+steeps);
			boolean flag = gameOver(steeps);
			if(flag) {
				break;
			}
		}
		
	}
	
	private boolean gameOver(int steeps) {
		if(winner!=null) {
			return true;
		}else {
			if(steeps==100) {
				winner=Thread.currentThread().getName();
				System.out.println("winner==>"+winner);
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		demo1 racer = new demo1();
		new Thread(racer,"tortoise").start();
		new Thread(racer,"rabbit").start();

	}

	
}
