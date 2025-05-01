package Arrays;

import java.util.Scanner;

public class Pair_Sum_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Array Size :");
		int size = sc.nextInt();
		
		int []a = new int[size];
		System.out.println("Enter The Array Elements :");
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter The Target Sum ");
		int tarSum = sc.nextInt();
		
		for(int i=0; i<size; i++) {
			for(int j=i+1; j<size;j++) {
				if(a[i]+a[j]==tarSum) {
					System.out.print("("+a[j]+","+a[i]+")"+" ");
				}
			}
		}
	}

}
