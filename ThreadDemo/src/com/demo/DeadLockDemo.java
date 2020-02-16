package com.demo;

public class DeadLockDemo {

	public static Object lock1=  new Object();
	
	public static Object lock2=  new Object();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       MyThread1 t1= new MyThread1();
       MyThread2 t2= new MyThread2();
       t1.start();
       t2.start();
		
	}
	
	static class MyThread1 extends Thread{

		@Override
		public void run() {
			synchronized(lock2) {
				try {
					System.out.println("object lock1 locked by  "+Thread.currentThread());
					Thread.sleep(3000);
					
					System.out.println("waiting for lock2 to release"+Thread.currentThread());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
			synchronized(lock1){
				try {
					System.out.println("object lock2 locked by  "+Thread.currentThread());
					Thread.sleep(300);
					
					System.out.println("waiting for lock1 to release"+Thread.currentThread());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
			// TODO Auto-generated method stub
			
		}
		
	}
	
	
	static class MyThread2 extends Thread{

		@Override
		public void run() {
			synchronized(lock1) {
				try {
					System.out.println("object lock2 locked by  "+Thread.currentThread());
					Thread.sleep(300);
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
			synchronized(lock2){
				try {
					System.out.println("object lock1 locked by  "+Thread.currentThread());
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
			// TODO Auto-generated method stub
			
		}
		
	}

}
