package com.test;

import com.demo.Student;


class MyTest{
	
}
public class AccessLevelDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s =  new Student();
s.setId(1);
s.setName("abc");
s.setGender("male1");

System.out.println("id:"+s.getId());

	}

}
