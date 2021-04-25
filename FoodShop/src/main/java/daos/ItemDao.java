package daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entities.Item;
import utils.JdbcUtil;

public class ItemDao implements AutoCloseable {
	private Connection con;
	public void open() throws Exception {
		con = DriverManager.getConnection(
				JdbcUtil.DB_URL, 
				JdbcUtil.DB_USER,
				JdbcUtil.DB_PASSWORD);
	}
	@Override
	public void close() throws Exception {
		if(con!=null)
			con.close();
	}
	public List<String> getCategories() throws Exception {
		List<String> list = new ArrayList<String>();
		String sql = "SELECT DISTINCT CATEGORY FROM ITEMS";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				String cat = rs.getString("CATEGORY");
				list.add(cat);
			}
		}
		return list;
	}
	
	public List<Item> getItems(String category) throws Exception {
		List<Item> list = new ArrayList<>();
		String sql = "SELECT ID,NAME,CATEGORY,INFO,PRICE FROM ITEMS WHERE CATEGORY=?";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, category);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Item item = new Item();
				item.setId( rs.getInt("ID") );
				item.setName( rs.getString("NAME") );
				item.setCategory( rs.getString("CATEGORY") );
				item.setInfo( rs.getString("INFO") );
				item.setPrice( rs.getDouble("PRICE") );
				list.add(item);
			}
		}
		return list;
	}
	
	public Item getItem(int id) throws Exception {
		Item item = null;
		String sql = "SELECT ID,NAME,CATEGORY,INFO,PRICE FROM ITEMS WHERE ID=?";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				item = new Item();
				item.setId( rs.getInt("ID") );
				item.setName( rs.getString("NAME") );
				item.setCategory( rs.getString("CATEGORY") );
				item.setInfo( rs.getString("INFO") );
				item.setPrice( rs.getDouble("PRICE") );
			}
		}
		return item;
	}
}
