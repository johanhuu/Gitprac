public class Calculator {
	
	private Calculator() {
		
	}
	
	public static int square(int a, int b) {
		return (int) Math.pow(a, b);
	}
	
	public static int multiply(int a, int b) {
		return a*b;
	}
	
	public static int difference(int a, int b) {
		return a-b;
	}
	
	public static int add(int a, int b) {
		return a+a+b+b;
	}
}
