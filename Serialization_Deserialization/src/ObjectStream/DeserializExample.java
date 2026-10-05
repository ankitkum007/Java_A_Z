package ObjectStream;

import java.io.IOException;
import java.io.*;

public class DeserializExample {
	public static void main(String[] args){
		
		try {
			FileInputStream reader = new FileInputStream("D:\\LearnFileHandling\\ObjectStream\\UserObject.ser.txt");
			ObjectInputStream rederObj = new ObjectInputStream(reader);
			
			UserObject user = (UserObject) rederObj.readObject();
			System.out.println(user);
			rederObj.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			System.out.println("user data printed!");
		}
	}

}
