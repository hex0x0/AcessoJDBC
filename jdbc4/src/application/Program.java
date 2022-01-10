package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jdbc1.DB;
import jdbc1.DbException;

public class Program {
	public static void main(String[] args) {
		Connection conn = null;
		
		
		PreparedStatement st = null;
		
		
		try {
			conn = DB.getConnection();
			
			st = conn.prepareStatement(
					"DELETE FROM department"
					+ "WHERE "
					+ "Id = ?"
			);
			
			st.setInt(1, 1);
					
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

				
	}
}
