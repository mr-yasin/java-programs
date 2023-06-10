package com.employee.details;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import oracle.jdbc.OracleDriver;

public class employee extends HttpServlet  {
	

	public static void main(String[] args) throws SQLException {
		
		// TODO Auto-generated method stub
		
			
		 
		ApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\user\\Desktop\\eclipse-workspace\\employee\\src\\main\\java\\Bean.xml");
		employeeDetails d=(employeeDetails) context.getBean("emp");				
		try {
		DriverManager.registerDriver(new OracleDriver());
	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","c##java","java");
			
	    
	    
		//execute Query
			PreparedStatement stmt=con.prepareStatement("insert into emp values(?,?,?)"); 
			stmt.setString(1, d.getName());
			stmt.setString(2, d.getEmp_id());

			stmt.setLong(3, d.getMobile_num());			
			
			int i=stmt.executeUpdate();  
			System.out.println(i+" records inserted");  
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
	
		}

	}

}
