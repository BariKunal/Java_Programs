package Repository;

import Model.ProductModel;
import java.util.*;
public interface ProductRepository {
	public boolean isAddNewProduct(ProductModel model);
	public List getAllProducts();
}
