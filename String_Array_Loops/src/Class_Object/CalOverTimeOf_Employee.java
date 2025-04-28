//Q15.  Write a java Program to calculate overtime pay of 5 employees. The overtime pay rate is 
//	Rs.50/- (per Hour). Daily shift hour time is only 8 hours. 
//			
//Note- for a week only 40 hours of working are allowed. 
//1. Create class Employee with data member ID, Name, total working, salary, overtime
//Set Information by using a constructor and create a display Information() method to
//display all information with salary.
//2. Create Driver class name as OverTime with method setEmployee(Employee emp[]) and 
//void calculateOvertime() to calculate overtime. 


package Class_Object;

import java.util.Scanner;

class Employee {
	private int id;
	private String name;
	private int totalWorking;
	private int salary;

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getTotalWorking() {
		return totalWorking;
	}
	public int getSalary() {
		return salary;
	}
	
	Employee(int id, String name, int totalWorking, int salary) {
		this.id = id;
		this.name = name;
		this.totalWorking = totalWorking;
		this.salary = salary;
		
	}
	void DisplayInfo() {
		System.out.println("________________________________");
		System.out.println("Employee ID :"+id);
		System.out.println("Employee Name :"+name);
		System.out.println("Employee Total Working :"+totalWorking);
		System.out.println("Employee Salary :"+salary);
		
		System.out.println("________________________________");
	}
}

class OverTime{
	Employee []e;
	void setEmployee(Employee e[]){
		this.e=e;
	}
	void calculateOvertime() {

		for(int i=0; i<e.length; i++) {
			e[i].DisplayInfo();
			int otCal = 0;
			if(e[i].getTotalWorking() > 40) {
				otCal = e[i].getTotalWorking() - 40;
				
			}
			int overTimeSal = otCal * 50;
			System.out.println("Over Time Is :"+otCal);
			System.out.println("Over Time Salary :"+overTimeSal);
		}
		
	}
}

public class CalOverTimeOf_Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number of Employee Want to Add : ");
		int size = sc.nextInt();
		
		Employee emp[] = new Employee[size];
		System.out.println("Enter The Employee Details : ");
		System.out.println();
		for(int i=0; i<size; i++) {
			System.out.print("Enter The Employee ID :");
			int eid = sc.nextInt(); 
			sc.nextLine();
			System.out.print("Enter The Employee Name : ");
			String ename = sc.nextLine();
			System.out.print("Enter The Employee Salary :");
			int esal = sc.nextInt();
			System.out.print("Enter The Employee Total Working :");
			int ewk = sc.nextInt(); 
			
			
			emp[i] = new Employee(eid, ename, ewk, esal);
			
		}
		OverTime ot = new OverTime();
		ot.setEmployee(emp);
		ot.calculateOvertime();
	}

}
