package com.cls;

public class StudentTest {

	
	public static void main(String[] args) {
		//1. create object of class student
		Student s = new Student();
		
		//2. Settung state of student obj
		s.id=100;
		s.name="abc";
		s.gender="m";
		byte a= 127;
		int v = 6_5;
		int w = 0x41;
		if(v==w) {
			System.out.println("true");
		}
		//System.out.println("created student object with name :"+s.name);
		
		// 3. Update name of student - change behavior of oject
		s.updateProfile("Sam");
		
		System.out.print("updated student name to :"+s.name);
		
	}
}
