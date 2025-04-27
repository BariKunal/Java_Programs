//Q5. WAP to create class name as CountDigit with two functions 
// void setValue(): this function can accept number from keyboard 
// void showDigitCount(): this function can count the digit and display it.

package Class_Object;

import java.util.Scanner;

class CountDigit {
	int num;

	void setValue(int num) {
		this.num = num;
	}

	void showDigitCount() {
		int count = 0;
		while (num != 0) {
			num /= 10;
			count++;
		}
		System.out.println("Count Digits Are : " + count);
	}
}

public class CountDigits_Two_Fun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int number = sc.nextInt();
		CountDigit cd = new CountDigit();
		cd.setValue(number);
		cd.showDigitCount();
	}

}
