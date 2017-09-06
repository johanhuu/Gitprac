public class Branchclass {
	
	String text;
	int value;
	
	public Branchclass(String t, int v) {
		this.text = t;
		this.value = v;
	}
	
	public void getInfo() {
		System.out.println("Text says: " + text + " and value is: " + value);
	}
}
