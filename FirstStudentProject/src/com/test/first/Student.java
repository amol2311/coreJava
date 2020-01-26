package com.test.first;

public class Student {
	
	int id;
	String name;
	String gender;
	static String course="CS";
	
	//this method is used to update name of student
	 boolean updateProfile(String newName) {
		name=newName;
		 System.out.println(newName);
		return true;
	} 
	
	// main method
    public static void main(String[] args) {
    	
    //	int r =(int)2.3;
    	System.out.println("default value for r :");
    	//create student object
    /**	Student s = new Student();
    	Student.course="ABC";
    	s.id=90;
    	System.out.println("default value for id :"+s.id);
    	System.out.println("default value for name :"+s.name);*/
    	
    //	s.updateProfile("John");
    	
    	//System.out.println("Student name after :"+s.name);
    	
    
    }
}
