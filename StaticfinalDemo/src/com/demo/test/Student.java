package com.demo.test;

public class Student {

	final int id;
	String name;
	String gender;
	
	static int counter = 1000;
	
	public Student(String name, String gender) {
		this.id= ++counter;
		this.name=name;
		this.gender=gender;
		System.out.println("id :"+this.id+" name:"+name+" gender:"+gender);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 =  new Student("John","male");
		
		int[]	myArr = new int[] {1,3};
		
		Student s2 =  new Student("Lisa","female");
		
		String s ="New_name:";
		
		if(s.contains(Constants.COLON_VAL)) {
			System.out.println("it contains underscore");
		}
		
		
		
		
	}

}
