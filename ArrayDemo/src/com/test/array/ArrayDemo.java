package com.test.array;


public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		/*//1 way of creating array
		int[] myArr = new int[4];
		System.out.println("first element :"+myArr[0]);
		//2nd
		int[]  myArr1 = new int[] {
				2,3,5
		};
		
		//3rd
		int[] myArr2 = {3,4,5,7};
		//assigning values to element
		myArr[0]=8;
		myArr[1]=6;
		myArr[2]=4;
		myArr[3]=4;
		
		System.out.println("first element after:"+myArr[0]);
		System.out.println("length of array:"+myArr.length);*/
		
		int[][] my2DArr = new int[3][2];
		my2DArr[0][0]=2;
		my2DArr[0][1]=4;
		my2DArr[1][0]=6;
		my2DArr[1][1]=8;
		
		System.out.println("size of 2d array: "+my2DArr[0].length);
		
		
		int[][][] unitsold = {
				{//city= NY
					{0,0,0,0}, //jan
					{0,0,0,0}, //feb
					{0,0,0,0},  //
					{0,0,800,0},  //apr
				},
				
				{//city= Dallas
					{0,0,0,0}, //jan
					{0,0,0,0}, //feb
					{0,0,0,0},  // mar
					{100,0,0,0},  //apr
				},
		};
		
		System.out.println("ipad sold in NY in Apr:"+unitsold[0][3][2]);
		System.out.println("tv sold in DL in Apr:"+unitsold[1][3][0]);
	}

}
