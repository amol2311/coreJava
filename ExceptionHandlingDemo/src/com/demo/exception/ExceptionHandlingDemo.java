package com.demo.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandlingDemo {
 int id;
	
	
	public static void main(String[] args) throws FileNotFoundException  {
		// TODO Auto-generated method stub
		
		//checked exception
		/*try {
			
			
		BackendApplication.send(1, "", "http://abc.test.com");
		}catch (FileNotFoundException e) {
		
			System.out.println("inside main: catch block");
			throw e;
		}catch (IOException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
			
		}
		
		
	System.out.println("In main : after exception");*/
		
		
		
		//unchecked exception 1
		
		int[] myArr =  {1,2,3};
		//System.out.println("my array:"+myArr[4]);
		
		//unchecked exception
		ExceptionHandlingDemo obj =null;
		//System.out.println(obj.id);
		/*try {
		
		throw new IllegalArgumentException();
		}
		catch(IllegalArgumentException i) {
			
		}
        catch(RuntimeException i) {
			
		}
		catch(Exception i) {
			
		}
		catch(Throwable t) {}*/
		
		
		// finally
		
		/*try {
			
			System.out.println("inside try");
			throw new IllegalArgumentException();
		}catch(NullPointerException e){
			System.out.println("inside catch");
		}
			finally {
		
			System.out.println("inside finally");
		}
		System.out.println("remaining");*/
		
		
		//custom exception
		
		BackendApplication.send(1, "", "http://abc.test.com");
		
	}
		
		
		
		
		

}
