package utils;

import java.io.InputStream;
import java.util.Properties;

public class JdbcUtil {
	public static final String DB_DRIVER;
	public static final String DB_URL;
	public static final String DB_USER;
	public static final String DB_PASSWORD;
	
	static {
		Properties props = new Properties();
		try {
			InputStream in = JdbcUtil.class.getResourceAsStream("/jdbc.properties");
			props.load(in);
		}catch (Exception e) {
			e.printStackTrace();
		}
		DB_DRIVER = props.getProperty("db.driver");
		DB_URL = props.getProperty("db.url");
		DB_USER = props.getProperty("db.user");
		DB_PASSWORD = props.getProperty("db.password");
		
		try {
			System.out.println("Loading MySQL driver : " + DB_DRIVER);
			Class.forName(DB_DRIVER);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
