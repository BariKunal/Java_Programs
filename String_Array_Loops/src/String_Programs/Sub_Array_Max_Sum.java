package String_Programs;

import java.util.Scanner;

public class Sub_Array_Max_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Size of Array :");
		int size = sc.nextInt();
		int a[] = new int[size];
		
		System.out.println("Enter The Array Elements :");
		for(int i=0; i<size; i++) {
			a[i]=sc.nextInt();
		}
		int maxSum = a[0];
		int curSum = 0;
		for(int i=0; i<a.length; i++)
		{
			curSum += a[i];
			
			if(curSum>maxSum) {
				maxSum=curSum;
			}
			if(curSum<0) {
				curSum=0;
			}
		}
		System.out.println("Maximum Sum :"+maxSum);
	}

}
