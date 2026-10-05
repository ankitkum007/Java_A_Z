package SingletonClass;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonMain {
	public static void main(String[] args) {
		Singleton obj1 = Singleton.getInstance();
		//Serialization 
		try {
			FileOutputStream fileoutput = new FileOutputStream("D:\\LearnFileHandling\\ObjectStream\\Demo.ser.txt");
			ObjectOutputStream writer = new ObjectOutputStream(fileoutput);
			writer.writeObject(obj1);
			
			writer.close();
			fileoutput.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Deserialization
		Singleton obj2 = null;
		try {
			FileInputStream fileInput = new FileInputStream("D:\\LearnFileHandling\\ObjectStream\\Demo.ser.txt");
			ObjectInputStream reader = new ObjectInputStream(fileInput);
			
			obj2 = (Singleton) reader.readObject();
			
			reader.close();
			fileInput.close();
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("Instance of Serialization: " + obj1.hashCode());
		System.out.println("Instance of Deserialization: " + obj2.hashCode());
		System.out.println("check both instance of same? " + (obj1 == obj2));
	}
}
