package com.nis.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AgencyView
 */
@WebServlet("/AgencyView")
public class AgencyView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgencyView() {
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
		out.println("<form action='AgencySubmit' method='post' enctype='multipart/form-data'>");
		out.println("<table>");
		out.println("<caption><h1><b><i>Agency Registration</i></b></h1></caption>");
		out.println("<br><br><br><br>");
		
		out.println("<tr><td><b><i>Agency Name:</i></b></td>");
		out.println("<td><input type=text name=aname size=30></td></tr>");
		
		out.println("<tr><td><b><i>Owner Name:</i></b></td>");
		out.println("<td><input type=text name=oname size=30></td></tr>");
		
		out.println("<tr><td><b><i>Address:</i></b></td>");
		out.println("<td><textarea name=add rows=3 cols=20></textarea></td></tr>");
		
		out.println("<tr><td><b><i>Contact Person:</i></b></td>");
		out.println("<td><input type=text name=cperson size=30></td></tr>");
		
		out.println("<tr><td><b><i>Mobile No:</i></b></td>");
		out.println("<td><input type=text name=mobileno size=30></td></tr>");
		
		out.println("<tr><td><b><i>Email Id:</i></b></td>");
		out.println("<td><input type=text name=emailid size=30></td></tr>");
		
		out.println("<tr><td><b><i>Registration Id:</i></b></td>");
		out.println("<td><input type=text name=regid size=30></td></tr>");
		
		out.println("<tr><td><b><i>Identity:</i></b></td>");
		out.println("<td><input type=text name=identity size=30></td></tr>");
		
		out.println("<tr><td><b><i>Uplaod identity Proof:</i></b></td>");
		out.println("<td><input type=file name=idproof></td></tr>");
		
		out.println("<tr><td><b><i>Password:</i></b></td>");
		out.println("<td><input type=password name=pwd size=30></td></tr>");
		
		out.println("<tr><td><b><i>Confirm Password:</i></b></td>");
		out.println("<td><input type=password name=cpwd size=30></td></tr>");
		
		out.println("<tr><td><b><i>Status:</i></b></td>");
		out.println("<td><input type=text readonly=true name=status size=30 value='Not Verify'></td></tr>");
		
		out.println("</table><br>");
		out.println("<input type=submit>&nbsp;&nbsp;<input type=reset></br>");
		out.println("</form></html>");
		out.println("</center>");
		out.flush();
	}
}

