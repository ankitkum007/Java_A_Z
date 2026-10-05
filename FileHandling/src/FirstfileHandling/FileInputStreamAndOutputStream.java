package FirstfileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamAndOutputStream {
	public static void main(String[] args) throws IOException {
		String inputpath = "D:\\LearnFileHandling\\Input.txt";
		String outPutpath = "D:\\LearnFileHandling\\Output.txt";
		
		FileInputStream inputFile = new  FileInputStream(inputpath);
		FileOutputStream outputFile = new FileOutputStream(outPutpath);
		
		int data;
		while((data=inputFile.read()) != -1) {
			outputFile.write(data);
		}
		
		inputFile.close();
		outputFile.close();
	}

}
