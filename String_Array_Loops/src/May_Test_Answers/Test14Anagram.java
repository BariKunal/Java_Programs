package May_Test_Answers;

import java.util.*;
public class Test14Anagram
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The 1st String :");
		String str = sc.nextLine();
		System.out.println("Enter The 2nd String :");
		String str1 = sc.nextLine();
		
		char []ch1 = str.toCharArray();
		char []ch2 = str1.toCharArray();
		
		if(ch1.length!=ch2.length)
		{
			System.out.println("Not Anagram String... ");
			return;
		}
		for(int i=0; i<str.length(); i++)
		{
			for(int j=i+1; j<str.length(); j++)
			{
				if(ch1[i]>ch1[j])
				{
					char temp = ch1[i];
						ch1[i] = ch1[j];
						ch1[j] = temp;
				}
			}
		}
		
		for(int i=0; i<str.length(); i++)
		{
			for(int j=i+1; j<str1.length(); j++)
			{
				if(ch2[i]>ch2[j])
				{
					char temp = ch2[i];
						ch2[i] = ch2[j];
						ch2[j] = temp;
				}
			}
		}
		
		boolean flag = true;
		for(int i=0; i<ch1.length; i++){
			if(ch1[i]!=ch2[i])
			{
				flag = false;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Anagram String...");
		}
		else{
			System.out.println("Not Anagram String...");
		}
	}
}