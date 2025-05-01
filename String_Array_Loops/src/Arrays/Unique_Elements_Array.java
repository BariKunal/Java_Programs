package Arrays;

import java.util.Scanner;

public class Unique_Elements_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Array Size :");
		int size = sc.nextInt();
		
		int []a = new int[size];
		System.out.println("Enter The Array Elements :");
		for(int i=0; i<size; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Unique Elements In Array :");
		for(int i=0; i<size; i++) {
			boolean flag = true;
			for(int j=0; j<size; j++) {
				if(i!=j && a[i]==a[j]) {
					flag = false;
					break;
				}
				
			}
			if(flag) {
				System.out.print(a[i]+" ");
			}
		}
	}

}
