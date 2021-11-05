package com.columbushs.unit6;

public class Unit6_2ArrayTraversal {
	
	
	public void arrayTrav() {
		
		int [] list = new int[5];
		
		// Careful with <= or >= and length vs index
		
		for (int i = 0; i<list.length; i++) {
			list[i] = (int)(Math.random()*10);
		}
		
//		int y = 0;
//		while (y<list.length) {
//			System.out.println(list[y]);
//			y++;
//		}
		
		for (int i = 0; i<list.length; i+=2) {
			list[i] = (int)(Math.random()*10);
		}
		
		int y = 0;
		while (y<list.length) {
			System.out.println(list[y]);
			y++;
		}
		
	}
	
	public void arrayQuestions() {
		
		
		//What is printed out here?
		String [] list = {"Apples","Oranges","Bananas"};
		for (int i = 0;i<list.length;i++) {
			System.out.print(list[i].length()+"_");
		}
		
		
		int [] intArray = {1,2,3,4,5};
		//Reverse the numbers in the array
		
		
		
	}
	

}
