package beans;

import java.util.ArrayList;
import java.util.List;

import daos.ItemDao;

public class CategoryBean {
	//field
	private List<String> categories;
	//constructor
	public CategoryBean() {
		this.categories = new ArrayList<String>();
	}
	//getter and setter
	public List<String> getCategories() {
		return categories;
	}
	public void setCategories(List<String> categories) {
		this.categories = categories;
	}
	
	//business method
	public void fetchCategories() {
		try(ItemDao dao = new ItemDao()) {
			dao.open();
			this.categories = dao.getCategories();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
