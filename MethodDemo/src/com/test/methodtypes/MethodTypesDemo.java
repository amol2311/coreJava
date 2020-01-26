package com.test.methodtypes;

public class MethodTypesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		//instance variable 
		s.id=1;
		s.name="John";
		//static method invocation : className.methodName()
		
		 Course cs =  new Course();
		s.course=cs;
		s.enrollToCourse("cs");
		Student.setCounter("cs");
		
		
		s.course=cs;
		s.enrollToCourse("el");
		Student.setCounter("el");
		Student s1= new Student();
		//instance method invocation : objectRef.methodName();
		//s1.getId(2);
	
		System.out.println("Number of student cs: "+Student.csCounter);
		System.out.println("Number of student el: "+Student.elCounter);
		System.out.println("Number of student : "+Student.counter);
	}

}
