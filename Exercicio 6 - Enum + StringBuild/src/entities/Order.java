package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private Date dataHoraAtual = new Date();
	private String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
	private String hora = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);
	
	private OrderStatus status;
	private Client client;
	
	private List<OrderItem> orders = new ArrayList<>();
	
	public Order() {
		
	}

	public Order(OrderStatus status, Client client) {
		this.status = status;
		this.client = client;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public void addOrder(OrderItem order) {
		orders.add(order);
	}
	
	public void removeOrder(OrderItem order) {
		orders.remove(order);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		double totalBuy = 0;
		sb.append("ODER SUMMARY: \n");
		sb.append("Order moment: " + data + " " + hora + "\n");
		sb.append("Order status: " + status + "\n");
		sb.append("Client: " + client.getName() + " " + client.getBirthDate() + " - " + client.getEmail() + "\n");
		sb.append("Order items: \n");
		for(OrderItem o : orders) {
			sb.append(o + "\n");
			totalBuy += o.subTotal();
		}
		sb.append("Total price: $" + totalBuy);
		return sb.toString();
	}
	
}
