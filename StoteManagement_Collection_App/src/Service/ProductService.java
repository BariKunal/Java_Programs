package Service;


import java.util.List;

import Model.ProductModel;

public interface ProductService {
	public boolean isAddNewProduct(ProductModel model);

	public List getAllProducts();
	public ProductModel searchProduct(String name);
}
