<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MiniGo...Your Journey Simplified!!</title>
    <link type="text/css" rel="stylesheet" href="bootstrap/css/bootstrap.css">
    <link type="text/css" rel="stylesheet" href="bootstrap/css/style.css">
    <link type="text/css" rel="stylesheet" href="bootstrap/css/sidenav.css">
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
  <a href="#">About</a>
  <a href="#">Services</a>
  <a href="#">Clients</a>
  <a href="#">Contact</a>
</div>
                <span onclick="openNav()"><a href="#" class="navbar-brand">MiniGo...</a></span>
            </div>
            <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
                <li><a href="index.html">Home</a></li>
                <li><a href="about.html">About</a></li>
                <li><a href="features.html">Features</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown Menu<b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">Menu-1</a></li>
                        <li><a href="#">Menu-2</a></li>
                        <li><a href="#">Menu-3</a></li>
                        <li><a href="#">Menu-4</a></li>
                        <li><a href="#">Menu-5</a></li>
                    </ul>
                </li>
                <li><a href="contact.html">Contact</a></li>
                </ul>
            </div>
            </div>
            </div>
        
        <!-- Form -->
        <br/><br/><br/>
        
        <div class="container">
        <div class="row">
            <div class="col-md-12">
                
            <h2>Contact Form</h2> <hr/>
                
                <form class="form-horizontal">
                <div class="form-group">
                    <label for="name" class="col-sm-2 control-label">Name</label>
                    <div class="col-sm-6">
                    <input type="text" class="form-control" placeholder="Enter your Name..."/>
                    </div>
                    </div>
                    
                    <div class="form-group">
                    <label for="email" class="col-sm-2 control-label">E-mail</label>
                    <div class="col-sm-6">
                    <input type="email" class="form-control" placeholder="Enter your Email..."/>
                    </div>
                    </div>
                    
                    <div class="form-group">
                    <label for="message" class="col-sm-2 control-label">Comments</label>
                    <div class="col-sm-6">
                    <textarea class="form-control" rows="3" placeholder="Enter your Message..."></textarea>
                    </div>
                    </div>
                    
                    <div class="form-group">
                    <label for="website" class="col-sm-2 control-label">Favourite Websites</label>
                    <div class="col-sm-6">
                    <label class="checkbox-inline">
                        <input type="checkbox" value="option1"/>Youtube
                        </label>
                         <label class="checkbox-inline">
                        <input type="checkbox" value="option2"/>Twitter
                        </label>
                         <label class="checkbox-inline">
                        <input type="checkbox" value="option3"/>LinkedIn
                        </label>
                    </div>
                    </div>
                    
                    <div class="form-group">
                    <label for="gender" class="col-sm-2 control-label">Gender</label>
                    <div class="col-sm-6">
                    <label class="radio-inline">
                        <input type="radio" name="genderRadio" value="option1"/>Male
                        </label>
                         <label class="radio-inline">
                        <input type="radio" name="genderRadio" value="option2"/>Female
                        </label>
                    </div>
                    </div>
                    
                    <div class="form-group">
                    <label for="city" class="col-sm-2 control-label">Cities</label>
                        <div class="col-sm-6">
                        <select class="col-md-6">
                            <option>Gwalior</option>
                            <option>Bhopal</option>
                            <option>Delhi</option>
                            <option>Agra</option>
                            </select>
                        </div>
                    </div>
                    
                    <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-6">
                        <button type="submit" class="btn btn-primary">Submit</button>
                        <button type="reset" class="btn btn-default">Reset</button>
                        </div>
                    </div>
                </form>
            </div>
            </div>
        </div>
        
            <!-- Footer Modal -->
            
            <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <hr/>
                    <p>Copyrights and Copy: Deepak Dutt Mishra
                    <a data-toggle="modal" href="#myModal">Terms and Conditions</a></p>
                    
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
                            <p>Some text will go here......</p>
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