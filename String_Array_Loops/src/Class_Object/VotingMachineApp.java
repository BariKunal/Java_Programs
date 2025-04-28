//Q11. WAP Voting application using method with variable argos concept
//Voter: id name and age mark as POJO class 
//VotingMachine: void acceptWord(Voter …v): accept the infinite voter if voter age is greater than 18 then display its data otherwise not
//VotingMachineApp: this method cantains voter details and pass to VotingMachine class 

package Class_Object;

import java.util.Scanner;

class Voter {
	private int id;
	private String name;
	private int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

class VotingMachine {
	Voter v;

	void acceptVoter(Voter... v) {
		System.out.println("Eligible Candidates Are : ");
		System.out.println("ID\tName\tAge");
		for (int i = 0; i < v.length; i++) {
			if (v[i].getAge() >= 18) {
				System.out.println(v[i].getId() + "\t" + v[i].getName() + "\t" + v[i].getAge());
			}
		}
		System.out.println("\nNot Eligible Candidates Are : ");
		System.out.println("ID\tName\tAge");
		for (int i = 0; i < v.length; i++) {
			if (v[i].getAge() < 18) {
				System.out.println(v[i].getId() + "\t" + v[i].getName() + "\t" + v[i].getAge());
			}
		}
	}
}

public class VotingMachineApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Voter Numbers : ");
		int n = sc.nextInt();
		Voter v[] = new Voter[n];
		System.out.println("Enter The Voter Details :");
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.print("Enter The Voder ID : ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter The Voder Name : ");
			String name = sc.nextLine();
			System.out.print("Enter The Voder Age : ");
			int age = sc.nextInt();

			v[i] = new Voter();

			v[i].setId(id);
			v[i].setName(name);
			v[i].setAge(age);
			System.out.println();
		}

		VotingMachine vm = new VotingMachine();
		vm.acceptVoter(v);
	}

}
