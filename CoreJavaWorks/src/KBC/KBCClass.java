package KBC;

import java.util.Scanner;

public class KBCClass {

	public static boolean key = true;

	public static void main(String[] args) {
		Questions[] question = new Questions[] { new Questions("Abcd", "A", "B", "C", "D", "A"),
				new Questions("aBcd", "A", "B", "C", "D", "B"), new Questions("abCd", "A", "B", "C", "D", "C"),
				new Questions("abcD", "A", "B", "C", "D", "D") };
		for (Questions temp : question) {
			System.out.println(temp);
			Scanner sc = new Scanner(System.in);
			String j = sc.next();
			while (sc.next().isEmpty() && key) ;
			if(key == false) {
				System.out.println("\nLost Game\n");
				return;
			}

		}
	}
}

class Questions {
	String q;
	String optionA;
	String optionB;
	String optionC;
	String optionD;
	String answer;

	public Questions(String q, String optionA, String optionB, String optionC, String optionD, String answer) {
		this.q = q;
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionC = optionC;
		this.optionD = optionD;
		this.answer = answer;
	}

	@Override
	public String toString() {
		return (q);
	}

}
