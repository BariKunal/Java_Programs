package Class_Object;

import java.util.Scanner;

class ReverseApp {
	ReverseApp(int a[]) {
//		int end = a.length-1;
		for (int i = 0; i < a.length / 2; i++) {
			int temp = a[i];
			a[i] = a[a.length - 1 - i];
			a[a.length - 1 - i] = temp;

//			int temp = a[i];
//				a[i] = a[end];
//				a[end] = temp;
//				end--;
		}
		System.out.println("Reverse Array Is : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	ReverseApp(String s) {
		String srt = "";
		for (int i = 0; i < s.length(); i++) {
			srt = s.charAt(i) + srt;
		}
		System.out.println("\nReverse String Is : " + srt);
	}

}

public class Constructor_Reverse_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of Array : ");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter The Array Elements : ");
		for (int i = 0; i < size; i++) { 
			a[i] = sc.nextInt();
		}
		sc.nextLine();
		System.out.println("Enter The String : ");
		String str = sc.nextLine();
		ReverseApp rev = new ReverseApp(a);

		ReverseApp r = new ReverseApp(str);

	}

}
