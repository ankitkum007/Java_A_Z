package SingletonClass;

public class Singleton {
	private String name;
	private int age;
	private String dept;

	private static Singleton ref;

	private Singleton() {
	}

	private Singleton(String name, int age, String dept) {
		this.name = name;
		this.age = age;
		this.dept = dept;
	}

	public static Singleton getSingleton(String name, int age, String dept) {
		if (ref == null) {
			ref = new Singleton(name, age, dept);
		}
		return ref;
	}

	@Override
	public String toString() {
		return "Singleton [name=" + name + ", age=" + age + ", dept=" + dept +"]";
	}

}
