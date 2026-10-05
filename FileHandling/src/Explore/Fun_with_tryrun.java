package Explore;

public class Fun_with_tryrun {
	public static void main(String[] args) {
		int count = 1;
		try {
			count++;
			System.out.println(count);
			System.exit(count);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("finally block");
		}
	}
}
