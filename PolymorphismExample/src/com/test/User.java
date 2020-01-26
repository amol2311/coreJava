package com.test;

public class User {
	
	public int id;
	public String name;
	public User() {
		System.out.println("User constructor");
	}
	
	public User(int id, String name) {
		this.id =  id;
		this.name=name;
		//System.out.println("User constructor");
	}
	@Override
	public boolean equals(Object o) {
		if(o instanceof User) {
			if(this.id == ((User)o).id) {
				return true;
			}
		}
		
		return false;
	}
	
	
	@Override
	public String toString() {
		return "id:"+this.id+" name:"+this.name;
	}
	
	
}

