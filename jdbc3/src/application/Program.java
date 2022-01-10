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
			st = conn.prepareStatement("update seller " 
			+ "set BaseSalary = baseSalary + ?"
			+ "Where "
			+ "(DepartmentId = ?)"
			);
			
			st.setDouble(1, 350.0);
			st.setInt(2, 2);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DB.closeStatement(st);
			DB.closeConnection();;
			
		}
				
	}
}
