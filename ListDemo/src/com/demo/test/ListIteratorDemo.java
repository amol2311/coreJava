package com.demo.test;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list =  new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		ListIterator lit =  list.listIterator();
		
	  while(lit.hasNext()) {
		 // String s =  "";
		  
		
		 if(((String) (lit.next())).equals("C")) {
			 
			 lit.set("E");
			
		 }
		// System.out.println(" next element:"+lit.nextIndex());
	  }
	//lit.previous();
	//lit.previous();
	//lit.previous();
	//lit.previous();
	
	  while(lit.hasNext()) {
			 
			 System.out.println(" next element:"+lit.next());
		  }
	}

}
