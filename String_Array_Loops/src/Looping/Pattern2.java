package Looping;
import java.util.*;
public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number :");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			int num = (n+1) - i;
			for (int j = 1; j <= n; j++) {
				if (i <= j) {

					System.out.print(num + " ");
					num--;

				}

			}
			System.out.println();
		}
	}

}
