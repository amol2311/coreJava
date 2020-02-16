package com.demo;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ThreadBasicDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1 extends Thread
		/*MyThread t =  new MyThread();
		t.start();*/
		MyThread1 r =  new MyThread1();
	    Thread t =  new Thread(r);
	    t.start();
	    
		System.out.println("inside main");
	}
	
	
	

}
//1 extends Thread
class MyThread extends Thread{
	
	public void run() {
		System.out.println("inside run...");
	}
}

//1 extends Thread
class MyThread1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			//Thread.sleep(3000);
			TimeUnit.SECONDS.sleep(4);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("inside run...");
	}
	
	/*public void run() {
		System.out.println("inside run...");
	}*/
}