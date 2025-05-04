package May_Test_Answers;

import java.util.*;
public class TestArrayPalin
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of Array :");
		int size = sc.nextInt();
		int a[] = new int[size];
		
		int last=size-1;
		System.out.println("Enter The Array Elements :");
		for(int i=0; i<size; i++)
		{
			a[i] = sc.nextInt();
		}
		
		boolean flag = true;
		for(int i=0; i<size/2; i++){
			if(a[i]!=a[last])
			{
				flag = false;
				break;
			}
			last--;
		}
		
		if(flag)
		{
			System.out.println("Array Is Palindrome...");
		}
		else{
			System.out.println("Array Is Not Palindrome...");
		}
	}
}