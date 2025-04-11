package String_Programs;

import java.util.*;

public class Non_Repeating_Char_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String :");		//swiss --> o/p = w
		String str = sc.nextLine();

		String str1 = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			boolean flag = true;
			for (int j = 0; j < str.length(); j++) {
				if (i != j && ch == str.charAt(j)) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println("First Non-Repeating Character : "+ch);
				return;
			}
		}
		System.out.println("There is no Non-Repeating Character");
	}

}
