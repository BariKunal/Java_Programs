package ClientApp;
import java.util.*;
import java.util.Scanner;

import Model.ProductModel;
import Service.ProductServiceImpl;

public class ClientApplication {
	static ProductServiceImpl prodService = new ProductServiceImpl();
		//ProductServiceImpl pmi = new ProductServiceImpl();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
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
				System.out.print("Enter product id : ");
				int id = sc.nextInt();
				System.out.print("enter name : ");
                String name = sc.next();
                System.out.print("enter company : ");
                String company = sc.next();
                System.out.print("enter price : ");
                int price = sc.nextInt();
                System.out.println("enter qntity : ");
                int qty = sc.nextInt();
                System.out.print("enter stock : ");
                int stock = sc.nextInt();
                
                ProductModel proModel = new ProductModel(name,id,stock,price,company,qty);
               
                boolean b = prodService.isAddNewProduct(proModel);
                if (b)
                    System.out.println("product added\n\n");
                else
                    System.out.println("product not added\n\n");
				break;
			case 2:
                List al = prodService.getAllProducts();
               
                System.out.println("=====================================================");
                for(Object obj:al) {
                    ProductModel pr = (ProductModel) obj;
                    System.out.println("Id\tName\tCompany\tPrice\tQuantity\tStock\n" + pr.getId()+"\t" + pr.getName()+"\t" + pr.getComName()+"\t" + pr.getPrice()+"\t" + pr.getQty()+"\t\t" + pr.getStock());
                    
                    System.out.println("=====================================================");
                }
                break;
            case 3:
                System.out.println("enter product name to search");
                name = sc.next();
                ProductModel pm = prodService.searchProduct(name);
            
                if (pm!=null) {
                    System.out.println("Id\tName\tCompany\tPrice\tQuantity\tStock\n" + pm.getId()+"\t" + pm.getName()+"\t" + pm.getComName()+"\t" + pm.getPrice()+"\t" + pm.getQty()+"\t\t" + pm.getStock());

                } else
                    System.out.println("product not found");
                break;
            case 4:
                System.out.println("enter product name to search");
                name = sc.next();
               pm = prodService.deleteProduct(name);
                if (pm!=null)
                    System.out.println("product deleted sucsessfully");
                else
                    System.out.println("product not deletet");
                break;
            case 5:
                System.out.println("Total numbar of products present in Shop " + prodService.getProductCount());
                break;
            case 6:
               
                break;
            case 7:
               
                
                break;
            case 8:
               
                break;
            case 9:

                break;
            case 10:

                break;
            case 11:

                break;
            case 12:
               
                break;
            case 13:
                System.exit(0);
                break;
				default:
					System.out.println("Invalid Choice!...");
			}
		}while(true);
		

	}

}
