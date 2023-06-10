package com.jdbc.one;
import java.sql.*;


import oracle.jdbc.OracleDriver;

public class Users {

	public static void main(String[] args) throws SQLException {
		
		DriverManager.registerDriver(new OracleDriver());
    
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","c##java","java");
				
		Statement stmt=con.createStatement();		
		
		ResultSet rs=stmt.executeQuery("select * from hotstar ");
	
	
		while(rs.next()) {
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6));
		}
			con.close();
		}

}
