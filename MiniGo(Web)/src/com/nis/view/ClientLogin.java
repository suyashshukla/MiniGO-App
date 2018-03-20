package com.nis.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ClientLogin
 */
@WebServlet("/ClientLogin")
public class ClientLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		out.println("<html> \r\n" + 
				"<head> \r\n" + 
				"<title>MiniGo...Your Journey Simplified!!</title> \r\n" + 
				"<link type=\"text/css\" rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.css\"> \r\n" + 
				"<link type=\"text/css\" rel=\"stylesheet\" href=\"bootstrap/css/style.css\"> \r\n" + 
				"<link type=\"text/css\" rel=\"stylesheet\" href=\"bootstrap/css/sidenav.css\"> \r\n" +
				"<link type=\"text/css\" rel=\"stylesheet\" href=\"bootstrap/css/sidenavfont.css\"> \r\n" +
				"<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\"> \r\n" + 
				"</head> \r\n" + 
				"<body> \r\n" + 
				"<div class=\"navbar navbar-default navbar-fixed-top\" > \r\n" + 
				"<div class=\"container\"> \r\n" + 
				"<div class=\"navbar-header\"> \r\n" + 
				"<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\"> \r\n" + 
				"<span class=\"icon-bar\"></span> \r\n" + 
				"<span class=\"icon-bar\"></span> \r\n" + 
				"<span class=\"icon-bar\"></span> \r\n" + 
				"</button> \r\n" + 
				"<div id=\"mySidenav\" class=\"sidenav\"> \r\n" + 
				"<a href=\"javascript:void(0)\" class=\"closebtn\" onclick=\"closeNav()\">&times;</a> \r\n" + 
				"<a href=\"AdminLogin\">Admin Login</a> \r\n" + 
				"<a href=\"AgencyLogin\">Agency Login</a>\r\n" + 
				"<a href=\"ClientLogin\">Client Login</a> \r\n" + 
				"</div>\r\n" + 
				"<span onclick=\"openNav()\"><a href=\"#\" class=\"navbar-brand\">Login</a></span> \r\n" + 
				"</div> \r\n" + 
				"<div class=\"navbar-collapse collapse\"> \r\n" + 
				"<ul class=\"nav navbar-nav\"> \r\n" + 
				"<li><a href=\"Main\">Home</a></li> \r\n" + 
				"<li><a href=\"About.jsp\">About Us</a></li>\r\n" + 
				"<li><a href=\"Comments.jsp\">Comments</a></li>\r\n" + 
				"<li class=\"dropdown\"><a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">FAQ's<b class=\"caret\"></b></a>\r\n" + 
				"<ul class=\"dropdown-menu\"> \r\n" + 
				"<li><a href=\"#\">Do you take travel expenses before or after the Journey??</a></li>\r\n" + 
				"<li><a href=\"#\">What is the basis of price charging i.e. depends on distance or number of customers??</a></li> \r\n" + 
				"<li><a href=\"#\">In case of cancellation in how much do we expect to get the money back</a></li>\r\n" + 
				"<li><a href=\"#\">Many More....</a></li>\r\n" + 
				"</ul>\r\n" + 
				"</li> \r\n" + 
				"<li class=\"dropdown\">\r\n" + 
				"<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Helpline Numbers<b class=\"caret\"></b></a> \r\n" + 
				"<ul class=\"dropdown-menu\"> \r\n" + 
				"<li><a href=\"About.jsp\">Admin Contact</a></li> \r\n" + 
				"<li><a href=\"#\">Agency Contact</a></li>\r\n" + 
				"<li><a href=\"#\">Police</a></li>\r\n" + 
				"<li><a href=\"#\">Ambulance</a></li>\r\n" + 
				"<li><a href=\"#\">Fire</a></li>\r\n" + 
				"<li><a href=\"#\">Women Cell</a></li></ul>\r\n" + 
				"</li> \r\n" + 
				"</ul>\r\n" + 
				"</div></div></div><br><br><br>\r\n" + 
				"<div class=\"container\"> \r\n" + 
				"<div class=\"row\"> \r\n" + 
				"<div class=\"col-md-12\"> \r\n" + 
				"<h2>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Client Login</h2> <hr/>\r\n" + 
				"<form class=\"form-horizontal\" action = 'CheckClientLogin' method = 'post'> \r\n" + 
				"<div class=\"form-group\">\r\n" + 
				"<label for=\"id\" class=\"col-sm-2 control-label\">Client ID:</label> \r\n" + 
				"<div class=\"col-sm-6\"> \r\n" + 
				"<input type=\"text\" name ='cid' class=\"form-control\" placeholder=\"Enter your ID...\"> \r\n" + 
				"</div>\r\n" + 
				"</div> \r\n" + 
				"<div class=\"form-group\"> \r\n" + 
				"<label for=\"password\" class=\"col-sm-2 control-label\">Password:</label><div class=\"col-sm-6\">\r\n" + 
				"<input type=\"password\" name = 'pwd' class=\"form-control\" placeholder=\"Enter your Password...\">\r\n" + 
				"</div></div> \r\n" + 
				"<div class=\"form-group\"> \r\n" + 
				"<div class=\"col-sm-offset-2 col-sm-6\">\r\n" + 
				"<button type=\"submit\" class=\"btn btn-primary\" value = LogIn>Log In</button> \r\n" + 
				"<button type=\"reset\" class=\"btn btn-default\">Reset</button></div></div></form></div></div></div> \r\n" + 
				"<div class=\"container\"> \r\n" + 
				"<div class=\"row\"> \r\n" + 
				"<div class=\"col-md-12\">\r\n" + 
				"<h2>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;OR</h2> \r\n" + 
				"<hr/>\r\n" + 
				"<form class=\"form-horizontal\" action = 'ClientInterface' method = 'post'> \r\n" + 
				"<div class=\"form-group\">\r\n" + 
				"<div class=\"form-group\"> \r\n" + 
				"<div class=\"col-sm-offset-2 col-sm-6\">\r\n" + 
				"<button type=\"submit\" class=\"btn btn-primary\" value = SignUp>SignUp</button>\r\n" + 
				"</div> \r\n" + 
				"</div> \r\n" + 
				"</form>\r\n" + 
				"<div class=\"container\"> \r\n" + 
				"<div class=\"row\"> \r\n" + 
				"<div class=\"col-md-12\"> \r\n" + 
				"<hr/> \r\n" + 
				"<marquee><p>Copyrights and Copy: QuadSmart <a data-toggle=\"modal\" href=\"#myModal\">Terms and Conditions</a></p></marquee>\r\n" + 
				"<div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\" aria-hidden=\"true\"> \r\n" + 
				"<div class=\"modal-dialog\">\r\n" + 
				"<div class=\"modal-content\"> \r\n" + 
				"<h2>Terms and Conditions</h2></div>\r\n" + 
				"<div class=\"modal-body\"> \r\n" + 
				"<p>This website is the absolute copyright of Team Quadsmart and is not for sale point of view.</p> \r\n" + 
				"<p>The team members had worked very hard to develop it. So if any kind of copying is observed without permit the culprit will be severely punished.</p> \r\n" + 
				"</div>\r\n" + 
				"<div class=\"modal-footer\"> \r\n" + 
				"<button type=\"button\" class=\"btn btn-primary\" data-dismiss=\"modal\">Close</button> \r\n" + 
				"</div>\r\n" + 
				"</div> \r\n" + 
				"</div> \r\n" + 
				"</div> \r\n" + 
				"</div>\r\n" + 
				"</div> \r\n" + 
				"</div>\r\n" + 
				"<script src=\"bootstrap/js/jquery-3.2.1.min.js\"></script> \r\n" + 
				"<script src=\"bootstrap/js/bootstrap.min.js\"></script> \r\n" + 
				"<script src=\"bootstrap/js/script.js\"></script> \r\n" + 
				"<script src=\"bootstrap/js/sidenav.js\"></script> \r\n" + 
				"</body> \r\n" + 
				"</html>");
		
	}

}
