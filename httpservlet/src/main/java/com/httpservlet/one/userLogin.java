package com.httpservlet.one;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import oracle.jdbc.driver.OracleDriver;

public class userLogin extends HttpServlet {

	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		String email=req.getParameter("email_id");
		String pwd=req.getParameter("password");
		PrintWriter pw = res.getWriter();
		// TODO Auto-generated method stub
		
		try {
			String query ="select * from hotstar where email_id=? and password=?";
			DriverManager.registerDriver(new OracleDriver());
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","c##java","java");
			PreparedStatement pstmt=con.prepareStatement(query);			
			pstmt.setString(1,email);
			pstmt.setString(2,pwd);
			ResultSet rs=pstmt.executeQuery();
			
			if(rs.next()) {
				pw.write("WELCOME "+rs.getString(1));
				
			}else {
				pw.write("Invalid User");
			}
			con.close();
			pw.close();			
			
		} catch (Exception e) {
			e.printStackTrace();
			
			
			// TODO: handle exception
		}
		
	}
	
	

}
