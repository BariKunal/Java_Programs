//Q3. WAP to create class name as Perfect with two functions 
//void setValue(): this function can accept number as parameter 
//void checkPerfect(): this function can check number is perfect or not if perfect the show message number is perfect if not then show message number is not perfect

package Functions;

import java.util.Scanner;

public class PerfectNum_Two_Fun {

	int num;

	void setValue(int num) {
		this.num = num;
	}

	void checkPerfect() {
		int i = 1;
		int sum = 0;
		while (i < num) {
			if (num % i == 0) {
				sum = sum + i;
			}
			i++;
		}
		if (sum == num) {
			System.out.println("Number Is Perfect...");
		} else {
			System.out.println("Number Is Not Perfect...");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int num = sc.nextInt();
		PerfectNum_Two_Fun fn = new PerfectNum_Two_Fun();
		fn.setValue(num);
		fn.checkPerfect();
	}

}
