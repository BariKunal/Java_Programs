package Class_Object;

import java.util.Scanner;

class OccurenceApp {
	OccurenceApp(int a[]) {
		int even = 0;
		int odd = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("Even Numbers Count : " + even);
		System.out.println("Odd Numbers Count : " + odd);
	}

	OccurenceApp(String s) {
		String vowel = "aeiouAEIOU";
		int vowelCount = 0;
		int ConsCount = 0;
		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowelCount++;
			} else {
				ConsCount++;
			}
		}

		System.out.println("Vowels Count : " + vowelCount);
		System.out.println("Consonents Count : " + ConsCount);
	}

}

public class Cunstructor_OccurenceApp {

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
		OccurenceApp oc = new OccurenceApp(a);

		OccurenceApp occ = new OccurenceApp(str);
	}

}
