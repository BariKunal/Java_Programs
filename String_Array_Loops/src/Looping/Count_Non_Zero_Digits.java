//47. Count Non-Zero Digits
//Description: Write a program to count the number of non-zero digits in a number.
//Input: n = 1203
//
//
//Output: 3


package Looping;

import java.util.Scanner;

public class Count_Non_Zero_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number :");
		int num = sc.nextInt();
		int count = 0;

		while (num != 0) {
			int rem = num % 10;
			num /= 10;

			if (rem == 0) {
				count--;
			}
			count++;
		}
		System.out.println("Non Zero Digits Are : " + count);

	}
}