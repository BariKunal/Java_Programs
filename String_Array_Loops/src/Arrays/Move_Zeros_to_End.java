package Arrays;

import java.util.Scanner;

public class Move_Zeros_to_End {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Array Size :");
		int size = sc.nextInt();

		int a[] = new int[size];

		System.out.println("Enter The " + size + " Elements In Array :");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] == 0) {

				for (int j = i; j < a.length-1; j++) {
					a[j] = a[j+1];
				}
				a[a.length-1]=0;
			}
			

		}
		System.out.println("Move all zeros to end :");
		for (int i = 0; i < size; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
