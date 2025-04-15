package Arrays;

import java.util.Scanner;

public class Duplicate_Ele_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Array Size :");
		int size = sc.nextInt();
		int a[] = new int[size];

		System.out.print("Enter The Array Elements :");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Duplicates Elements In Array :");
		
		for (int i = 0; i < size; i++) {
			if (a[i] == -1) {
				continue;
			}
			
			boolean flag = false;
			
			for (int j = i + 1; j < size; j++) {
				if (a[i] == a[j]) {
					flag = true;
					a[j] = -1;
				}
			}
			if (flag) {
				System.out.print(a[i] + " ");
				a[i] = -1;
			}
		}
	}

}
