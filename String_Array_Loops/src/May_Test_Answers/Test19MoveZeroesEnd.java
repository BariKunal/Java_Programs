package May_Test_Answers;

import java.util.*;
public class Test19MoveZeroesEnd
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
		
		int sum = 0;
		for(int i=0; i<size-1; i++){
			if(a[i]==0)
			{
				for(int j=i; j<size-1; j++)
				{
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
			//a[a.length-1] = 0;
		}
		for(int i=0; i<size; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
