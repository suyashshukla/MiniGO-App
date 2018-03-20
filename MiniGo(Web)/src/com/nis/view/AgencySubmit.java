package com.nis.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.softech.FileUpload;

import com.nis.controller.AgencyController;
import com.nis.model.Agency;

/**
 * Servlet implementation class AgencySubmit
 */
@WebServlet("/AgencySubmit")
@MultipartConfig(fileSizeThreshold=1024*1024*2,//2MB
maxFileSize=1024*1024*10,//10MB
maxRequestSize=1024*1024*50)
public class AgencySubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgencySubmit() {
        super();
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		  out.println("<html>");
		  Agency A=new Agency();
		  A.setAgencyname(request.getParameter("aname"));
	      A.setOwnername(request.getParameter("oname"));
	      A.setAddress(request.getParameter("add"));
	      A.setContactperson(request.getParameter("cperson"));
	      A.setMobileno(request.getParameter("mobileno"));
	      A.setEmailid(request.getParameter("emailid"));
	      A.setRegistrationid(request.getParameter("regid"));
	      A.setIdentity(request.getParameter("identity"));
		  A.setPassword(request.getParameter("pwd"));
	      A.setStatus(request.getParameter("status"));      
	      String path="F:/Eclipse Mars/eclipse/MiniGo/WebContent/Pictures";
	      
	      
	      Part part=request.getPart("idproof");
	      FileUpload F=new FileUpload(part,path);
	      A.setIdentity_proof(F.filename);
	      boolean st=AgencyController.AddNewRecord(A);
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
