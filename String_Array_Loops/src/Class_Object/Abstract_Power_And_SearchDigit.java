//Q17. Write Program to create abstract class name as Value with one abstract and one non abstract method
//void setValue(int ,int): this is non abstract method with two parameter abstract
// int getResult(): this is abstract method and you have two child class name as Power and you have to override getResult() method in Power class and calculate power of two values and return it as well as SearchDigit and you have to override getResult() consider first parameter of setValue() is number and second parameter is digit and you have to search digit in number and return it and if digit not found return -1.

package Class_Object;

import java.util.Scanner;

abstract class Value {
	int base, index;

	void setValue(int base, int index) {
		this.base = base;
		this.index = index;
	}

	abstract int getResult();
}

class Power extends Value {
	public int getResult() {
		int power = 1;
		for (int i = 1; i <= index; i++) {
			power = power * base;
		}
		return power;
	}

}

public class Abstract_Power_And_SearchDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Base : ");
		int b = sc.nextInt();
		System.out.println("Enter The Index : ");
		int ind = sc.nextInt();

		Power p = new Power();
		p.setValue(b, ind);
		int res = p.getResult();
		System.out.println("Power Is : " + res);
	}

}
