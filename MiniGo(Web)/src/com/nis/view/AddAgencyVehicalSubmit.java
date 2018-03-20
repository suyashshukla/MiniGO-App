package com.nis.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.softech.FileUpload;

import com.nis.controller.AgencyController;
import com.nis.model.Agency;
import com.nis.model.AgencyVehicals;

/**
 * Servlet implementation class AddAgencyVehicalSubmit
 */
@WebServlet("/AddAgencyVehicalSubmit")
public class AddAgencyVehicalSubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddAgencyVehicalSubmit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		  out.println("<html>");
		  AgencyVehicals A=new AgencyVehicals();
		  A.setVehicalregistrationnumber(request.getParameter("vrn"));
	      A.setDrivername(request.getParameter("dname"));
	      A.setDrivercontactnumber(request.getParameter("dmobileno"));
	      A.setIdentity(request.getParameter("identity"));
		  boolean st=AgencyController.AddNewVehical(A);
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
