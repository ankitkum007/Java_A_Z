package SingletonClass;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Singleton_Serialization {
	public static void main(String[] args) {
		SingletoneEmployee obj = SingletoneEmployee.getEmployee();
		String path = "D:\\LearnFileHandling\\ObjectStream\\Singleton.ser.txt";
		try {
			FileOutputStream outputPath =  new FileOutputStream(path);
			ObjectOutputStream writer = new ObjectOutputStream(outputPath);
			writer.writeObject(obj);
			
			writer.close();
			outputPath.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("instamce of ser: " + obj.hashCode());		
	}

}
