package com.test.demo;

public class ControlFlowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=10;
		//if block	
		if(i==10) {
			System.out.println("inside if block");
		}else if(i==0){
			System.out.println("i=0");
		}else {
			System.out.println("else body");
		}
		
		
		//switch
		byte j=120;
		switch(j) {
		case 10: System.out.println("10");
		
		case 1: System.out.println("1");
		
		default: System.out.println("default");
		break;
		case 127: System.out.println("12");
		break;
		}
		
		
		//ternary expr?do this: else do this
		
		System.out.println("my name :"+(i==10?"abc":"xyz"));
	}

}
