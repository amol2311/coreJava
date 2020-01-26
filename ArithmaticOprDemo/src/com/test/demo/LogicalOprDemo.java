package com.test.demo;

public class LogicalOprDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int age =35;
         int sal =9001;
         
        /* if(age!=35 || sal==9000) {
        	 System.out.println("true");
         }else {
        	 System.out.println("false");
         }*/
         
         //++x, x++
         
         int x =5;
         if(x!=5 && ++x==6) {
        	 System.out.println("x="+x);
         }
         
         System.out.println("x="+x);
         
         if(x!=5 & ++x==6) {
        	 System.out.println("x="+x);
         }
         
         System.out.println("x="+x);
	}

}
