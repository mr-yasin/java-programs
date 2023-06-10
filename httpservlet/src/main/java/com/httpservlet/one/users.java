package com.httpservlet.one;

import java.util.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class users extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {

		System.out.println("req data");

		String firstName = req.getParameter("first_name");
		String LastName = req.getParameter("last_name");
		String email_id = req.getParameter("email_id");
		String mobile_num = req.getParameter("mobile_num");
		String date_of_birth = req.getParameter("date_of_birth");
		String pwd = req.getParameter("password");

		System.out.println(firstName);
		System.out.println(LastName);
		System.out.println(email_id);
		System.out.println(mobile_num);
		System.out.println(date_of_birth);
		System.out.println(pwd);
		

		try {
			DriverManager.registerDriver(new OracleDriver());
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "c##java", "java");
			PreparedStatement stmt = con.prepareStatement("Insert into hotstar values(?,?,?,?,?,?)");
			stmt.setString(1, firstName);
			stmt.setString(2, LastName);
			stmt.setString(3, email_id);
			long num = Long.parseLong(mobile_num);
			stmt.setLong(4, num);
			stmt.setString(5, date_of_birth);
			stmt.setString(6, pwd);
			stmt.executeUpdate();
			con.close();

		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();

		} 
		try {
			PrintWriter pw =res.getWriter();
			pw.write("User is created " +firstName);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
