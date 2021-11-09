package com.columbushs.unit6;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Unit6_2ArrayTraversal {
	
	private static final DecimalFormat df = new DecimalFormat("0.00");
	public void arrayTrav() {
		
		String [] list = new String[5];
		
		// Careful with <= or >= and length vs index
		
//		for (int i = 0; i<list.length; i++) {
//			list[i] = (int)(Math.random()*10);
//		}
		
		//round to specific decimal place
		
//		int y = 0;
//		while (y<list.length) {
//			System.out.println(list[y]);
//			y++;
//		}
		
		for (int i = 0; i<list.length; i++) {
			list[i] = df.format(Math.random()*10);
		}
		
		int y = 0;
		while (y<list.length) {
			System.out.println(list[y]);
			y++;
		}
		
	}
	
	public void arrayQuestions() {
		
		
		//What is printed out here?
//		String [] list = {"Apples","Oranges","Bananas"};
//		for (int i = 0;i<list.length;i++) {
//			System.out.print(list[i].length()+"_");
//		}
		
		
		int [] intArray = {1,2,3,4,5};
		//Reverse the numbers in the array
		
		
//		int [] reverseArray = new int[intArray.length];
//		int counter = 0;
//		for (int i=intArray.length-1;i>=0;i--) {
//			reverseArray[counter] = intArray[i];
//			System.out.print(reverseArray[counter]);
//			counter++;
//		}
		
		
	}
	

}
