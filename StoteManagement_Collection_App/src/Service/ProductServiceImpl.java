package Service;

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

}
