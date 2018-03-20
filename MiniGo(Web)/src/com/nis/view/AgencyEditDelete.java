package com.nis.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nis.controller.AgencyController;
import com.nis.model.Agency;

@WebServlet("/AgencyEditDelete")
public class AgencyEditDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AgencyEditDelete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Agency A=AgencyController.DisplayByID(Integer.parseInt(request.getParameter("aid")));
	       PrintWriter out=response.getWriter();
	   	out.println("<html>");
	   	out.println("<form action='AgencyFinalEditDelete' method=post enctype='multipart/form-data'>");
	    out.println("<input type=hidden value="+A.getAgencyid()+" name=aid>");
	    out.println("<table cellspacing=10><tr>");
	    out.println("<td valign=top>");
	    out.println("<table>");
	   	out.println("<caption><b><i>Agency Registration</i></b></caption>");
	   	out.println("<tr><td><b><i>Agency Name:</i></b></td>");
	   	out.println("<td><input type=text name=aname value='"+A.getAgencyname()+"' size=30></td></tr>");
	   	
	   	out.println("<tr><td><b><i>Owner Name:</i></b></td>");
	   	out.println("<td><input type=text name=oname  value='"+A.getOwnername()+"' size=30></td></tr>");
	   	
	   	out.println("<tr><td><b><i>Address:</i></b></td>");
	   	out.println("<td><textarea name=add rows=3 cols=20>"+A.getAddress()+"</textarea></td></tr>");
	   	 
	   	out.println("<tr><td><b><i>Contact Person:</i></b></td>");
	   	out.println("<td><input type=text value='"+A.getContactperson()+"' name=cperson size=30></td></tr>");
	   	
	   	out.println("<tr><td><b><i>Mobile No:</i></b></td>");
	   	out.println("<td><input type=text name=mobileno value='"+A.getMobileno()+"' size=30></td></tr>");
	   
	   	out.println("<tr><td><b><i>Email Id:</i></b></td>");
	   	out.println("<td><input type=text name=emailid value='"+A.getEmailid()+"' size=30></td></tr>");
	   	
	   	
	   	 
	   	out.println("<tr><td><b><i>Status:</i></b></td>");
	   	out.println("<td><select  name=status>");
	   	out.println("<option>"+A.getStatus()+"</option>");
	   	out.println("<option>Verified</option>");
	   	out.println("<option>Not Verified</option></select></td></tr>");
	   	
	   	out.println("</table><br>");
	   	out.println("<input type=submit value=Update name=btn>&nbsp;&nbsp;<input type=Submit value=Delete name=btn></br>");
	   	out.println("</td><td valign=top>");
	    out.println("<b>Registration Id:</b><br><br><input type=text name=regid value='"+A.getRegistrationid()+"'><br><br>");
	    out.println("Update Registration Id <input type=file name=regproof> <br><br> ");
	    out.println("<input type=submit name=btn value='Update Registration'><br><br>");
	    
	    out.println("<b>Id Proof:</b><br><br><input type=text name=identity value='"+A.getIdentity()+"'><br><br>");
	    out.println("<img src=picture/"+A.getIdentity_proof()+" width=60 height=60><br><br>");
	    out.println("Update  Id Proof <input type=file name=idproof> <br><br> ");
	    out.println("<input type=submit name=btn value='Update IdProof'><br><br>");
	   
	    out.println("</form></html>");

	    
	   
	   	out.flush();
		
	}
}
