//Q2. WAP to create class name as Factorial with two functions 
//void setNumber(): this function can accept the number as parameter
//void displayFactorial(): this function can display the factorial of number  

package Functions;

import java.util.Scanner;

public class Factorial_With_Two_Function {

	int n;

	void setValue(int n) {
		this.n = n;
	}

	void displayFactorial() {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("Factoria Is : " + fact);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number :");
		int num = sc.nextInt();
		Factorial_With_Two_Function fn = new Factorial_With_Two_Function();
		fn.setValue(num);
		fn.displayFactorial();

	}

}
