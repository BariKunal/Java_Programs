package May_Test_Answers;

import java.util.*;

public class Test17KthSamllestEle {
	public static void main(String x[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of Array :");
		int size = sc.nextInt();
		int a[] = new int[size];

		System.out.println("Enter The Array Elements :");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		System.out.println("Enter The Kth Element ");
		int kth = sc.nextInt();

		int count = 0;
		for (int i = 0; i < size - 1; i++) {
			if (a[i] != a[i + 1]) {
				count++;

			}
			if (count == kth) {
				System.out.println("Kth " + kth + " Smallest Number : " + a[i]);
				break;
			}
		}

	}
}