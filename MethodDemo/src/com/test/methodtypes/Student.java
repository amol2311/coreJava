package com.test.methodtypes;

public class Student {

	//instance var
	int id;
	String name;
	Course course;
	 static int csCounter;
	 static int elCounter;
	static int counter;
	 //static var
	 
//instance method
	int getId(int id) {
		return id;
		
	}
	
	//static method
	 
	 String enrollToCourse(String course) {
		 this.course.mycourse = course;
		 return course;
		 
	 }
	 
	 static int setCounter(String course) {
		 counter++;
		 if(course.equals("cs")) {
			return csCounter++; 
		 }
		 if(course.equals("el")) {
				return elCounter++; 
			 }
		 return counter;
	 }
	 
}
