package transientField;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializStudent {
	public static void main(String[] args) {
		String path = "D:\\LearnFileHandling\\ObjectStream\\Student.ser.txt";
		try {
			FileInputStream inputpath = new FileInputStream(path);
			ObjectInputStream reader = new ObjectInputStream(inputpath);
			
			Student stud = (Student) reader.readObject();
			System.out.println(stud);
			
			reader.close();
			inputpath.close();
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			System.out.println("dispaly tha student data sucessfully");
		}
	}

}
