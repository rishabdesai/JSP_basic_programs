package entities;

public class Item {
	private int id;
	private String name;
	private String category;
	private String info;
	private double price;
	public Item() {
		
	}
	public Item(int id, String name, String category, String info, double price) {
		this.id = id;
		this.name = name;
		this.category = category;
		this.info = info;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", category=" + category + ", info=" + info + ", price=" + price
				+ "]";
	}
}
