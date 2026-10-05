package Explore;

import java.io.IOException;

public class SystemOut {
	public static void main(String[] args) {
		System.out.println("Enter the char");
		try {
			int data = System.in.read();
			System.out.println("Enter char: " + (char) data);
			System.out.println("ASCII: " + data);
			
			System.exit(data);
		}catch(IOException e) {
			e.printStackTrace();
		}
	
	}

}
