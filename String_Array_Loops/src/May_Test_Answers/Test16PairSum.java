package May_Test_Answers;

import java.util.*;
public class Test16PairSum
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of Array :");
		int size = sc.nextInt();
		int a[] = new int[size];
		
		System.out.println("Enter The Array Elements :");
		for(int i=0; i<size; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Enter The Target Sum :");
		int tarSum = sc.nextInt();
		
		System.out.println("Elements that Sum is = "+tarSum);
		for(int i=0; i<size; i++){
			for(int j=i+1; j<size; j++)
			{
				if(a[i]+a[j]==tarSum)
				{
					System.out.print("("+a[j]+","+a[i]+")");
				}
			}
		}
	}
}
