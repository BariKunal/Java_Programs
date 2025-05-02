package May_Test_Answers;
import java.util.*;
public class TestSeries_1 {
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Limit :");
		int limit = sc.nextInt();
		int num=1;
		for(int i=1; i<=limit; i++)
		{
			
			System.out.print(num+" ");
			num = num*10+1;
		}
	}
}
