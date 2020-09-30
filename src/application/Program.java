package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
//		System.out.print("Quantity in stock: ");
//		int quantity = sc.nextInt();
		
		Product product = new Product(name, price);
		
		product.setName("Computer");
		
		System.out.println("Update  name: " + product.getName());
		
		System.out.println("\nProduct data: " + product);
		
		System.out.println("\nEnter the number of products to be added in stock : ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println("\nUpdated data: " + product);
		
		System.out.println("\nEnter the number of products to be removed in stock : ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println("\nUpdated data: " + product);
		
		sc.close();
	}

}
