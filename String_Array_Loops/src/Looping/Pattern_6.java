package Looping;

import java.util.Scanner;

public class Pattern_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number :");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=num; j++) {
				if(i>=j) {
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
	}

}
