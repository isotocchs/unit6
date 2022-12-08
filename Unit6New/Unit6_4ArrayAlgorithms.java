
public class Unit6_4ArrayAlgorithms {
	
	//ID max or min value in array
	
	public double findMax(double [] arrayIn) {
		
		
		
		double minValue = arrayIn[0];
		for (int i=1;i<arrayIn.length;i++) {
 

			
			if(arrayIn[i]<minValue) {
				minValue = arrayIn[i];
			}	
		}		
		return minValue;
	}
	
	public double findMin(double [] arrayIn) {
	// double [] values = {12.5,67.2,67.3,45,32,12,19,5};
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
	// double [] values = {1200.5,67.2,67.3,45,320,12,19,5};
	public double findMaxIndex(double [] arrayIn) {
		
		double maxValue = arrayIn[0];
		
		for (int i=1;i<arrayIn.length;i++) {
			
			if(arrayIn[i]>maxValue) {
				maxValue = arrayIn[i];
			}	
		}		
		return maxValue;
	}
	
	// Calculate Average
	
	public double getArrayAvg(double [] arrayIn) {
		// double [] values = {1200.5,67.2,67.3,45,320,12,19,5};
		double average = 0.0;
		double sum = 0;
		
		for (double array:arrayIn) {
			sum += array;
		}
		
		average = sum/arrayIn.length;
		return average;
		
	}
	
	
	//Shifting Array contents
	// int [] arrayToShiftRight = {1,2,3,4,5,6,7};

	public int[] shiftArrayRight(int [] arrayIn, int shift) {
		
		int[] shifted = new int[arrayIn.length];
		
		for (int i=0;i<arrayIn.length;i++) {
			
			shifted[Math.abs((i+shift)%arrayIn.length)] = arrayIn[i];
		}
		return shifted;
	}







	// i+arrayIn.length-shift
	
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