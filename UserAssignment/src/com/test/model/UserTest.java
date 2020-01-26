package com.test.model;

public class UserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        User u =  new User("John");

		//System.out.println("users: "+User.myUsers.length);
		//System.out.println("users: "+u);
		User.addUser(u);
		User.addUser(new User("aaa"));
		User.addUser(new User("abc"));
		User.addUser(new User("xyz"));
		User.addUser(new User("dfg"));
		User.addUser(new User("bcd"));
		User.addUser(new User("lmn"));
		User.addUser(new User("uvw"));
		//User.addUser(new User("rte"));
		User.addUser(new User(""));
		
	}

}
