package vislabExample.model.bl;

import java.util.ArrayList;


import vislabExample.model.db.Product;

public class ProductManager {
	
	ArrayList<Product> result;
	
	public ArrayList<Product> getProducts() {
		result = new ArrayList<>();
		Product product1 = new Product("Shirt", 15.0, "Kleidung");
		result.add(product1);
		Product product2 = new Product("Vans", 50.0, "Schuhe");
		result.add(product2);
		Product product3 = new Product("Uhr", 10.0, "Schmuck");
		result.add(product3);
		return result;
		
		
//		for(int i = 0; i < productList.size(); i ++){			
//			if(preisMin < productList.get(i).getPrice() && preisMax > productList.get(i).getPrice() && 
//					description.contains(productList.get(i).getDescription())){
//				result.add(productList.get(i));
//			}
//		}
	}

}
