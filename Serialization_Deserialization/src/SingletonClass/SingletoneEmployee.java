package SingletonClass;

import java.io.Serializable;

public class SingletoneEmployee implements Serializable {
	
	private static final long serialVersionUID = 1L;
//	private String name;
//	private int id;
//	private double salary;
	
	private static SingletoneEmployee ref;
	
	private SingletoneEmployee() {}
	
	public static SingletoneEmployee getEmployee() {
		if(ref == null) {
			ref = new SingletoneEmployee();
		}
		return ref;
	}

}
