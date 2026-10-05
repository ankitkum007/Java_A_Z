package SystemClass;

import java.io.*;
import java.util.Scanner;

public class SaveuserInput {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in);
				BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\LearnFileHandling\\userOutput.txt"))) {
			System.out.println("Type something (type exit to stop) ");
			
			String input;
			while(!(input = sc.nextLine()).equalsIgnoreCase("exit")) {
				writer.write(input);
				writer.newLine();
			}

		} catch (IOException e) {
			System.err.println("Opps something went wrong");
		}

	}

}
