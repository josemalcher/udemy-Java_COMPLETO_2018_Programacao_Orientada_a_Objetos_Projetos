package br.model.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.model.enums.OrderStatus;

public class Order {

	private Date moment;
	private OrderStatus stauts;
	
	private Client client;
	private List<OrderItem> items = new ArrayList<>();
	/**
	 * @param moment
	 * @param stauts
	 * @param client
	 */
	public Order(Date moment, OrderStatus stauts, Client client) {
		super();
		this.moment = moment;
		this.stauts = stauts;
		this.client = client;
	}
	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	public OrderStatus getStauts() {
		return stauts;
	}
	public void setStauts(OrderStatus stauts) {
		this.stauts = stauts;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public List<OrderItem> getItems() {
		return items;
	}
	/*public void setItems(List<OrderItem> items) {
		this.items = items;
	}*/
	public void addItem(OrderItem item) {
		items.add(item);
	}
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public double total() {
		double sum = 0.0;
		for(OrderItem item : items) {
			sum += item.subTotal();
		}
		return sum;
	}
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(stauts + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order items:\n");
		for (OrderItem item : items) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
	
	
	
	
}
