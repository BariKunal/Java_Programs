package Looping;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number :");
		int row = sc.nextInt();
		int col;
		
		if (row % 2 == 0)
			col = row + 3;
		else
			col = row + 4;

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= col; j++) {
				if (j > (col / 2 + 2) - i && j < i + (col / 2 )) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
