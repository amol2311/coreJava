package com.demo1;

public class SingletonClass {
	static SingletonClass obj;
	
	private SingletonClass() {
		
	}
	
	public static SingletonClass getMyClassObj() {
		if(obj==null) {
			obj = new SingletonClass();
		}
		return obj;
	}
}
