package com.test;

public class UserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	User u = new User(1,"abc");
	User u1 = new User(1,"abc");
		if(u.equals(u1)) {
			System.out.println("eq "+u.hashCode());
		}else {
			System.out.println(Constants.NOT_EQUAL);
			
			System.out.println("not eq");
		}
	}

}
