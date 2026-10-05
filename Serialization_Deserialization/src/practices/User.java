package practices;

import java.io.Serializable;

public class User implements Serializable {
	
//	private static final long serialVersionUID = 1L;
//	private static final long serialVersionUID = -3793603216118977921L;
	
	private static final User INSTANCE = new User();
	
	private User() {};
	
	
	
	String name;
	int age;
	int salary;
	transient int phoneNumber;
//	int phoneNumber;
	
	public User(String name, int age, int salary, int phoneNumber) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.phoneNumber = phoneNumber;
	}
	
	public static User getUser() {
		return INSTANCE;
	}
	
	private Object readResolve() {
		return INSTANCE;
	}
	
}