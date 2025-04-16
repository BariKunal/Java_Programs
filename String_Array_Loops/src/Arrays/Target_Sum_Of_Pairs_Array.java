package Arrays;

import java.util.Scanner;

public class Target_Sum_Of_Pairs_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the array size :");
		int size = sc.nextInt();
		int []a = new int[size];
		System.out.println("Enter The Array Elements :");
		for(int i=0; i<size; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter The Target Sum :");
		int target = sc.nextInt();
		
		System.out.println("Sum Of Target Elements :");
		for(int i=0; i<size; i++) {
			for(int j=i+1; j<size; j++) {
				if(a[i]+a[j]==target) {
					System.out.print(a[i]+" "+a[j]+" ,");
				}
				else {
					System.out.println("There Is No Sum Elements Available in Array....");
					return ;
				}
			}
		}
	}

}
