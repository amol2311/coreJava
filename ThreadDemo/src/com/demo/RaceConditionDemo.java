package com.demo;

public class RaceConditionDemo {
	
	public static void main(String[] args) {
	   BankAccount task = new BankAccount();
	   task.setBalance(100);
	   
	   Thread t1 = new Thread(task);
	   Thread t2 = new Thread(task);	   
	   t1.setName("John");
	   t2.setName("Sam");
	   t1.start();
	   t2.start();	   
	}
}

class BankAccount implements Runnable {
	private int balance;
	public void setBalance(int balance) {
		this.balance = balance;		
	}
	
	
	public void run() {
		
		makeWithdrawal(75);
		//display();
		getBalanace();
		if (balance < 0) {
			System.out.println("Money overdrawn......");
		}
		
	}	
 
	
	public synchronized void getBalanace() {
		// TODO Auto-generated method stub
		System.out.println("remaing balance "+balance+" Thread:"+Thread.currentThread());
	}


	public void display() {
		// TODO Auto-generated method stub
		synchronized(this) {
		System.out.println("Thread "+Thread.currentThread()+" is in display method");
		}
	}


	private synchronized void makeWithdrawal(int amount) {
		System.out.println("Thread "+Thread.currentThread()+" is withdrawaling amount");
		if (balance >= amount) {
			System.out.println(Thread.currentThread().getName() + " is about to withdraw ...");
			balance -= amount;
			System.out.println(Thread.currentThread().getName() + " has withdrawn " + amount + " bucks");
	    } else {
	    	System.out.println("Sorry, not enough balance for " + Thread.currentThread().getName());
	    }
	}
	
}