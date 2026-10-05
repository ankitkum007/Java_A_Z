package ObjectStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializaExample {
	public static void main(String[] args) {
		UserObject user = new UserObject("ankit", 23, 007, "cse" );
		
		try {
			FileOutputStream writer = new FileOutputStream("D:\\LearnFileHandling\\ObjectStream\\UserObject.ser.txt");
			ObjectOutputStream writerObj = new ObjectOutputStream(writer);
			
			writerObj.writeObject(user);
			writerObj.close();
		} catch (IOException e) {
		 e.printStackTrace();
		}finally {
			System.out.println("user data are stored in UsserObject.ser file");
		}
	}

}
