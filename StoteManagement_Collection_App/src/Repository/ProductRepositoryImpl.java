package Repository;

import java.util.*;

import Model.ProductModel;

public class ProductRepositoryImpl implements ProductRepository
{
	private ArrayList prodList = new ArrayList();
	@Override
	public boolean isAddNewProduct(ProductModel model) {
	
		return prodList.add(model);
	}
	@Override
	public List getAllProducts() {
		// TODO Auto-generated method stub
		return prodList;
	}
	@Override
	public ProductModel searchProduct(String name) {
		ProductModel pmodel = null;
		for(Object obj:prodList) {
			
			pmodel=(ProductModel)obj;
			if(pmodel.getName().equals(name)) {
				return pmodel;
			}
		}
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ProductModel deleteProduct(String name) {
		// TODO Auto-generated method stub
		ProductModel pmodel = null;
		
		for(Object obj:prodList) {
			pmodel=(ProductModel)obj;
			if(pmodel.getName().equals(name)) {
				prodList.remove(pmodel);
				return pmodel;
			}
		}
		return null;
	}
	@Override
	public int getProductCount() {
		// TODO Auto-generated method stub
		return prodList.size();
	}

}
