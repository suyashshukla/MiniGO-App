package com.nis.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ClientView
 */
@WebServlet("/ClientView")
public class ClientView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientView() {
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
	out.println("<table cellspacing=5>");
	out.println("<form action='CheckAgencyLogin'>");
	out.println("<tr><th>Booking Date</th><th>Booking Time</th><th>Total Person</th><th>Source</th><th>Destination</th></tr>");
    out.println("<tr><td><input type=date id=from name=fdate></td><td><input type=time id=to name=tdate></td><td><input type=number name=tp id=tp></td><td><select id=city name=city><option disabled selected>Select</option><option value=Gwalior_Busstand>Gwalior Bus Stand</option><option value=Chetakpuri>Chetakpuri</option><option value=Jauorasi>Jauorasi</option><option value=Tekanpur>Tekanpur</option><option value=Dabra>Dabra</option><option value=Datia>Datia</option></select></td><td><select id=dcity name=dcity><option disabled selected>Select</option><option value=Datia>Datia</option><option value=Dabra>Dabra</option><option value=Tekanpur>Tekanpur</option><option value=Jauorasi>Jauorasi</option><option value=Chetakpuri>Chetakpuri</option><option value=Gwalior_Busstand>Gwalior Bus Stand</option></select></td>");	
	out.println("<tr><td><input type= submit></tr></td>");
	out.println("</form>");
    out.println("</table><br>");
	out.println("<div id=result></div>");
	out.println("<div id=vpic></div>");
	out.print("</html>");
	}

}