package ByteStream;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStream {
	public static void main(String[] args) {
		try (FileInputStream fileInput = new FileInputStream("D:\\LearnFileHandling\\ByteStream\\ReadFile.txt")) {

			int data;
			while ((data = fileInput.read()) != -1) {
				System.out.print((char)data);
			}
			System.out.println();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("file read sucessfully");
		}
	}

}
