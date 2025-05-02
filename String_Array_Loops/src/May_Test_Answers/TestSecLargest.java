package May_Test_Answers;
import java.util.*;
public class TestSecLargest {
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
		
		int max = a[0];
		int secMax = 0;
		for(int i=0; i<size; i++){
			if(a[i]>max)
			{
				max = a[i];
			}
		}
		for(int i=0; i<size; i++){
			if(a[i]<max && max!=secMax)
			{
				secMax = a[i];
			}
		}
					
		System.out.println("Second Largest Element In Array "+secMax);
		
	}
}
