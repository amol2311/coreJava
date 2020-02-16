package com.test.waitnotify;

public class Consumer implements Runnable{
    private Message msg;
    
    public Consumer(Message m) {
   	 this.msg=m;
    }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			//just to make sure producer reaches wait()
			Thread.sleep(4000);
			synchronized(msg) {
				System.out.println("Consumer thread :"+Thread.currentThread().getName()+" is started");
				msg.notifyAll();
				System.out.println("Consumer thread :"+Thread.currentThread().getName()+" notified");
			}
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
}
