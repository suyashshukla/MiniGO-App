package com.nis.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ClientInterface
 */
@WebServlet("/ClientInterface")
public class ClientInterface extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientInterface() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<center>");
		out.println("<form action='ClientSubmit' method='post' enctype='multipart/form-data'>");
		out.println("<table>");
		out.println("<caption><h1><b><i>Client Registration</i></b></h1></caption>");
		out.println("<br><br><br><br>");
		
		out.println("<tr><td><b><i>EmailId:</i></b></td>");
		out.println("<td><input type=text name=cemail size=30></td></tr>");
		
		out.println("<tr><td><b><i>Mobile No:</i></b></td>");
		out.println("<td><input type=text name=cmob size=30></td></tr>");
		
		out.println("<tr><td><b><i>Client Name:</i></b></td>");
		out.println("<td><input type=text name=cname size=30></td></tr>");
		
		out.println("<tr><td><b><i>Date Of Birth:</i></b></td>");
		out.println("<td><input type=date name=cdob size=30></td></tr>");
		
		out.println("<tr><td><b><i>Gender</i></b></td>");
		out.println("<td><select id=cgen name=cgen><option disabled selected>Select</option><option value=Male>Male</option><option value=Female>Female</option></select></td></tr>");

		out.println("<tr><td><b><i>Address:</i></b></td>");
		out.println("<td><textarea name=cadd rows=3 cols=20></textarea></td></tr>");
		
		out.println("<tr><td><b><i>Password:</i></b></td>");
		out.println("<td><input type=password name=cpwd size=30></td></tr>");
		
				
		out.println("</table><br>");
		out.println("<input type=submit>&nbsp;&nbsp;<input type=reset></br>");
		out.println("</form></html>");
		out.println("</center>");
		out.flush();

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
