package May_Test_Answers;

import java.util.*;
public class Test20RemoveVow
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String :");
		String str = sc.nextLine();
		String empty = "";
		for(int i=0; i<str.length(); i++)
		{
			char ch[] = str.toCharArray();
			if(ch[i]!='a' && ch[i]!='e' && ch[i]!='i' && ch[i]!='o' && ch[i]!='u' && ch[i]!='A' && ch[i]!='E' && ch[i]!='I' && ch[i]!='O' && ch[i]!='U')
			{
				empty += ch[i];
			}
			//OR
			//if(str.charAt(i)!='a' && str.charAt(i)!='e' && str.charAt(i)!='i' && str.charAt(i)!='o' && str.charAt(i)!='u')
			//{
			//	empty += str.charAt(i);
			//}
			
		}
		System.out.println("After removing vowels from string...");
		System.out.println(empty);
	}
}