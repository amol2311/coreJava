package com.typecast;

// TODO: Auto-generated Javadoc
/**
 * The Class TypeCastExample.
 */
public class TypeCastExample {
    
	
	
	public static void basicTypeCast() {
		//implicit typecast
				byte b = 100;
				int a = b;
				
				System.out.println("value of a: "+a);
				
				char c = 'A';
				int d = c;
				System.out.println("value of d: "+d);
				
				long l =  1022030000993l;
				float f = l;
				
				System.out.println("value of f: "+f);
				
				
				//Explicit casting
				int a1 = 100;
				short s = (short) a1;
				System.out.println("value of s: "+s);
				
				byte cb = (byte) c;
				System.out.println("value of cb: "+cb);
	}
	
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
	//	basicTypeCast();
		
	//	infoLossTypeCast();
		
		typeCastUseCase();
		
	}


	private static void typeCastUseCase() {
		// TODO Auto-generated method stub
		//explicit
		
		double d = (2+3)/2;
		System.out.println("value of d :"+d);
		
		double d1 = (double)(2+3)/2;
		System.out.println("value of d1:"+d1);
	}


	private static void infoLossTypeCast() {
		// TODO Auto-generated method stub
		//information loss with explicit cast-  Truncation
		int a = (int) 3.14f;
		System.out.println("value of a: "+a);
		
		char c = (char) 65.5;
		System.out.println("value of c: "+c);
		
		//Information loss with explicit cast - out of range
		byte b = (byte) 12345;
		
		System.out.println("value of b:"+b);
	}
	
	
}
