package com.demo.exception;

import java.io.FileNotFoundException;

public class BackendApplication {
 
	
	public static void send(int destination, String filename, String url) throws FileNotFoundException {
		
		//checked exception
		/*try {
		if(filename.equals("")) {
			throw new FileNotFoundException();
		}}catch(FileNotFoundException e) {
			System.out.println("filenotfoundexception occured");
		}*/
		/*try {
		if(filename.equals("")) {
			throw new FileNotFoundException();
		}}catch(FileNotFoundException e) {
			System.out.println("inside catch of send()");
			throw e;
		}*/
		
		try {if(filename.equals("")) {
			throw new MyException(filename,url,"FileName not exists");
		}}catch(MyException e) {
			System.out.println("MyException occured: "+e.getStackTrace());
		}
		
	}
}
