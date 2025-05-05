package May_Test_Answers;

import java.util.*;
public class Test12StringPalin
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String :");
		String str = sc.nextLine();
		int last = str.length()-1;
		
		boolean flag = true;
		for(int i=0; i<str.length()/2; i++)
		{
			if(str.charAt(i)!=str.charAt(last))
			{
				flag = false;
				break;
			}
			last--;
		}
		if(flag)
		{
			System.out.println("String Is Palindrome...");
		}
		else{
			System.out.println("String Is Not Palindrome...");
		}
	}
}