package control;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.DbConnection;

public class Insert {

	public void insert_values(int do_no, String auth_name, String task, String priority) {

		DbConnection DbConnection = new DbConnection();
		Connection connection = DbConnection.get_connection();

		PreparedStatement ps = null;

		try {

			String query = "insert into user(do_no, auth_name,task,priority) values(?,?,?,?)";
			ps = connection.prepareStatement(query);
			ps.setInt(1, do_no);
			ps.setString(2, auth_name);
			ps.setString(3, task);
			ps.setString(4, priority);

			ps.executeUpdate();

		} catch (Exception e) {
			System.err.println(e);
		}

	}

}
