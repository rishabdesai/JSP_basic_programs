package beans;

import daos.ItemDao;
import entities.Item;

public class FoodBean {
	private int id;
	private Item item;
	public FoodBean() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public void fetchItem() {
		try (ItemDao dao = new ItemDao()) {
			dao.open();
			this.item = dao.getItem(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
