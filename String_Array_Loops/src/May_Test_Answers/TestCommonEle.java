package May_Test_Answers;

import java.util.*;
public class TestCommonEle
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of Array :");
		int size = sc.nextInt();
		int a[] = new int[size];
		int b[] = new int[size];
		System.out.println("Enter The 1st Array Elements :");
		for(int i=0; i<size; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Enter The 2nd Array Elements :");
		for(int i=0; i<size; i++)
		{
			b[i] = sc.nextInt();
		}
		
		//boolean flag = false;
		System.out.println("Common Elements In Two Arrays :");
		for(int i=0; i<size; i++){
			for(int j=0; j<size; j++){
				if(a[i]==b[j])
				{
					System.out.print(a[i]+" ");
					//flag = true;
				}
				//else{
				//	flag=false;
				//}
			}
		}
		//if(flag) System.out.println("Not Common Elements in both arrays...");
	}
}