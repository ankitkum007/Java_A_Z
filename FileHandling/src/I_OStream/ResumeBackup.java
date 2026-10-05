package I_OStream;

//import java.io.FileInputStream;
//import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ResumeBackup {
	public static void main(String[] args) {

		try (FileReader input = new FileReader("D:\\LearnFileHandling\\I_OStream\\resumefile\\Ankit_Resume.pdf");
			FileWriter output = new FileWriter("D:\\LearnFileHandling\\I_OStream\\backupresumefile\\resumeBackup.txt");
			) {
//			FileInputStream inPath = new FileInputStream("D:\\LearnFileHandling\\I_OStream\\resumefile\\Ankit_Resume.pdf");
//			FileOutputStream opPath = new FileOutputStream("D:\\LearnFileHandling\\I_OStream\\backupresumefile\\resumeBackup.txt");

			int data;
			while ((data = input.read()) != -1) {
				output.write(data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.print("backup successfuly");
		}
		
	}

}
