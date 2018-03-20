<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>MiniGo...Your Journey Simplified!!</title>
    <link type="text/css" rel="stylesheet" href="bootstrap/css/bootstrap.css">
    <link type="text/css" rel="stylesheet" href="bootstrap/css/style.css">
    <link type="text/css" rel="stylesheet" href="bootstrap/css/sidenav.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<div class="navbar navbar-default navbar-fixed-top" >
        <div class="container">
            <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                </button>
                
                <div id="mySidenav" class="sidenav">
  <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
  <a href="AdminLogin">Admin Login</a>
  <a href="AgencyLogin">Agency Login</a>
  <a href="ClientLogin">Client Login</a>
</div>
                <span onclick="openNav()"><a href="#" class="navbar-brand">Login</a></span>
            </div>
            <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
                <li><a href="Main">Home</a></li>
                <li><a href="About.jsp">About Us</a></li>
                <li><a href="Comments.jsp">Comments</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">FAQ's<b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">Do you take travel expenses before or after the Journey??</a></li>
                        <li><a href="#">What is the basis of price charging i.e. depends on distance or number of customers??</a></li>
                        <li><a href="#">In case of cancellation in how much do we expect to get the money back</a></li>
                        <li><a href="#">Many More....</a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Helpline Numbers<b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a href="About.jsp">Admin Contact</a></li>
                        <li><a href="#">Agency Contact</a></li>
                        <li><a href="#">Police</a></li>
                        <li><a href="#">Ambulance</a></li>
                        <li><a href="#">Fire</a></li>
                        <li><a href="#">Women Cell</a></li>
                        </ul>
                        </li>
                </ul>
            </div>
            </div>
            </div>
            
            <br><br><br><br>
        
        <div class="container">
        <div class="row">
            <div class="col-md-3">
            <div class="jumbotron">
            	<img src="bootstrap/img/MiniGo.png" height="80%" width="80%">
                <h3>Suyash Shukla</h3>
                <p>Android App Developer</p>
                <p><a href="#" class="btn btn-primary">Learn More>></a></p>
                </div>       
            </div>
            <div class="col-md-3">
            <div class="jumbotron">
            <img src="bootstrap/img/MiniGo.png" height="80%" width="80%">
                <h3>Abhishek Jain</h3>
                <p>Back-End Developer</p>
                <p><a href="#" class="btn btn-warning">Learn More>></a></p>
                </div>       
            </div>
            <div class="col-md-3">
            <div class="jumbotron">
            <img src="bootstrap/img/MiniGo.png" height="80%" width="80%">
                <h3>Amit Shukla</h3>
                <p>Back-End Developer</p>
                <p><a href="#" class="btn btn-danger">Learn More>></a></p>
                </div>       
            </div>
            <div class="col-md-3">
            <div class="jumbotron">
            <img src="bootstrap/img/MiniGo.png" height="80%" width="80%">
                <h3>Deepak Dutt Mishra</h3>
                <p>Front-End Designer</p>
                <p><a href="#" class="btn btn-success">Learn More>></a></p>
                </div>       
            </div>
            </div>
        </div>
       
            
            <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <hr/>
                    <marquee><p>Copyrights and Copy: QuadSmart <a data-toggle="modal" href="#myModal">Terms and Conditions</a></p></marquee>
                                        
                    <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-hidden="true">
                    <div class="modal-dialog">
                        <div class="modal-content">
                        <div class="modal-header">
                            <h2>Terms and Conditions</h2></div>
                            <div class="modal-body">
                                 <p>This website is the absolute copyright of Team Quadsmart and is not for sale point of view.</p>
                            <p>The team members had worked very hard to develop it. So if any kind of copying is observed without permit the culprit will be severely punished.</p>
                               </div>
                            <div class="modal-footer">
                            <button type="button" class="btn btn-primary" data-dismiss="modal">Close</button> 
                            </div>
                        </div>
                             </div>
                    </div>
                </div>
                </div>
                </div>
        
    <script src="bootstrap/js/jquery-3.2.1.min.js"></script>
    <script src="bootstrap/js/bootstrap.min.js"></script>
    <script src="bootstrap/js/script.js"></script>
    <script src="bootstrap/js/sidenav.js"></script>
            
      
</body>
</html>