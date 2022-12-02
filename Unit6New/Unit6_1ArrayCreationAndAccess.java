
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

		
		int [] listOfInts  = new int[5];
		double [] randomNumbers = {12.5, 34.6, 1, 5, 89.3,45,32.6,67.5};


		listOfInts[1]=22;

		// System.out.println(listOfInts);

		int i = 0;
		while (i<randomNumbers.length) {
			// System.out.println(randomNumbers[i]);
			i++;
		}

		for (int k=0;k<randomNumbers.length;k++){
			// System.out.println(randomNumbers[k]);
		}

		// System.out.println(listOfInts.length);
		// System.out.println(listOfInts[2]);
		
		//put something in the array
		listOfInts[2]=33;
		// System.out.println(listOfInts[2]);

		listOfInts[listOfInts.length-1]=listOfInts[2]*3;
		
		// System.out.println(listOfInts[2]+" "+listOfInts[4]);
		
		//out of bounds
		
		
		
		
		//Printing out the list
		
		// System.out.println(listOfInts);
		
		//print out all the values using loop
		
		

		for (int j=0;j<listOfInts.length;j++){
			// System.out.println(listOfInts[j]);
		}
		
		
		
		//Array of objects
		
		//Crate Array
		
		
		//Create space in memory (All null)
		String [] listOfStr = {"Kevin","Todd","Tim","Anthony", "Carlos", "Daniel", "Jeremiah"};
		int [] height = {4,5,6,7,2,1,7};
		int [] age = {43,52,63,74,22,13,74};


		TestClass [] listOfObj = new TestClass[listOfStr.length];

	// System.out.println(listOfObj[1].getName());

		
		int k = 0;
		while (k<listOfStr.length) {
			listOfObj[k] = new TestClass(listOfStr[k],age[k],height[k]);
			// System.out.println("Name: "+listOfObj[k].getName()+" Age: "+listOfObj[k].getAge());

			k++;
		}

		// System.out.println(listOfStr[(int)(Math.random()*listOfStr.length)]);

		//we can now use methods on the array object
		
		// System.out.println(listOfObj[1].getValue());
		
		// listOfObj[0] = new TestClass(listOfObj[1].getValPlus3());
		
		// System.out.println(listOfObj[0].getValue());

		int y = 0;
		while (y<listOfObj.length) {
			// System.out.println(listOfObj[y].getName());
			y++;
		}
		
		
		//If you know the values beforehand you can initialize with info
		
		// double [] randomNumbers = {12.5, 34.6, 1, 5, 89.3,45,32.6,67.5};

			randomNumbers[1]=67.3;
			double thingum = 0;
			int x = 0;
		while (x<randomNumbers.length) {
			// System.out.println(randomNumbers[x]);
			thingum+=randomNumbers[x];
			x++;
		}
		System.out.println(thingum);

		System.out.println(thingum/randomNumbers.length);

		
		
		String [] stuff = {"Appels","Hats","Hair","More Things","Bob","John"};
		
//		int y = 0;
//		while (y<stuff.length) {
//			System.out.println(stuff[y]);
//			y++;
//		}
//	
	
		
		
	
	}
	
	
	
	
	
	
	

}
