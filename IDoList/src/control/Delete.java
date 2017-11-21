package control;

import java.sql.Connection;
import java.sql.PreparedStatement;


import model.DbConnection;


public class Delete {

	
	public void delete_task(int do_no) {
		DbConnection DbConnection=new DbConnection();
		Connection connection=DbConnection.get_connection();
		
		PreparedStatement ps=null;
	 
		 
		 
		try {
			String querry="delete from user where do_no=?";
			ps=connection.prepareStatement(querry);	
			
			
			//ps.setString(1, null);
			//ps.executeUpdate();
			ps.setInt(1, do_no);
			ps.executeUpdate();
			
			
			 
			
			
		} catch (Exception e) {
				System.out.println(e);
		}
		 
		
		
	}

}
