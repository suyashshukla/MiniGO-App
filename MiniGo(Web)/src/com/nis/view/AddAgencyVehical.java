package com.nis.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddAgencyVehical
 */
@WebServlet("/AddAgencyVehical")
public class AddAgencyVehical extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddAgencyVehical() {
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
		out.println("<form action='AddAgencyVehicalSubmit' method='post' enctype='multipart/form-data'>");
		out.println("<table>");
		out.println("<caption><h1><b><i>Add Vehical</i></b></h1></caption>");
		out.println("<br><br><br><br>");
		
		out.println("<tr><td><b><i>Vehical Registration Number :</i></b></td>");
		out.println("<td><input type=text name=vrn size=30></td></tr>");
		
		out.println("<tr><td><b><i>Driver Name:</i></b></td>");
		out.println("<td><input type=text name=dname size=30></td></tr>");
		
		out.println("<tr><td><b><i>Driver Mobile No:</i></b></td>");
		out.println("<td><input type=text name=dmobileno size=30></td></tr>");
		
		out.println("<tr><td><b><i>Identity:</i></b></td>");
		out.println("<td><input type=text name=identity size=30></td></tr>");
		
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
