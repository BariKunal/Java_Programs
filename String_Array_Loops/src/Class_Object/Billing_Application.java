// Q10. WAP to create billing application 
//Classes 
//Customer : id,name and mobile mark as POJO class
//Product class: id,name,price,qty,rate 
//Bill class contain method 
//void calBill(Customer c,Product …p): this function can accept single customer detail and multiple product details and your output should like as

package Class_Object;

import java.util.Scanner;

class Customer {
	private int Cid;
	private String Cname;
	private int mobNum;

	public int getCid() {
		return Cid;
	}

	public void setCid(int cid) {
		Cid = cid;
	}

	public String getCname() {
		return Cname;
	}

	public void setCname(String cname) {
		Cname = cname;
	}

	public int getMobNum() {
		return mobNum;
	}

	public void setMobNum(int mobNum) {
		this.mobNum = mobNum;
	}

}

class Product {
	private int id;
	private String name;
	private int price;
	private int qty;
	private int rate;

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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}
}

class Bill {
	Customer c;
	Product p;

	void calBill(Customer c, Product... p) {
		System.out.println("Customer ID : " + c.getCid());
		System.out.println("Customer Name : " + c.getCname());
		System.out.println("Customer Mobile Number : " + c.getMobNum());
		System.out.println("\n");
		System.out.println("\n... Product Details ...");
		int grandTotal = 0;
		System.out.println("Id\tName\tPrice\tQty\n");
		for (int i = 0; i < p.length; i++) {
			Product prod = p[i];
			int total = prod.getPrice() * prod.getQty();
			grandTotal += total;

			System.out.println(prod.getId() + "\t" + prod.getName() + "\t" + prod.getPrice() + "\t" + prod.getQty());

		}
		System.out.println("_____________________________");
		System.out.println("\nTotal\t\t : " + grandTotal);
	}
}

public class Billing_Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Customer c = new Customer();

		System.out.print("Enter The Customer Id : ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter The Customer Name : ");
		String name = sc.nextLine();
		System.out.print("Enter The Customer Mobile Number : ");
		int num = sc.nextInt();

		c.setCid(id);
		c.setCname(name);
		c.setMobNum(num);

		System.out.println("\nEnter The Number Products : ");
		int n = sc.nextInt();

		Product p[] = new Product[n]; // Product array of object

		for (int i = 0; i < n; i++) {
			System.out.print("Enter The Product Id : ");
			int pid = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter The Product Name : ");
			String pname = sc.nextLine();
			System.out.print("Enter The product Price : ");
			int pprice = sc.nextInt();
			System.out.print("Enter The product Quantity : ");
			int pqty = sc.nextInt();
//			System.out.print("Enter The product Rate : ");
//			int prate = sc.nextInt();

			Product prod = new Product();
			p[i] = prod; // object creation

			prod.setId(pid);
			prod.setName(pname);
			prod.setQty(pqty);
			prod.setPrice(pprice);
//			prod.setRate(prate);
		}

		Bill bill = new Bill();
		bill.calBill(c, p);
	}

}
