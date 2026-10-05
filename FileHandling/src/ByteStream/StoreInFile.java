package ByteStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StoreInFile {
	public static void main(String[] args) {
		String inputPath = "D:\\LearnFileHandling\\ByteStream\\ReadFile.txt";
		String outputPath = "D:\\LearnFileHandling\\ByteStream\\WrriteFile.txt";

		try (FileInputStream fileInput = new FileInputStream(inputPath);
				FileOutputStream fileOutput = new FileOutputStream(outputPath)) {

			int data;
			while ((data = fileInput.read()) != -1) {
				fileOutput.write(data);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("backup the file!");
		}
	}
}
