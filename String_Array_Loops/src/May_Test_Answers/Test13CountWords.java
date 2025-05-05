package May_Test_Answers;

import java.util.*;
public class Test13CountWords
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String :");
		String str = sc.nextLine();
		int count = 0;
		boolean flag = false;
		
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			if(ch != ' ' && !flag)
			{
				count++;
				flag = true;
			}
			else if(ch == ' ') {
				flag = false;
			}
		}
		if(count>0)
		System.out.println("Count Is 1st: "+count);
		else System.out.println("Not Word Present in string...");
	}
}
