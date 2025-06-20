package ecommercePlatformSearchFunction;

import java.util.Arrays;
import java.util.Comparator;

public class Product {
	int productID;
	String productName;
	String category;
	
	public Product(int productID, String productName, String category) {
		this.productID = productID;
		this.productName = productName;
		this.category = category;
	}
	
	public static Product LinearSearch(Product[] products, int targetID) {
		for(Product prod:products) {
			if(prod.productID == targetID) {
				return prod;
			}
		}
		return null;
	}
	
	public static Product BinarySearch(Product[] products, int targetID) {
		Arrays.sort(products, Comparator.comparingInt(p -> p.productID));
		
		int left = 0;
		int right = products.length - 1;
		
		while(left <= right) {
			int mid =(left+right)/2;
			
			if(targetID ==products[mid].productID) {
				return products[mid];
			}
			else if(targetID <= products[mid].productID) {
				right = mid - 1;
			}
			else  {
				left = mid+1;
			}
		}
		return null;
		
	}

}
