package CustomeException;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		try {
			checkAge(age);
			System.out.println("your are aligible for vote");
		} catch(VoteAge e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}
	
	public static void checkAge(int age) throws VoteAge {
		if(age < 18) {
			throw new VoteAge("only 18 and above 18 age are aligibal for voting");
		}
	}
}
