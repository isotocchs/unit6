package com.columbushs.unit6;

public class TestClass {
	
		private int value;
		
		public TestClass() {
			value=0;
		}
		public TestClass(int startingValue) {
			value=startingValue;
		}
		
		public void incrementValue () {
			value++;
		}
		
		public int getValue() {
			return value;
		}
		
		public int getValPlus3() {
			return value+3;
		}
		
		

}
