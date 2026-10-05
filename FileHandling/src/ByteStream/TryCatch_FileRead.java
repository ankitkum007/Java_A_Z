package ByteStream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryCatch_FileRead {
	public static void main(String[] args) {
		BufferedReader reader = null;
		
		try {
			reader = new BufferedReader(new FileReader("D:\\LearnFileHandling\\ByteStream\\intro.txt"));
			String line;
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		}catch (FileNotFoundException e) {
			System.out.println("file not found");
		}catch (IOException e) {
			System.out.println("somthing went wrong");
		}finally {
			try {
				if(reader != null) {
					reader.close();
					System.out.println("file is closed");
				}
			}catch(IOException e) {
				System.out.println("Error: Fail to close");
			}
		}
	}

}
