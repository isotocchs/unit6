
public class TestClass {
	
		private int value;
        String Name;
		int age;
		int height;
		
		public TestClass() {
			value=0;
		}
		public TestClass(int startingValue) {
			value=startingValue;
		}

        public TestClass(String username, int a, int h) {
			Name=username;
			age = a;
			height = h;
		}
		
		public void incrementValue () {
			value++;
		}
		
		public int getValue() {
			return value;
		}
		public int getAge() {
			return age;
		}
        public String getName() {
			return Name;
		}
		
		public int getValPlus3() {
			return value+3;
		}
		
		

}