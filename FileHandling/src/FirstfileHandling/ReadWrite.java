package FirstfileHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWrite {
	public static void main(String[] args) {

		try {

			FileReader input = new FileReader("D:\\LearnFileHandling\\Input.txt");
			FileWriter output = new FileWriter("D:\\LearnFileHandling\\Output.txt");

			int data;
			while ((data = input.read()) != -1) {
				output.write(data);

			}
			
			input.close();
			output.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
