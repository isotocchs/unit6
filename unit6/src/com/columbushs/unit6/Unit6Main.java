package com.columbushs.unit6;

public class Unit6Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Unit6_1ArrayCreationAndAccess arrayTests = new Unit6_1ArrayCreationAndAccess();
		//arrayTests.arrayTesting();
		
		Unit6_2ArrayTraversal arrayTraversal = new Unit6_2ArrayTraversal();
		//arrayTraversal.arrayTrav();
		//arrayTraversal.arrayQuestions();
		
		Unit6_3EnhancedForLoop enhancedFor = new Unit6_3EnhancedForLoop();
		//enhancedFor.enhancedForLoopsInts();
		//enhancedFor.enhancedForLoopsStrings();
		//enhancedFor.enhancedForLoopsObj();
		
		
		Unit6_4ArrayAlgorithms arrayAlg = new Unit6_4ArrayAlgorithms();
		double [] values = {12.5,67.2,67.3,45,32,19};
		//System.out.println(arrayAlg.findMax(values));
		//System.out.println(arrayAlg.findMin(values));
		//System.out.println(arrayAlg.findMaxIndex(values));
		
		int [] arrayToShiftRight = {1,2,3,4,5,6,7};
		
		int [] shiftedArray1 = arrayAlg.shiftArrayRight(arrayToShiftRight);
		for(int num:shiftedArray1) {
			System.out.println(num+" ");
		}
		
		
		String [] arrayToShiftLeft = {"Apple","Orange","Banana","Grape"};
		String [] shiftedArray2 = arrayAlg.shiftArrayLeft(arrayToShiftLeft);
		
		for(String stuff:shiftedArray2) {
			System.out.println(stuff+" ");
		}
	}

}
