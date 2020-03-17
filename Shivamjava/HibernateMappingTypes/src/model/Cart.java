package model;

import java.util.Set;

public class Cart {
private int cartId;
private double total;
private String name;
private Set<Items> items;

public int getCartId() {
	return cartId;
}
public void setCartId(int cartId) {
	this.cartId = cartId;
}
public double getTotal() {
	return total;
}
public void setTotal(double total) {
	this.total = total;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Set<Items> getItems() {
	return items;
}
public void setItems(Set<Items> items) {
	this.items = items;
}



}
