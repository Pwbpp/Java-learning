package com.peng.test04;

public class demo2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Mythread m1 = new Mythread();
//		m1.start();
		
		System.out.println("主线程ID:"+Thread.currentThread().getId());
        Mythread thread1 = new Mythread("thread1");
        thread1.start();
        Mythread thread2 = new Mythread("thread2");
        thread2.run();
	}

}

class Mythread extends Thread{
	
	private static int num = 0;
	private String name;
	
	public Mythread(String name) {
		this.name = name;
	}
	
	public Mythread() {
		num++;
	}
	@Override
	public void run() {
		System.out.println("name: "+name+"  子线程ID:"+Thread.currentThread().getId()+" number of: "+num);
		
	}
}
//说明新线程创建的过程不会阻塞主线程的后续执行。