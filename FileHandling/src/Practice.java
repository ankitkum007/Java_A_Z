import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)){
			BufferedWriter output = new BufferedWriter(new FileWriter("D:\\LearnFileHandling\\test.txt"));
			
			System.out.println("type some think to store in file");
			
			String line;
			while(!(line = sc.nextLine()).equalsIgnoreCase("exits")) {
				output.write(line);
				output.newLine();
			}
			
			output.close();
			
			System.out.println("data is store in file");
	
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
