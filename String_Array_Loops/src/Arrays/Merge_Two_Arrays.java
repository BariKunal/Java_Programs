package Arrays;

import java.util.Scanner;

public class Merge_Two_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Array Size :");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		int b[] = new int[size];
		int c[] = new int[size+size];
		int k=0;
		
		System.out.println("Enter The "+size+" Elements In 1st Array :");
		for(int i=0; i<size; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter The "+size+" Elements In 2nd Array :");
		for(int i=0; i<size; i++) {
			b[i] = sc.nextInt();
		}
		
		for(int i=0; i<size; i++) {
			c[k++] = a[i];
		}
		for(int i=0; i<size; i++) {
			c[k++] = b[i];
		}
		
		System.out.println("Two Merge Array Are :");
		
		for(int i=0; i<c.length; i++) {
			System.out.print(c[i]+" ");
		}
	}

}
