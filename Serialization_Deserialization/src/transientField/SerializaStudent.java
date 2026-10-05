package transientField;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializaStudent {
	public static void main(String[] args) {
		String path = "D:\\LearnFileHandling\\ObjectStream\\Student.ser.txt";
		Student stud = new Student("jct", "ankit", 7209, 12345);
		try {
			FileOutputStream outputpath = new FileOutputStream(path);
			ObjectOutputStream writer = new ObjectOutputStream(outputpath);
	
			writer.writeObject(stud);
			
			writer.close();
			outputpath.close();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			System.out.println("studnet object in store in file");
		}
	}

}
