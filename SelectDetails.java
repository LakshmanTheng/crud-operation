package com.code;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.coder.beans.AddEmpDetails;
import com.mysql.cj.protocol.Resultset;

import Dao.SaveDetails;

public class SelectDetails {
	private static List<AddEmpDetails> ad;

	public static AddEmpDetails getEmployeeById(int id) {
		AddEmpDetails ad= new AddEmpDetails();
		try {
			
			Connection con =SaveDetailsSer.getConnection();
			String sql= "select *from empdetails where id=?";
			
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs= ps.executeQuery();
			ad.setId(rs.getInt(1));
			ad.setId(rs.getInt(2));
			ad.setId(rs.getInt(3));
			ad.setId(rs.getInt(4));
			ad.setId(rs.getInt(5));
			ad.setId(rs.getInt(6));
			ad.setId(rs.getInt(7));
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ad;
		
	}

	public static List<AddEmpDetails> getAllEmployee() {
		try {
			
			Connection con =SaveDetails.getConnection();
			String sql= "select * from empdetails";
			
			PreparedStatement ps= con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				
				AddEmpDetails ad=new AddEmpDetails();
				ad.setId(rs.getInt(1));
				ad.setName(rs.getString(2));
				ad.setPassword(rs.getString(3));
				ad.setEmail(rs.getString(4));
				ad.setAddress(rs.getString(5));
				ad.setCity(rs.getString(6));
				ad.setCountry(rs.getNString(7));
				
			}
			con.close();		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ad;
	}
	public static List<AddEmpDetails> getAddEmpDetails(){
		List<AddEmpDetails> li= new AddEmpDetails();
		try {
			Connection con =SaveDetailsSer.getConnection();
			String sql= "select *from empdetails where id=?";
			
			PreparedStatement ps= con.prepareStatement(sql);
			ResultSet rs= ps.executeQuery();
			
			while(rs.next()) {
				
				AddEmpDetails ad= new AddEmpDetails();
				ad.setId(rs.getInt(1));
				ad.setId(rs.getInt(2));
				ad.setId(rs.getInt(3));
				ad.setId(rs.getInt(4));
				ad.setId(rs.getInt(5));
				ad.setId(rs.getInt(6));
				ad.setId(rs.getInt(7));
				
				
			}
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return li;
		
		
	}
	

}