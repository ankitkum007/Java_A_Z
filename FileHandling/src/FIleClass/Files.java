package FIleClass;

import java.io.*;

public class Files{
	public static void main(String[] args) {
		String path = "D:\\LearnFileHandling\\story.txt";
		File file = new File(path);
		System.out.println("exsits: " + file.exists());
//		System.out.println("delet: " + file.delete());
		System.out.println("isFile: " + file.isFile());
		System.out.println("isDirectory: " + file.isDirectory());
		System.out.println("Absolutepath: " + file.getAbsolutePath());
		System.out.println("Relatated Path: " + file.getPath());
	}

}
