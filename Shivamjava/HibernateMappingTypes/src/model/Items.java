package model;
public class Items {
private int id;
private Cart cart;
private String itemId;
private double itemTotal;
private int quantity;

public Items(Cart cart, String itemId, double itemTotal, int quantity) {
	super();
	this.cart = cart;
	this.itemId = itemId;
	this.itemTotal = itemTotal;
	this.quantity = quantity;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Cart getCart() {
	return cart;
}
public void setCart(Cart cart) {
	this.cart = cart;
}
public String getItemId() {
	return itemId;
}
public void setItemId(String itemId) {
	this.itemId = itemId;
}
public double getItemTotal() {
	return itemTotal;
}
public void setItemTotal(double itemTotal) {
	this.itemTotal = itemTotal;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}




}


