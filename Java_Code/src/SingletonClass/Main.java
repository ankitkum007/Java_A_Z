package SingletonClass;

public class Main {
	public static void main(String[] args) {
	  Singleton s1 = Singleton.getSingleton("ankit", 23, "cse");
	  Singleton s2 = Singleton.getSingleton("nilesh", 23, "devloper");
	  
	  System.out.println(s1);
	  System.out.println(s2);
	}
}
