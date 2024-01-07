package com.code;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.coder.beans.AddEmpDetails;

import Dao.SaveDetails;

/**
 * Servlet implementation class UpdateDetails2
 */
@WebServlet("/UpdateDetails2")
public class UpdateDetails2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateDetails2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		String sid=request.getParameter("Id");
		int id=Integer.parseInt(sid);
		
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String address=request.getParameter("address");
		String city=request.getParameter("city");
		String country=request.getParameter("country");
		
		AddEmpDetails ad=new AddEmpDetails();
		ad.setId(id);
		ad.setName(name);
		ad.setPassword(password);
		ad.setEmail(email);
		ad.setAddress(address);
		ad.setCity(city);
		ad.setCountry(country);
		
		int status = SaveDetails.upate(ad);
		if(status>0) {
			response.sendRedirect("ViewDetails");
		}
		else {
			pw.print("Sorry! unable to save record");
		}
		
		
	}

}
