<%-- 
    Document   : register
    Created on : 26 May, 2021, 10:48:43 AM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Stackoverflow</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <link href='https://fonts.googleapis.com/css?family=IBM Plex Mono' rel='stylesheet'>
    <style>
            .parallax {
                background-image: url("g.jpg");
                height:100vh;
                background-attachment: fixed;
                background-position: center;
                background-repeat: no-repeat;
                background-size: cover;
            }
            .row1{
              margin-top:200px;
              margin-left:200px;
              margin-right:200px;

            }
            .panel-heading{
                background-image:url("head.jpg");
            }
            .panel-body{
                background-color: #d9d4d5;
            font-family: 'IBM Plex Mono';
            }
            .button {
                background: #ff6484;
                border-radius: 70px;
                padding: 10px 10px;
                color: #fff;
                text-decoration: none;
                font-size: 1.45em;
                margin: 10px 10px;
              }
            .button1 {
              background: green;
              border-radius: 70px;
              padding: 10px 18px;
              color: #fff;
              text-decoration: none;
              font-size: 1em;
              margin: 5px;
            }
           
    </style>
    
    <script>
                $(document).ready(function(){
			$("#login").click(function(){
				$("#signin").modal();
			});
		});
                
                function pageRedirect() {
                        window.location.replace("register.jsp");
                    }   
    </script>
    </head>
    <body>
        
        
        
        <div id="signin" class="modal fade" role="dialog">
  <div class="modal-dialog">

    <!-- Modal content-->
    <div class="modal-content">
      <div class="modal-header"  style="background-color:oldlace;color:black">
        <button type="button" class="close" data-dismiss="modal">&times;</button>
        <h4 class="modal-title">Login</h4>
      </div>
      <div class="modal-body">
          <form method="post" action="cookie.jsp">
            <div class="input-group">
                <span class="input-group-addon"><i class="fa fa-user"></i></span>
                <input id="email" type="text" class="form-control" name="email" placeholder="Email">
            </div><br>
            <div class="input-group">
                <span class="input-group-addon"><i class="fa fa-lock"></i></span>
                <input id="password" type="password" class="form-control" name="pass" placeholder="Password">
            </div><br>
        	<input type="submit" value="Login" class="btn btn-primary" />
                <a href="signup.jsp" style="float:right">Forgot Password?</a>
          </form>      
      </div>
      <div class="modal-footer">
          <button class="btn btn-success" onclick="pageRedirect()" style="float:left;border:none">Create an Account</button>
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
      </div>
    </div>

  </div>
</div>
        
        
        
            <div class="row">
		<div class="parallax">
                    <div class="container">
                        <div class="row1">
                            
                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h2 align="center" style="color:white"><strong>S T A C K E X C H A N G E</strong></h2><br>
                                        <center style="color:orange">A place to share knowledge and better understand the world.</center>
                                        
                                    </div>
                                    <div class="panel-body">
                                        <form action="data.jsp" method="post">
                                            <div class="w3-padding-20">
                                                <center><h2><strong>Sign Up</strong></h2></center>
                                            </div>
                                            <div class="w3-padding-22">
                                                
                                               <div class="row">
                                                    <div class="col-sm-6">
                                                        <input type="text" class="form-control" name="fname" placeholder="First name" required>
                                                    </div>
                                                    <div class="col-sm-6 ">
                                                        <input type="text" class="form-control" name="lname" placeholder="Last name" required>
                                                    </div><br><br>
                                                    
                                                    
                                                    <div class="col-sm-8 ">
                                                        <input type="email" class="form-control" name="email" placeholder="Email-ID" required>
                                                    </div><br><br>
                                                    <div class="col-sm-8">
                                                        <input type="password" class="form-control" name="pass" placeholder="Password" required>
                                                    </div><br><br>
                                                    
                                                    <div class="col-sm-4">
                                                        <input type="submit" class="button" value="Sign-Up">
                                                    </div>
                                                    
                                             
                                                  </div>
                                                
                                            </div>
                                                
                                                
                                        </form>
                                            <div class="col-sm-8">
                                                <label>Already A Member...??</label>
                                                <button class="button1" id="login">Log-In</button>
                                            </div>
                                    </div>
                                    
                                </div>
                           
                        </div>
                    </div>
                   
                </div>
            </div>
            
       
    </body>

</html>

<!--
-->