package beans;

import java.util.ArrayList;
import java.util.List;

import daos.ItemDao;
import entities.Item;

public class ItemBean {
	private String category;
	private List<Item> items;
	public ItemBean() {
		this.category = "";
		this.items = new ArrayList<Item>();
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	
	public void fetchItems() {
		try (ItemDao dao = new ItemDao()) {
			dao.open();
			this.items = dao.getItems(category);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
