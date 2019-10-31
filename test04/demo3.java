package com.peng.test04;

import java.util.concurrent.*;

public class demo3 {
	public static void main(String args[]) {	
		
		Executor executor = Executors.newFixedThreadPool(10);  
		Runnable task = new Runnable() {  
		    @Override  
		    public void run() {  
		        System.out.println("task over");  
		    }  
		};
		
		executor.execute(task);
		  
		executor = Executors.newScheduledThreadPool(10);  
		ScheduledExecutorService scheduler = (ScheduledExecutorService) executor;  
		scheduler.scheduleAtFixedRate(task, 10, 10, TimeUnit.SECONDS);  //执行task,首次执行时间为10,执行周期为10,时间单位为秒。
		
	}
}
