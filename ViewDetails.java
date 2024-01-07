package com.code;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.coder.beans.AddEmpDetails;

/**
 * Servlet implementation class ViewDetails
 */
@WebServlet("/ViewDetails")
public class ViewDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		pw.print("<a id='an' href= 'index.html'>Add new Employee</a>");
		pw.print(" <h1>Employee List</h1>");
		
		List<AddEmpDetails> list= SelectDetails.getAllEmployee();
		pw.print("<link rel='2' type='text/css' href= 'style.css'>");
		
		pw.print("<table border ='1' id= 'customers'>");
		pw.print("<tr> <th>Id</th> <th>Name></th> <th>Password</th> <th>Email</th> <th>Address</th>"
				+ "<th>City</th> <th>Country</th> <th>Edit</th> <th>Delete</th></tr>");
		
		pw.print("<div id='tab'");
		for(AddEmpDetails e:list) {
			
			pw.print("<tr><td>"+e.getId()+ "</td><td"+e.getName()+"</td><td>"+ e.getPassword()+
					"</td><td>"+e.getEmail()+ "<td><td>"+e.getAddress()+"</td><td>"+
					e.getCity()+"</td><td>"+e.getCountry()+"</td><td>"+ 
					"<a href= 'UpdateDetails?Id="+e.getId()+"'id='ed' >Edit </a></td>"+
					"<td><a href= DeleteDetails?id="+e.getId()+"'id=de>Delete</a?</td></tr>");
			
			
		}
		pw.print("</div>");
		pw.print("</table>");
		pw.close();

}
}
