public class Calculator {
	
	private Calculator() {
		
	}
	
	public static int square(int a, int b) {
		return (int) Math.pow(a, b);
	}
	
	//this method changed in the testing branch
	public static int reverseDifference(int a, int b) {
		return b-a;
	}
	
	public static int concat(int a, int b) {
		return Integer.parseInt(Integer.toString(a) + Integer.toString(b));
	}
	
	public static int add(int a, int b, int c) {
		return a+b+c;
	}
	
	public static int division(int a, int b) {
		return a/b;
	}
	
}
