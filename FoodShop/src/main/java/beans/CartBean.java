package beans;

import java.util.ArrayList;
import java.util.List;

public class CartBean {
	private String[] itemIds; 
	private List<Integer> cart;  //cart items
	public CartBean() {
		this.itemIds = new String[0];
		this.cart = new ArrayList<Integer>();
	}
	public String[] getItemIds() {
		return itemIds;
	}
	public void setItemIds(String[] itemIds) {
		this.itemIds = itemIds;
	}
	public List<Integer> getCart() {
		return cart;
	}
	public void setCart(List<Integer> cart) {
		this.cart = cart;
	}
	public int getNewItemCount() {
		return this.itemIds.length;
	}
	
	
	public void addToCart() {
		for (String itemId : itemIds) {
			int id = Integer.parseInt(itemId);
			cart.add(id);
		}
	}
}
