package com.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStreamDemo {
   
	public static void main(String[] args) {
		try(FileInputStream in = new FileInputStream("desktopimg.png");
			FileOutputStream out = new FileOutputStream("out.png")	){
			int b;
			System.out.println("started copying file at: "+System.currentTimeMillis());
			while((b=in.read())!=-1) {
				out.write(b);
			}
			System.out.println("Ended copying file at: "+System.currentTimeMillis());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
