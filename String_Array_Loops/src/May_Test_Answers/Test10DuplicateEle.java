package May_Test_Answers;

import java.util.*;

public class Test10DuplicateEle {
	public static void main(String x[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of Array :");
		int size = sc.nextInt();
		int a[] = new int[size];

		System.out.println("Enter The Array Elements :");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}

		
		System.out.println("Duplicate Elements In Array : ");
		for(int i=0; i<a.length-1; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
					System.out.print(a[i]+" ");
				}
			}
		}
//		for (int i = 0; i < size; i++) {
//			if (a[i] == -1) {
//				continue;
//			}
//			boolean flag = false;
//			for (int j = i + 1; j < size; j++) {
//				if (a[i] == a[j]) {
//					a[j] = -1;
//					flag = true;
//				}
//			}
//			if (flag) {
//				System.out.print(a[i] + " ");
//				a[i] = -1;
//			}
//		}
	}
}