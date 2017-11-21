package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import model.DbConnection;
import model.DoList;

public class Edit{
	
	
	
	public DoList getTaskValue(int do_no){
		DbConnection DbConnection=new DbConnection();
		Connection connection=DbConnection.get_connection();
		
		PreparedStatement ps=null;
		ResultSet rs=null;
		DoList dolist=new DoList();
		
		 
		try {
			String querry="select * from user where do_no=?";
			ps=connection.prepareStatement(querry);		
			ps.setInt(1, do_no);
			rs=ps.executeQuery();
			
			
			while(rs.next()){
			 
			
				
				
				dolist.setDo_no(rs.getInt("do_no"));
				dolist.setTask(rs.getString("task"));
				dolist.setAuth_name(rs.getString("auth_name"));
				dolist.setPrio(rs.getString("priority"));
				
				 
				
			}
			
			
			
		} catch (Exception e) {
				System.out.println(e);
		}
		return dolist;
		
		
		
	}


	public void edit_task(DoList dolist){
		DbConnection DbConnection=new DbConnection();
		Connection connection=DbConnection.get_connection();
		
		PreparedStatement ps=null;
		  
		 
		try {
			String querry="update user set auth_name=?,task=?,priority=? where do_no=?";
			ps=connection.prepareStatement(querry);		
			ps.setString(1, dolist.getAuth_name());;
			ps.setString(2, dolist.getTask());;
			ps.setString(3, dolist.getPrio());;
			ps.setInt(4, dolist.getDo_no());;
			ps.executeUpdate();
			
			
			 
			
			
			
		} catch (Exception e) {
				System.out.println(e);
		}
	 
		
		
	}



}

