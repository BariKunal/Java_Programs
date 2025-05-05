package May_Test_Answers;

import java.util.*;
public class Test11MissingNum
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
		
		for(int i=0; i<size; i++){
			for(int j=i+1; j<size; j++)
			{
				if(a[i]>a[j]){
					int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
				}
			}
		}
		System.out.println("Sorted Array :");
		for(int i=0; i<size; i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println("\nMissing Element In Array :");
		for(int i=0; i<size-1; i++){
			for(int j=a[i]+1; j<a[i+1]; j++)
			{
				System.out.print(j+" ");
			}
		}
	}
}