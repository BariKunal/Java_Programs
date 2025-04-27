//Q4. WAP to create class name as Reverse with two functions 
//void setNumber(): this function can accept the number from keyboard 
//void reverseNumber(): this function can reverse the number and display it

package Functions;

import java.util.Scanner;

public class ReverseNum_Fun {

	int num;

	void setNumber(int num) {
		this.num = num;
	}

	void reverseNumber() {
		int rev = 0;
		while (num != 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num /= 10;
		}
		System.out.println("Reverse Number Is : " + rev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number :");
		int num = sc.nextInt();

		ReverseNum_Fun r = new ReverseNum_Fun();
		r.setNumber(num);
		r.reverseNumber();
	}

}
