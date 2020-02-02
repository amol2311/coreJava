package com.demo.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list =  new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(7);
		
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()) {
			int element  =  it.next();
			System.out.println("element "+element);
			if(element == 1) {
				it.remove();
				it.next();
				it.remove();
				//it.forEachRemaining(Filter::add);
			}
			
		}
		
		//System.out.println("list "+list);
		
		//forEach
	//	list.forEach(System.out::println);
		//list.forEach(Filter::filter);
	//	list.forEach(new Filter());
	}

}

class Filter implements Consumer
{
	static  void filter(Integer i) {
		 if(i==1) {
			 System.out.println(i+80);
		 }
	 }

	@Override
	public void accept(Object t) {
		// TODO Auto-generated method stub
		 if((int)t==2) {
			 System.out.println(t);
		 }
	}
	
	static void add(Integer i) {
		 
			 System.out.println(i+80);
		
	 }
}
