
public class TestClass {
	
		private int value;
        String Name;
		
		public TestClass() {
			value=0;
		}
		public TestClass(int startingValue) {
			value=startingValue;
		}

        public TestClass(String username) {
			Name=username;
		}
		
		public void incrementValue () {
			value++;
		}
		
		public int getValue() {
			return value;
		}
        public String getName() {
			return Name;
		}
		
		public int getValPlus3() {
			return value+3;
		}
		
		

}