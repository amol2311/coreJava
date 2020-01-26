package com.test.passbyvalue;

public class PassByValueDemo {

	static void updateId(int newId) {
		newId = 1001;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int id =1000;
   updateId(id);
  // System.out.println("value of id: "+id);
		Student s =  new Student();
		s.id=1000;
		System.out.println("value of id before: "+s.id);
		s.updateId(s);
		System.out.println("value of id after: "+s.id);
	}

}
