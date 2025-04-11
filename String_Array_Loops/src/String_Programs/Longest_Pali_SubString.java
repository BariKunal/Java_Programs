package String_Programs;

import java.util.Scanner;

public class Longest_Pali_SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = sc.nextLine();
		int last = str.length()-1;
		boolean flag=true ;
		
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);

			if(str.charAt(i) != str.charAt(last)) {
				flag = false;
				break;
			}
			--last;	
		}
		if(flag) {
			System.out.println("Palindrome...");
		}
		else {
			System.out.println("Not...");
		}
	}

}
