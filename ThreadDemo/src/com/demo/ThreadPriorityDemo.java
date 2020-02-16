package com.demo;

public class ThreadPriorityDemo {
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		
		Thread sendEmail = new Thread(new SendEmail());
		Thread dataProcessor = new Thread(new DataProcessor());
		
		sendEmail.setName("SendEmail");
		dataProcessor.setName("DataProcessor");
		
		sendEmail.setPriority(Thread.MAX_PRIORITY);
		dataProcessor.setPriority(Thread.MIN_PRIORITY);
		
		sendEmail.start();
		dataProcessor.start();
		
		try {
			// main thread is suspended until t2 DIES
			dataProcessor.join();
			sendEmail.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Inside main ... ");
	}
}

class SendEmail implements Runnable {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName());
			if (i == 5) {
				// Hint to scheduler that thread is willing to 
				// yield its current use of CPU
				Thread.currentThread().yield();
			}
        }		
	}
}

class DataProcessor implements Runnable {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName());
        }
	}
}