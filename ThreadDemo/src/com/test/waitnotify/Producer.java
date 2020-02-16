package com.test.waitnotify;

public class Producer implements Runnable{
     private Message msg;
     
     public Producer(Message m) {
    	 this.msg=m;
     }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		synchronized(msg) {
			try {
				System.out.println("Producer thread :"+Thread.currentThread().getName()+" is waiting for consumer");
				msg.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Producer thread :"+Thread.currentThread().getName()+" released");
		}
	}
	
}
