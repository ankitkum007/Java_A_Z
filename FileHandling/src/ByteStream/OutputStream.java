package ByteStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {
	public static void main(String[] args) {
		String sentence = "byte stream  use  for file, video, audio, image, pdf";
//		String sentence = "";
		try (FileOutputStream fileOutput = new FileOutputStream("D:\\LearnFileHandling\\ByteStream\\ReadFile.txt")) {
			fileOutput.write(sentence.getBytes());
			System.out.println("sentance is save sucessfully in file");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
