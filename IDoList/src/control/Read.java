package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.DbConnection;
import model.DoList;

public class Read {

	
	public static void main(String[] args) {
		Read Read_Values=new Read();
		
		Read_Values.get_values();
	}
	
	
	public List<DoList> get_values(){
		DbConnection DbConnection=new DbConnection();
		Connection connection=DbConnection.get_connection();
		
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		 List<DoList> list=new ArrayList<DoList>();
		
		try {
			String querry="select * from user";
			ps=connection.prepareStatement(querry);		
			rs=ps.executeQuery();
			
			
			while(rs.next()){
				
				DoList dolist=new DoList();
				System.out.println(rs.getInt("do_no"));
				System.out.println(rs.getString("task"));
				System.out.println(rs.getString("auth_name"));
				System.out.println(rs.getString("priority"));
				
				
				dolist.setDo_no(rs.getInt("do_no"));
				dolist.setTask(rs.getString("task"));
				dolist.setAuth_name(rs.getString("auth_name"));
				dolist.setPrio(rs.getString("priority"));
				
				list.add(dolist);
				
			}
			
			
			
		} catch (Exception e) {
				System.out.println(e);
		}
		return list;
		
		
		
	}
	
	
}
