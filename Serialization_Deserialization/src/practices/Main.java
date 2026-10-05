package practices;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		User user1 = new User("ankit", 24, 50000, 1234567);
		User user2 = new User("nilesh", 25, 60000, 1234567);
		User user3 = new User("mukesh", 26, 70000, 1234567);
		User user4 = new User("pulkit", 26, 80000, 1234567);
		User user5 = new User("nirmala", 34, 80000, 1234567);

		List<User> users = Arrays.asList(user1, user2, user3, user4, user5);

		try {
			ObjectOutputStream fileout = new ObjectOutputStream(
					new FileOutputStream("D:\\LearnFileHandling\\ObjectStream\\User.ser.txt"));
			fileout.writeObject(users);

			fileout.close();

			System.out.println("user data in store ");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		List<User> userInfo  = null;
		try {
			ObjectInputStream fileinput = new ObjectInputStream(
					new FileInputStream("D:\\LearnFileHandling\\ObjectStream\\User.ser.txt"));

			 userInfo = (List<User>) fileinput.readObject();

			for (User ans : userInfo) {
				System.out.println(ans.name + " " + ans.age + " " + ans.salary + " " + ans.phoneNumber);
			}
			User u1 = User.getUser();
			
			System.out.println(users == userInfo);

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}