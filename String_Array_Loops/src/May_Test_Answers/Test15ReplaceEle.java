package May_Test_Answers;

import java.util.*;

public class Test15ReplaceEle {
	public static void main(String x[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String :");
		String str = sc.nextLine();

		// String empty = "";

		String str2 = "";

		System.out.println("Enter the character to be replaced");
		char ch2 = sc.next().charAt(0);

		System.out.println("Enter the character to replace");
		char ch1 = sc.next().charAt(0);

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch2) {
				str2 = str2 + ch1;
				continue;
			}
			str2 = str2 + str.charAt(i);
		}
		System.out.println(str2);

	}
}