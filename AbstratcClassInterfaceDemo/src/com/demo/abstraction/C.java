package com.demo.abstraction;

public class C extends B{

	@Override
	void test1() {
		// TODO Auto-generated method stub
		System.out.println("test1"+i);
	}
	
	public static void main(String... args) {
		A a = new C();
	a.test1();
	}

}
