package com.test.demo;

public class BitwiseDemo {

	
	public static void main(String... agrs) {
		int x = 1;
		int y =3;
		System.out.println("bitwise and value : "+(x&y));
		System.out.println("bitwise or value : "+(x|y));
		
		System.out.println("bitwise xor value : "+(x^y));
		System.out.println("bitwise not value : "+(~x));
		
		//left bit shift <<
		int val=6;
		System.out.println("1 left shift value for val:"+val+" is "+(6<<1));
		System.out.println("2 left shift value for val:"+val+" is "+(6<<2));
		System.out.println("3 left shift value for val:"+val+" is "+(6<<3));
		System.out.println("4 left shift value for val:"+val+" is "+(6<<4));
	
		//unsigned right bit shift >>>
		
		System.out.println("1 unsigned right shift value is "+(12>>>1));
		System.out.println("2 unsigned right  shift value  is "+(24>>>2));
		System.out.println("3 unsigned right  shift value is "+(48>>>3));
		System.out.println("4 unsigned right  shift value  is "+(96>>>4));
		
		//signed right shift >>
		System.out.println("1 signed right shift value is "+(12>>1));
		
	}
}
