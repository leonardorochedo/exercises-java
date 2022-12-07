package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String nameClient = sc.nextLine();
		System.out.print("Email: ");
		String emailClient = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String birthDate = sc.nextLine();
		
		Client client = new Client(nameClient, emailClient, birthDate);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		String orderStatus = sc.nextLine();
		
		Order order = new Order(OrderStatus.valueOf(orderStatus), client);
		
		System.out.print("How many items to this order? ");
		int qtdOrders = sc.nextInt();
		for(int i=1; i<=qtdOrders; i++) {
			sc.nextLine();
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			String nameProduct = sc.nextLine();
			System.out.print("Product price: ");
			double priceProduct = sc.nextDouble();
			System.out.print("Quantity: ");
			int qtdProduct = sc.nextInt();
			
			OrderItem orderItem = new OrderItem(qtdProduct, priceProduct, new Product(nameProduct, priceProduct));
			order.addOrder(orderItem);
		}
		
		
		System.out.println();
		System.out.println(order);
	}

}
