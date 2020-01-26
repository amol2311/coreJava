package com.test.demo;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//addition
		/*int a  = 4;
		int b=2;
		System.out.println("addition : "+(a+b));*/
		
		//post 
		int x = 5;
		int y = x++;
		System.out.println("y = "+y+" and x ="+x);
		
		//pre 
		int x1 = 5;
		int z = ++x1;
		System.out.println("z = "+z+" and x1 ="+x1);
		
		
		//rule 1: *,/,% gets higher priority over +,-
		
		int r1 = 2+3*10;
		
		System.out.println("rule 1 output: "+r1);
		
		//rule 1: *,/,% gets higher priority over +,-
		
		int r3 = (2+3)*10;
		
		System.out.println("rule 3 output: "+r3);
		
		int r2 = 2+(3-15);
		System.out.println("rule 2 output: "+r2);
		
		//operand promotion rule 1: everything < int promoted to int
		
		byte b = 127;
		byte b1 = 20;
		System.out.println("promotion rule 1 with byte output: "+(b+b1));
		
		char c = 'A';
		char c1= 'A';
		
		System.out.println("promotion rule 1 with char output: "+(c+c1));
		
		
		double d = 1/2;
		System.out.println("same type of operand output: "+d);
		
		System.out.println("same type of operand output: "+('A'+2.5));
	}

}
