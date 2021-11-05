package com.columbushs.unit6;

public class Unit6_1ArrayCreationAndAccess {
	
	//Array - a data structure used to implement a collection (list) of data
	
	//Element - single value in array
	
	//Index - position of element in array (First Element has index 0)
	
	//Length - number of elements in array (Length starts at 1)
	
	//Because of this the last element of an array is at index = length-1
	
	public void arrayTesting() {
		
		//array of ints 
		
		//if ints initialized to 0
		//if double initialized to 0.0
		//if boolean initialized to false
		//if String or other class initialized to null	
		
		int [] listOfInts = new int[5];
		//System.out.println(listOfInts.length);
		
		//put something in the array
		listOfInts[2]=33;
		listOfInts[3]=listOfInts[2]*3;
		
		System.out.println(listOfInts[1]+" "+listOfInts[3]);
		
		//out of bounds
		
		listOfInts[4]=22;
		
		
		//Printing out the list
		
		//System.out.println(listOfInts);
		
		//print out all the values using loop
		
//		int i = 0;
//		while (i<listOfInts.length) {
//			System.out.println(listOfInts[i]);
//			i++;
//		}
		
		
		
		//Array of objects
		
		//Crate Array
		TestClass [] listOfObj = new TestClass[3];
		
		//Create space in memory (All null)
		
		
		//Create Object in specific index in array
		
		listOfObj[1] = new TestClass(45);
		
		//we can now use methods on the array object
		
		//System.out.println(listOfObj[1].getValue());
		
		listOfObj[0] = new TestClass(listOfObj[1].getValPlus3());
		
		//System.out.println(listOfObj[0].getValue());
		
		
		//If you know the values beforehand you can initialize with info
		
			double [] randomNumbers = {12.5, 34.6, 1, 5, 89.3,45,32.6,67.5};
			randomNumbers[1]=67.3;
		
//		int x = 0;
//		while (x<randomNumbers.length) {
//			System.out.println(randomNumbers[x]);
//			x++;
//		}

		
		
		String [] stuff = {"Appels","Hats","Hair","More Things","Bob","John"};
		
		int y = 0;
		while (y<stuff.length) {
			System.out.println(stuff[y]);
			y++;
		}
//	
	
		
		
	
	}
	
	
	
	
	
	
	

}
