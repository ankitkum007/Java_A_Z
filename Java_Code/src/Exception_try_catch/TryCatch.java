package Exception_try_catch;



public class TryCatch {
	public static void main(String[] args) {
		String str = "one"; 
		try {
			Integer.parseInt(str);
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
		
	}
}
