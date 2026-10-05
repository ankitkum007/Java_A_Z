package BufferStream_Character;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class CharStream {
	public static void main(String[] args) {
			BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter("D:\\LearnFileHandling\\BufferStream\\Input.txt"));
			writer.write("this is a first line");
			writer.newLine();
			writer.write("this is a second line");
			writer.newLine();
			writer.write("this is a third line");
			writer.newLine();
			writer.write("this is a fourth line");
		}
		catch (IOException e) {
			System.out.println("Error when write the data in file");
		}
		finally {
			try {
				if(writer != null) {
					writer.flush();
					writer.close();
				}
			} catch (IOException e2) {
				e2.printStackTrace();
			}
			System.out.println("content is write sucessfully");
		}
	}

}