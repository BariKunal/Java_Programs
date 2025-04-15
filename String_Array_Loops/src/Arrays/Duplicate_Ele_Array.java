package Arrays;

import java.util.Scanner;

public class Duplicate_Ele_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter The Array Size :");
		int size = sc.nextInt();
		int a[] = new int[size];
		boolean flag=true;
		
		System.out.print("Enter The Array Elements :");
		for(int i=0; i<size; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Duplicates Elements In Array :");
		
	}

}
