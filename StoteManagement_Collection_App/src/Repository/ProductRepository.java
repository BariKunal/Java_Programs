package Repository;

import Model.ProductModel;
import java.util.*;
public interface ProductRepository {
	public boolean isAddNewProduct(ProductModel model);
	public List getAllProducts();
	public ProductModel searchProduct(String name);
	public ProductModel deleteProduct(String name);
	public int getProductCount();
}
