package SingletonClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Singleton_Deserialization {
	public static void main(String[] args) {
		String path = "D:\\LearnFileHandling\\ObjectStream\\Singleton.ser.txt";
		SingletoneEmployee obj2 = null;
		
		try {
			FileInputStream inputPath = new FileInputStream(path);
			ObjectInputStream reader = new ObjectInputStream(inputPath);
			
			obj2 = (SingletoneEmployee) reader.readObject();
			
			reader.close();
			inputPath.close();
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("instance deser hashcode: " + obj2.hashCode());
	}

}
