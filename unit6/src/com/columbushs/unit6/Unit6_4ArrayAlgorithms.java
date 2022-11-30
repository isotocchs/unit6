package com.columbushs.unit6;

public class Unit6_4ArrayAlgorithms {
	
	//ID max or min value in array
	
	public double findMax(double [] arrayIn) {
		
		double maxValue = arrayIn[0];
		
		for (int i=1;i<arrayIn.length;i++) {
			
			if(arrayIn[i]>maxValue) {
				maxValue = arrayIn[i];
			}	
		}		
		return maxValue;
	}
	
	public double findMin(double [] arrayIn) {
	
		double minValue = Double.MAX_VALUE;
		
		for (double currentValue:arrayIn) {
			
			if(currentValue<minValue) {
				
				minValue = currentValue;
			}
		}
		return minValue;
	}
	
	//Find index of max value ???
	//What do I need to add?
	
	public int findMaxIndex(double [] arrayIn) {
		
		int maxIndex = 0;
		double maxValue = arrayIn[0];
		
		for (int i=1;i<arrayIn.length;i++) {
			
			if(arrayIn[i]>maxValue) {
				maxValue = arrayIn[i];
				maxIndex=i;
			}	
		}		
		return maxIndex;
	}
	
	// Calculate Average
	
	public double getArrayAvg(double [] arrayIn) {
		
		double average = 0.0;
		double sum = 0;
		
		for (double array:arrayIn) {
			sum += array;
		}
		
		average = sum/arrayIn.length;
		return average;
		
	}
	
	
	//Shifting Array contents
	public int[] shiftArrayRight(int [] arrayIn) {
		
		int[] shifted = new int[arrayIn.length];
		int shift = 4;
		
		for (int i=0;i<arrayIn.length;i++) {
			
			shifted[Math.abs((i+shift)%arrayIn.length)] = arrayIn[i];
		}
		return shifted;
	}
	
	public String[] shiftArrayLeft(String [] arrayIn) {
		
		String[] shifted = new String[arrayIn.length];
		int shift = 2;
		String temp;
		for(int count=0;count<shift;count++) {
			
			if (count<1) {
				temp = arrayIn[0];
			}else {
				temp=shifted[0];
			}			
			for (int i=0;i<arrayIn.length-1;i++) {
			
				if (count<1){
					shifted[i] = arrayIn[i+1];
				}else{
					shifted[i] = shifted[i+1];
				}
			}
			shifted[arrayIn.length-1]=temp;
			
		}
		return shifted;
	}
	

}
