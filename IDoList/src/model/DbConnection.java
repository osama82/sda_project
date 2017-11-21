package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;



public class DbConnection {
	String dbUrl="jdbc:mysql://localhost:3306/longer";
	String user="root";
	String passWord="project";

	
	public static void main(String[] args) {
		DbConnection connection=new DbConnection();
		
	//System.out.println(connection.get_connection());
	//System.out.println("hiii");
	}
	
	
	
	public Connection get_connection(){
		Connection connection=null;
		try {
			
		
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection(dbUrl, user, passWord);
	
		PreparedStatement ps = connection.prepareStatement("delete from user where do_no is null");
		ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return connection;
		
		
		
		
	}
	
}

