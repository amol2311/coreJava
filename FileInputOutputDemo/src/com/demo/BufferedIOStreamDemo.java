package com.demo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedIOStreamDemo {

	public static void main(String[] args) {
		try(BufferedInputStream in = new BufferedInputStream(new FileInputStream("desktopimg.png"));
				BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("buffered_out.png"))	){
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
