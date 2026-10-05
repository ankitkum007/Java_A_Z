package ObjectStream;

import java.io.Serializable;

public class UserObject implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private int id;
	private String dept;


	public UserObject(String name, int age, int id, String dept) {
		this.name = name;
		this.id = id;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", id=" + id + ", dept=" + dept + "]";
	}

}
