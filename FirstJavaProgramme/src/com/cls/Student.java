package com.cls;

public class Student {
	int id;
	String name;
	String gender;
	
	
	public boolean updateProfile(String newName) {
		name = newName;
		return true;
	}
	

}
