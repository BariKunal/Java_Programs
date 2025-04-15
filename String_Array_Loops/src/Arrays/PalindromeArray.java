package Arrays;

import java.util.Scanner;

public class PalindromeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter The Array Size :");
		int size = sc.nextInt();
		int a[] = new int[size];
		boolean flag=true;
		int last = size-1;
		
		System.out.print("Enter The Array Elements :");
		for(int i=0; i<size; i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0; i<size/2; i++) {
			if(a[i]!=a[last]) {
				flag = false;
				break;
			}	
			last--;
		}
		if(flag) {
			System.out.println("Palidrom Array ");
		}
		else {
			System.out.println("Not Palindrome ");
		}
	}

}
