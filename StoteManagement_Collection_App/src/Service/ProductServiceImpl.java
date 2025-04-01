package Service;

import java.util.ArrayList;
import java.util.List;

import Model.ProductModel;
import Repository.ProductRepository;
import Repository.ProductRepositoryImpl;

public class ProductServiceImpl implements ProductService
{
	ProductRepository prodRepo = new ProductRepositoryImpl();
	@Override
	public boolean isAddNewProduct(ProductModel model) {
		// TODO Auto-generated method stub
		return prodRepo.isAddNewProduct(model);
	}
	@Override
	public List getAllProducts()
	{
		return prodRepo.getAllProducts();
	}
	public boolean isProductAdd(ProductModel proModel) {
		// TODO Auto-generated method stub
		return false;
	}
	public ProductModel searchProduct(String name) {
		// TODO Auto-generated method stub
		
		return prodRepo.searchProduct(name);
	}
	public ProductModel deleteProduct(String name) {
		// TODO Auto-generated method stub
		return prodRepo.deleteProduct(name);
	}
	public int getProductCount() {
		// TODO Auto-generated method stub
		
		return prodRepo.getProductCount();
	}

}
