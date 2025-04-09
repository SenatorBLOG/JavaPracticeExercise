package JavaDatabase;

import java.sql.*;

public class DatabaseJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		Statement stat = null;
		ResultSet resultSet = null;
		
		
		
		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		}
		catch(ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
			
		}
		try {
			String database = "Database11.accdb";
			String url = "jdbc:ucanaccess://" + database;
			conn = DriverManager.getConnection(url);
			stat = conn.createStatement();
			String query = "SELECT * from Table1";
			resultSet = stat.executeQuery(query);
			int id;
			String name, address;
			double salary;
			while(resultSet.next()) {
				id = resultSet.getInt(1);
				name = resultSet.getString(2);
				address = resultSet.getString(3);
				salary = resultSet.getDouble(4);
				
				System.out.println(id + " " + name +
						" " + address + " " + salary);
				
			}
		}catch(SQLException ex ) {
			System.out.println(ex.getMessage());
		}
		finally {
			if(conn != null)
			try{
				resultSet.close();
				stat.close();
				conn.close();
				
			}catch(SQLException ex) {
				System.out.println(ex.getMessage());
			}
			
		}
	}

}
