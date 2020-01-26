package com.test.demo;

public class ControlFlowDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] myArr = {2,4,6,8,10};
		int [] myArr1 = {1,3,5,7,9};
		/*
		//for loop : traditional for loop
		for(int i=0;i<myArr.length;i++) {
		//	System.out.println(myArr[i]);
		}
		
		//enhanced for loop
		//System.out.println("executing enahnced for loop");
		for(int i: myArr) {
			
			//System.out.println(i);
		}
		
		//while loop
		System.out.println("executing while loop");
		int i=0;
		while(i<myArr.length) {
			System.out.println(myArr[i]);
			i++;
		}
		*/
		//break statement
		
		label1:for(int i=0;i<myArr.length;i++) {
			//System.out.println(myArr[i]);
			label2:for(int j=0;j<myArr1.length;j++) {
				System.out.println(myArr[i]+" "+myArr1[j]);
			label3:if(j==2) {
			 break label3;
			}
			}
		}
		
	}

}
