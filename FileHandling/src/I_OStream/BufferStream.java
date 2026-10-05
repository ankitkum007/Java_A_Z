package I_OStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferStream {
	public static void main(String[] args) {
		//Read the data from file and console;
		try(BufferedReader br = new BufferedReader(new FileReader("D:\\LearnFileHandling\\I_OStream\\ApplicationText.txt"))) {
			String word;
			while((word = br.readLine()) != null) {
				System.out.println(word);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
