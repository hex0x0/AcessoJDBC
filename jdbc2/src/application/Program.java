package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import jdbc1.DB;
import jdbc1.DbException;

public class Program {
	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
		Connection conn = null;
		PreparedStatement st = null;
		
		try {
			conn = DB.getConnection();
			/*
			st = conn.prepareStatement(
					"insert into seller" 
					+"(Name, Email, BirthDate, BaseSalary, DepartmentId) " 
					+ "VALUES "
					+"(?, ?, ?, ?, ?)",
					Statement.RETURN_GENERATED_KEYS
					
					
					);//String que é meu comando sql
			
			st.setString(1, "Carl Purple");
			st.setString(2, "alex@gmail.com");
			st.setDate(3, new java.sql.Date(sdf.parse("22/04/1995").getTime()));
			st.setDouble(4, 3000.90);
			st.setInt(5, 4);
			
			
			
			int rows = st.executeUpdate();
			
			
			if(rows > 0) {
				ResultSet rs = st.getGeneratedKeys();
				while(rs.next()) {
					int id = rs.getInt(1);
					System.out.println("Done! = " + id);
				}
			}else {
				System.out.println("Nenhuma linha modificada!");
			}
			*/
			
		st = conn.prepareStatement("insert into department (Name) values ('db1'), ('db2')");
			
		}catch (SQLException e) {
			e.printStackTrace();
		/*}catch(ParseException p) {
			p.printStackTrace();
		*/
		}finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}
}
