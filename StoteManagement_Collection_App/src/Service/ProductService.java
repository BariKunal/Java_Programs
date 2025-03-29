package Service;


import java.util.List;

import Model.ProductModel;

public interface ProductService {
	public boolean isAddNewProduct(ProductModel model);

	List getAllProducts();
}
