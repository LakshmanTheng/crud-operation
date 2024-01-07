package com.code;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.coder.beans.AddEmpDetails;

import Dao.SaveDetails;

@WebServlet("/SaveDetailsSer")
public class SaveDetailsSer extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public SaveDetailsSer() {
        super();
        
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    	response.setContentType("text/html");
    	PrintWriter out= response.getWriter();
    	
    	String name= request.getParameter("name");
    	String password=request.getParameter("password");
    	String email= request.getParameter("email");
    	String address=request.getParameter("address");
    	String city =request.getParameter("city");
    	String country =request.getParameter("country");
    	
    	
    	AddEmpDetails e= new AddEmpDetails(name,password,email,address,city,country);
    	e.setName(name);
    	e.setPassword(password);
    	e.setEmail(email);
    	e.setAddress(address);
    	e.setCity(city);
    	e.setCountry(country);
    	
    	int status=SaveDetails.save(e);
    	if(status>0) {
    		
    		out.print("<p>Record save successfuly</p>");
    		
    	}
    	else {
    		out.print("Sorry ! unable to save record");
    	}
		
	}

	public static Connection getConnection() {
		
		return null;
	}

    

}
