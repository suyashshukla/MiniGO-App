package com.nis.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Main
 */
@WebServlet("/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Main() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		out.println("<html><head><title>MiniGo...Your Journey Simplified!!!</title>");
		out.println("<link type=\"text/css\" rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.css\">\r\n" + 
				"    <link type=\"text/css\" rel=\"stylesheet\" href=\"bootstrap/css/style.css\">\r\n" + 
				"    <link type=\"text/css\" rel=\"stylesheet\" href=\"bootstrap/css/sidenav.css\">" +
				"    <link type=\"text/css\" rel=\"stylesheet\" href=\"bootstrap/css/sidenavfont.css\">");
		out.println("</head><body>");
		out.println("<div class=\"navbar navbar-default navbar-fixed-top\" >\r\n" + 
				"        <div class=\"container\">\r\n" + 
				"            <div class=\"navbar-header\">\r\n" + 
				"            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\r\n" + 
				"                <span class=\"icon-bar\"></span>\r\n" + 
				"                <span class=\"icon-bar\"></span>\r\n" + 
				"                <span class=\"icon-bar\"></span>\r\n" + 
				"                </button>\r\n" + 
				"                \r\n" + 
				"                <div id=\"mySidenav\" class=\"sidenav\">\r\n" + 
				"  <a href=\"javascript:void(0)\" class=\"closebtn\" onclick=\"closeNav()\">&times;</a>\r\n" + 
				"  <a href=\"AdminLogin\">Admin Login</a>\r\n" + 
				"  <a href=\"AgencyLogin\">Agency Login</a>\r\n" + 
				"  <a href=\"ClientLogin\">Client Login</a>\r\n" + 
				"</div>\r\n" + 
				"                <span onclick=\"openNav()\"><a href=\"#\" class=\"navbar-brand\">Login</a></span>\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"navbar-collapse collapse\">\r\n" + 
				"            <ul class=\"nav navbar-nav\">\r\n" + 
				"                <li><a href=\"Main\">Home</a></li>\r\n" + 
				"                <li><a href=\"About.jsp\">About Us</a></li>\r\n" + 
				"                <li><a href=\"Comments.jsp\">Comments</a></li>\r\n" + 
				"                <li class=\"dropdown\">\r\n" + 
				"                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">FAQ's<b class=\"caret\"></b></a>\r\n" + 
				"                    <ul class=\"dropdown-menu\">\r\n" + 
				"                        <li><a href=\"#\">Do you take travel expenses before or after the Journey??</a></li>\r\n" + 
				"                        <li><a href=\"#\">What is the basis of price charging i.e. depends on distance or number of customers??</a></li>\r\n" + 
				"                        <li><a href=\"#\">In case of cancellation in how much do we expect to get the money back</a></li>\r\n" + 
				"                        <li><a href=\"#\">Many More....</a></li>\r\n" + 
				"                    </ul>\r\n" + 
				"                </li>\r\n" + 
				"                <li class=\"dropdown\">\r\n" + 
				"                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Helpline Numbers<b class=\"caret\"></b></a>\r\n" + 
				"                    <ul class=\"dropdown-menu\">\r\n" + 
				"                        <li><a href=\"About.jsp\">Admin Contact</a></li>\r\n" + 
				"                        <li><a href=\"#\">Agency Contact</a></li>\r\n" + 
				"                        <li><a href=\"#\">Police</a></li>\r\n" + 
				"                        <li><a href=\"#\">Ambulance</a></li>\r\n" + 
				"                        <li><a href=\"#\">Fire</a></li>\r\n" + 
				"                        <li><a href=\"#\">Women Cell</a></li>\r\n" + 
				"                        </ul>\r\n" + 
				"                        </li>\r\n" + 
				"                </ul>\r\n" + 
				"            </div>\r\n" + 
				"            </div>\r\n" + 
				"            </div>\r\n" + 
				"      ");
		out.println("<br><br><br>\r\n" + 
				"        <div id=\"myCarousel\" class=\"carousel slide\">\r\n" + 
				"        <ol class=\"carousel-indicators\">\r\n" + 
				"        <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\r\n" + 
				"        <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\r\n" + 
				"        <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\r\n" + 
				"        <li data-target=\"#myCarousel\" data-slide-to=\"3\"></li>\r\n" + 
				"        </ol>\r\n" + 
				"              <div class=\"carousel-inner\">\r\n" + 
				"            <div class=\"item active\">\r\n" + 
				"                <center><img src=\"bootstrap/img/MiniGo.png\" height=\"50%\" width=\"50%\"></center>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"item\">\r\n" + 
				"                <center><img src=\"bootstrap/img/MiniGo.png\" height=\"50%\" width=\"50%\"></center>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"item\">\r\n" + 
				"                <center><img src=\"bootstrap/img/MiniGo.png\" height=\"50%\" width=\"50%\"></center>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"item\">\r\n" + 
				"                <center><img src=\"bootstrap/img/MiniGo.png\" height=\"50%\" width=\"50%\"></center>\r\n" + 
				"\r\n" + 
				"                </div>\r\n" + 
				"            </div>\r\n" + 
				"            <a class=\"left carousel-control\" href=\"#myCarousel\" data-slide=\"prev\">\r\n" + 
				"            <span class=\"glyphicon glyphicon-chevron-left\"></span>\r\n" + 
				"            </a>\r\n" + 
				"            <a class=\"right carousel-control\" href=\"#myCarousel\" data-slide=\"next\">\r\n" + 
				"            <span class=\"glyphicon glyphicon-chevron-right\"></span>\r\n" + 
				"            </a>\r\n" + 
				"        </div>\r\n" + 
				"");
		out.println("<div class=\"container\">\r\n" + 
				"        <div class=\"row\">\r\n" + 
				"        <div class=\"col-md-12\">\r\n" + 
				"        <center><h1>Welcome to MiniGo... Your Journey Simplified!!!!</h1></center>\r\n" + 
				"        <br>\r\n" + 
				"        <p>MiniGo is an unique combination of android app and webapp developed with an aim to improve the quality and save time of citizens from the continuous hectic strain and pain of chasing and waiting of public vehicles.</p>\r\n" + 
				"        </div>\r\n" + 
				"        </div>\r\n" + 
				"        </div>");
		out.println("<div class=\"container\">\r\n" + 
				"            <div class=\"row\">\r\n" + 
				"                <div class=\"col-md-12\">\r\n" + 
				"                    <hr/>\r\n" + 
				"                    <marquee><p>Copyrights and Copy: QuadSmart <a data-toggle=\"modal\" href=\"#myModal\">Terms and Conditions</a></p></marquee>\r\n" + 
				"                                        \r\n" + 
				"                    <div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\" aria-hidden=\"true\">\r\n" + 
				"                    <div class=\"modal-dialog\">\r\n" + 
				"                        <div class=\"modal-content\">\r\n" + 
				"                        <div class=\"modal-header\">\r\n" + 
				"                            <h2>Terms and Conditions</h2></div>\r\n" + 
				"                            <div class=\"modal-body\">\r\n" + 
				"                            <p>This website is the absolute copyright of Team Quadsmart and is not for sale point of view.</p>\r\n" + 
				"                            <p>The team members had worked very hard to develop it. So if any kind of copying is observed without permit the culprit will be severely punished.</p>\r\n" + 
				"                               </div>\r\n" + 
				"                            <div class=\"modal-footer\">\r\n" + 
				"                            <button type=\"button\" class=\"btn btn-primary\" data-dismiss=\"modal\">Close</button> \r\n" + 
				"                            </div>\r\n" + 
				"                        </div>\r\n" + 
				"                             </div>\r\n" + 
				"                    </div>\r\n" + 
				"                </div>\r\n" + 
				"                </div>\r\n" + 
				"                </div>");
		out.println("<script src=\"bootstrap/js/jquery-3.2.1.min.js\"></script>\r\n" + 
				"    <script src=\"bootstrap/js/bootstrap.min.js\"></script>\r\n" + 
				"    <script src=\"bootstrap/js/script.js\"></script>\r\n" + 
				"    <script src=\"bootstrap/js/sidenav.js\"></script>\r\n" + 
				"\r\n" + 
				"</body>\r\n" + 
				"</html>");
	}

}
