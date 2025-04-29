//Q17. Write Program to create abstract class name as Value with one abstract and one non abstract method
//void setValue(int ,int): this is non abstract method with two parameter abstract
// int getResult(): this is abstract method and you have two child class name as Power and you have to override getResult() method in Power class and calculate power of two values and return it as well as SearchDigit and you have to override getResult() consider first parameter of setValue() is number and second parameter is digit and you have to search digit in number and return it and if digit not found return -1.

package Class_Object;

import java.util.Scanner;

abstract class Value {
	int num1, num2;

	void setValue(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	abstract int getResult();
}

class Power extends Value {
	 int getResult() {
		int power = 1;
		for (int i = 1; i <= num2; i++) {	//num1=index
			power = power * num1;//base;
		}
		return power;
	}
}

class SearchDigit extends Value{
	int getResult() {
		while(num1!=0) {
			int rem =  num1 % 10;
				if(rem == num2) {
					return num2;
				}
				num1/=10;
		}
		return -1;
	}
}

public class Abstract_Power_And_SearchDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Base : ");
		int b = sc.nextInt();
		System.out.print("Enter The Index : ");
		int ind = sc.nextInt();

		Power p = new Power();
		p.setValue(b, ind);
		int res = p.getResult();
		System.out.println("\nPower Is : " + res);
		System.out.println("-------------------------");
		
		System.out.print("\nEnter The Number : ");
		int num = sc.nextInt();
		System.out.print("Enter The Search Element : ");
		int skey = sc.nextInt();
		SearchDigit sd = new SearchDigit();
		sd.setValue(num, skey);
		int SearchRes = sd.getResult();
		if(SearchRes != -1) {
			System.out.println("\nDigit Found...");
		}
		else {
			System.out.println("\nNot Found...");
		}
		
	}

}
