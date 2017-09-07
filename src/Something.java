import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Something {
	
	static int depth = 0;
	
	private Something(){
	}
	
	public static void listAllNames(File f) {
		File[] files = f.listFiles();
		for(File file : files) {
			for(int i=0; i<depth; i++) {
				System.out.print("   ");
			}
			System.out.println(file.getName());
			if(file.isDirectory()) {
				depth++;
				listAllNames(file);
			}
		}
		depth--;
	}
	
	public static int closestToZero(int[] numbers) {
		
		int closestNegative = Integer.MIN_VALUE;
		int closestPositive = Integer.MAX_VALUE;
		
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i] < 0) {
				if(numbers[i] > closestNegative) {
					closestNegative = numbers[i];
				}
			}else if(numbers[i] >= 0){
				if(numbers[i] < closestPositive) {
					closestPositive = numbers[i];
				}
			}
		}
		
		int number = 0;
		if(closestPositive*-1 > closestNegative) {
			number = closestPositive;
		}else {
			number = closestNegative;
		}
		return number;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Something.listAllNames(new File("C:/Users/A548464/Desktop/img"));
		
		int[] values = {-50, 20, 10, -34, 7, 12, -2};
		System.out.println(closestToZero(values));
		
	}
}
