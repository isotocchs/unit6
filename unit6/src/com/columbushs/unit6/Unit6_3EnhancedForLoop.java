package com.columbushs.unit6;

public class Unit6_3EnhancedForLoop {

	//Enhanced for loops
	// for (type (int, double, string, etc) declaration (variable name)  : structure (array)) {
	//		Do something
	// }
	
	//The type declaration must match the type of array. 
	//This loop goes through all of the content in the array, 
	//no need to create index and increment the value
	
	//Every time the loop runs the corresponding element in the array 
	//gets assigned to the declared variable
	
	//Big drawback is that you cannot access the Array with the index
	
	public void enhancedForLoopsInts() {
	
		int [] intArray = {2,67,3234,23,-90,104,3};
	
		for (int numbers:intArray) {
			
			//note how you used the declared variable not the array
			System.out.println(numbers);
			
		}
		
		System.out.println("Done with loop");
		
	}
	
	public void enhancedForLoopsStrings() {
		String [] stringArray = {"House","Dog","Cat","Grass","Time"};
		
		for (String stringsInArray:stringArray) {
			
			System.out.println(stringsInArray);
		
		}
		System.out.println("Done with loop");
	
	}
	
	public void enhancedForLoopsObj() {
		
		TestClass [] objArray = {new TestClass(12), new TestClass(45), new TestClass(97)};
		
		for (TestClass objInArray:objArray) {
			
			//Note how you call the method using the declared variable not the array.
			System.out.println(objInArray.getValue());
		
		}
		System.out.println("Done with loop");
		
	}
}
