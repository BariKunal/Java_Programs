package Arrays;

import java.util.Scanner;

public class Rotate_Array_Spec_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Array Size :");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		
		System.out.println("Enter The "+size+" Elements In Array :");
		for(int i=0; i<size; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter The Index to Rotate The Array :");
		int index = sc.nextInt();
		
		
		for(int i=index; i<size; i++) {
			System.out.print(a[i]+" ");
		}
		
		for(int i=0; i<index; i++) {
			System.out.print(a[i]+" ");
		}
		
	}

}
