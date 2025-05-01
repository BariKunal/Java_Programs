//17. Check if String Contains All Unique Characters
//Description: Check if a string contains all unique characters.
//
//Input: "abcdef"
//
//Output: true


package String_Programs;

import java.util.Scanner;

public class All_Unique_Characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String :");
		String str = sc.nextLine();
		boolean flag = true;
		for(int i=0; i<str.length(); i++) {
			//char ch = str.charAt(i);
			for(int j=i+1; j<str.length(); j++) {
				if(str.charAt(i)==str.charAt(j)) {
					flag=false;
					break;
				}
			}
		}
		if(flag)  System.out.println("Unique Characters : True");
		else	System.out.println("False");
	}

}
