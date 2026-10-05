package Explore;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
	public static void main(String[] args) {
		String filePath = "D:\\LearnFileHandling\\ByteStream\\TextFile.txt";

		try {
			File file = new File(filePath);
			if (file.exists() == true) {

				FileOutputStream fos = new FileOutputStream(filePath, true);
				String word = "Yes, FileWriter also creates the file automatically if it does not exist, just like FileOutputStream";
				String word2 = "new FileOutputStream(\"data.txt\", true) like devloper provide the flage so past content not deleted and store sucessfully";

				fos.write(word.getBytes());
				fos.write(System.lineSeparator().getBytes());
				fos.write(word2.getBytes());

				FileInputStream fis = new FileInputStream(filePath);
				int data;
				while ((data = fis.read()) != -1) {
					System.out.print((char) data);
				}
				fos.close();
				fis.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("\nstore in file!");
		}
	}
}
