package ClientApp;

import java.util.Scanner;

import Model.ProductModel;
import Service.ProductServiceImpl;

public class ClientApplication {
	static ProductServiceImpl prodService = new ProductServiceImpl();
	public static void main(String[] args) {
		
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("1:Add Products in collection ");
            System.out.println("2:View All products in collection");
            System.out.println("3:Search Product from collection ");
            System.out.println("4:Delete Product from collection");
            System.out.println("5:Count total number of products from collection");
            System.out.println("6:get valid customers visited shop");
            System.out.println("7: delete customer  record");
            System.out.println("8: view individual customer  record");
            System.out.println("12:leave as owner");
            System.out.println("13:leave hole system");
			System.out.println("Enter Your Choice :");
			int ch = sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter product id:");
				int id = sc.nextInt();
				System.out.println("enter name");
                String name = sc.next();
                System.out.println("entor company");
                String company = sc.next();
                System.out.println("enter price");
                int price = sc.nextInt();
                System.out.println("enter qntity");
                int qty = sc.nextInt();
                System.out.println("enter stock");
                int stock = sc.nextInt();
                
                ProductModel proModel = new ProductModel(id,name,company,price,qty,stock);
				break;
			case 2:
				break;
				default:
					System.out.println("Invalid Choice...");
			}
		}while(true);
		

	}

}
