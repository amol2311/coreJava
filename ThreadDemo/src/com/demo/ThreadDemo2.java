package com.demo;

public class ThreadDemo2 {
    Message msg;
    
    public void run() {
		synchronized(msg) {
			System.out.println("inside run"+Thread.currentThread());
		}
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
	}

	class Producer extends Thread{
		void putMsg(){
			
		}
	}
	
	class Consumer extends Thread{
		void getMsg(){
			
		}
	}
	class Message {
		
		private String msg;

		public String getMsg() {
			return msg;
		}

		public void setMsg(String msg) {
			this.msg = msg;
		}
		
		
	}
}
