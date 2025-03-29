package Model;

public class ProductModel {
	private int id;
	private String name;
	private int price;
	private int stock;
	private String comName;
	
	public ProductModel() {
		
	}
	public ProductModel(String name,int id,int stock,int price,String compName)
	{
		this.name=name;
		this.id=id;
		this.stock=stock;
		this.price=price;
		this.comName=compName;
	}
	
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
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getComName() {
		return comName;
	}
	public void setComName(String comName) {
		this.comName = comName;
	}
}
