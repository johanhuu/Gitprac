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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Something.listAllNames(new File("C:/Users/A548464/Desktop/img"));
	}
}
