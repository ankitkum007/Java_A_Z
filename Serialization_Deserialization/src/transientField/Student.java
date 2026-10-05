package transientField;

import java.io.Serializable;

public class Student implements Serializable{
	private static final long serialVersionUID = 1L;
	private String colg;
	private String name;
	private transient int studId;
	private transient int password;
	
	public Student() {}

	public Student(String colg, String name, int studId, int password) {
		super();
		this.colg = colg;
		this.name = name;
		this.studId = studId;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Student [colg=" + colg + ", name=" + name + ", studId=" + studId + ", password=" + password + "]";
	}

}
