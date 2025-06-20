package ecommercePlatformSearchFunction;

import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Product[] products = {  
				new Product(102, "Laptop", "Electronics"),
	            new Product(205, "Shoes", "Fashion"),
	            new Product(301, "Book", "Education"),
	            new Product(150, "Mobile", "Electronics"),
	            new Product(410, "Watch", "Accessories")
	        };
		
		System.out.println("Enter the productID to be searched:");
		int targetID = sc.nextInt();
		
		System.out.println("Enter 1 to perform Linear Search and 2 to perform Binary Search");
		int choice = sc.nextInt();
		
		if(choice == 1) {
			Product linearResult = Product.LinearSearch(products, targetID);
			if(linearResult != null) {
				System.out.println("The Product with ID:" + targetID + "was found");
			}
		}
		
		else if(choice == 2) {
			Product binaryResult = Product.BinarySearch(products, targetID);
			if(binaryResult != null) {
				System.out.println("The Product with ID:" + targetID + " was found");
			}

		}
		
		else { System.out.println("Wrong Choice try again!"); }
		
		sc.close();
	}
}

