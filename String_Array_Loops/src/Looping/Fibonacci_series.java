package Looping;

import java.util.Scanner;

public class Fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int fib = 0, f1 = 0, f2 = 1;
		System.out.println("Enter The Limit :");
		int limit = sc.nextInt();
		while(limit>0) {
			System.out.print(f1 +" ");
			fib = f1 + f2;
			f1 = f2;
			f2 = fib;
			limit--;
		}
	}

}
