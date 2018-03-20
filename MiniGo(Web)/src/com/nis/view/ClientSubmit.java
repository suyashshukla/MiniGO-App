package com.nis.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.nis.controller.ClientController;
import com.nis.model.ClientModel;

/**
 * Servlet implementation class ClientRegSubmit
 */
@WebServlet("/ClientSubmit")
public class ClientSubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientSubmit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	PrintWriter out=response.getWriter();
	out.println("<html>");
	 
ClientModel C=new ClientModel();	

C.setEmailid(request.getParameter("cemail"));
C.setMobile(request.getParameter("cmob"));	
C.setName(request.getParameter("cname"));
C.setBirthdate(request.getParameter("cdob"));	
C.setGender(request.getParameter("cgen"));	
C.setAddress(request.getParameter("cadd"));
C.setPassword(request.getParameter("cpwd"));	
 
boolean st=ClientController.AddRecord(C);
if(st)
{		  
	  out.println("<b>Record Submitted</b>");
	  
}
else
{out.println("<b>Fail to Submit Record</b>");}
out.println("</html>");
out.flush();
	}
	

}

