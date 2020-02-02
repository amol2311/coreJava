package com.demo.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class ArraListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      /* List<Integer> list = new ArrayList<>();
       System.out.println("size of list:"+list.size());
       //basic operations
       list.add(1);
       list.add(2);
       list.add(3);
       list.add(3);
       list.add(null);
       System.out.println("original list:"+list);
       list.remove(3);
       System.out.println("after first remove list:"+list);
       list.remove(3);
       System.out.println("size of list:"+list.size());
       System.out.println("list:"+list);*/
       
       //list.get(3);
		
		
		List<Integer> list =  new LinkedList<>();
		   list.add(1);
	       list.add(2);
	       list.add(3);
	       list.add(3);
	       
	     //set add 
	       System.out.println("original list:"+list);
	       
	     //  list.set(3, 4);
	    //   System.out.println("after set list:"+list);
	       
	     //  list.add(2,7);
	     //System.out.println("after add list:"+list);
	       
	       
	       //Bulk opr
	       List<Integer> l2 = new ArrayList<>();
	       l2.add(8);
	       l2.add(9);
	       
	      // list.addAll(l2);
	      // list.addAll(2, l2);
	      // System.out.println("after addAll list:"+list);
           //list.removeAll(l2);
           //System.out.println("after removeAll list:"+list);
           
          // list.retainAll(l2);
         //  System.out.println("after retainAll list:"+list);
	
	//toArray
	       
	    //Integer[] myArr=  (Integer[])l2.toArray();
	       
	       System.out.println("indesof "+list.indexOf(3));
	       System.out.println("lastindesof "+list.lastIndexOf(3));
	
	
	       //sublist
	       List<Integer> l3 = list.subList(1, 3);
	       System.out.println("sublist:"+l3);
	       
	       l3.set(0, 7);
	       System.out.println("sublist after set:"+l3);
	       System.out.println("original list after set:"+list);
	       
	       l3.add(8);
	       System.out.println("sublist after add:"+l3);
	       System.out.println("original list after add:"+list);
	       
	       //list.add(2,10);
	       
	      // System.out.println("sublist after  in original list:"+l3);
	     //  System.out.println("original list after add:"+list);
	       
	/*for(int i=0; i<list.size() ;i++) {
		System.out.println("element:"+list.get(i));
		int element  =  list.get(i);
		if(element == 7) {
		    list.remove(i);
		}
	}*/
	       
	      /* for(int element : list) {
	    	   System.out.println("element:"+element);
	    	   
	    	   if(element == 7) {
	    		   list.remove(Integer.valueOf(element));
	    		  
	    	   }
	       }*/
	
	}

}
