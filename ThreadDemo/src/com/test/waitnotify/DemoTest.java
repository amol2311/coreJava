package com.test.waitnotify;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Message m =  new Message("Hello");
       Producer p =new Producer(m);
       Consumer c =  new Consumer(m);
       Thread t1 = new Thread(p);
       t1.setName("producerThread");
       Thread t2 =  new Thread(c);
       t2.setName("consumerThread");
       
       Producer p1 =new Producer(m);
       Thread t3 =  new Thread(p1);
       
       t1.start();
       t3.start();
       t2.start();
	}

}
