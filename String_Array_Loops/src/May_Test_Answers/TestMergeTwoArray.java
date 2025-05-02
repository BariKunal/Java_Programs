package May_Test_Answers;
import java.util.*;
public class TestMergeTwoArray {
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of Array :");
		int size = sc.nextInt();
		int a[] = new int[size];
		int b[] = new int[size];
		int c[] = new int[size+size];
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
		int k=0;
		for(int i=0; i<a.length; i++)
		{
			c[k++] = a[i];
		}
		for(int i=0; i<b.length; i++)
		{
			c[k++] = b[i];
		}
		System.out.println("Two Merge Arrays Are :");
		for(int i=0; i<c.length; i++)
		{
			System.out.print(c[i]+" ");
		}
	}
}
