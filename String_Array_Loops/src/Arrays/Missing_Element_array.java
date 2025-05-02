package Arrays;

import java.util.Scanner;

public class Missing_Element_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The array size :");
		int size = sc.nextInt();

		int[] a = new int[size];
		System.out.println("Enter the array elements :");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < size; i++) { // sorting of array if not sorted..
			for (int j = i + 1; j < size; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		System.out.print("Missing Elements :");
		for (int i = 0; i < size - 1; i++) {
			for (int j = a[i] + 1; j < a[i + 1]; j++) {

				System.out.print(j + " ");

			}
		}
	}

}
