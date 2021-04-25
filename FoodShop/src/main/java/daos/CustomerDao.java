package daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import entities.Customer;
import utils.JdbcUtil;

public class CustomerDao implements AutoCloseable {
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
	public Customer getCustomer(String email) throws Exception {
		String sql = "SELECT ID,NAME,PASSWORD,MOBILE,EMAIL,ADDRESS FROM CUSTOMERS WHERE EMAIL=?";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, email);
			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				Customer cust = new Customer();
				cust.setId( rs.getInt("ID") );
				cust.setMobile( rs.getString("MOBILE") );
				cust.setName( rs.getString("NAME") );
				cust.setEmail( rs.getString("EMAIL") );
				cust.setPassword( rs.getString("PASSWORD") );
				cust.setAddress( rs.getString("ADDRESS") );
				return cust;
			}
		}
		return null;
	}
}
