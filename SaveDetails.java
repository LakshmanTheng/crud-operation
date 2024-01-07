package Dao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.coder.beans.AddEmpDetails;

public class SaveDetails {
	
	public static Connection getConnection() {
		
		Connection con = null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crud_operation", "root", "121091");
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return con;
		
	}

	public static int save(AddEmpDetails e) {
		
		int status=0;
		
		try {
			
			Connection con =SaveDetails.getConnection();
		 String sql="insert into empdetails(name,password,email,address,city,country) values (?, ?, ?, ?, ?, ?)";
		  
		  PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, e.getName());
		ps.setString(2, e.getPassword());
		ps.setString(3, e.getEmail());
		ps.setString(4, e.getAddress());
		ps.setString(5, e.getCity());
		ps.setString(6, e.getCountry());
		
		status = ps.executeUpdate();
		con.close();
		
		} catch (Exception e2) {
			e2.fillInStackTrace();
			
		}
		return status;
				
	}

	public static int upate(AddEmpDetails ad) {
		// TODO Auto-generated method stub
		return 0;
	}
}