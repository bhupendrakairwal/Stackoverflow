<%-- 
    Document   : demo
    Created on : 25 May, 2021, 12:25:39 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" import="java.util.*,java.lang.*,java.sql.*" pageEncoding="UTF-8"%>
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
        <link href='https://fonts.googleapis.com/css?family=Long Cang' rel='stylesheet'>
    <style>
        h2{
            color:coral;
        }
        .button {
         color: white;
         text-align: center;
         text-decoration: none;
         display: inline-block;
         font-size: 8px;
         margin: 4px 2px;
         transition-duration: 0.3s;
         cursor: pointer;
       }

       .button1 {
         background-color:buttonface; 
         color: black;
         border: 1px solid;
         border-radius:8px;

       }

       .button1:hover {
         background-color:lavender;
         color: black;
       }

       .button2 {
         background-color: white; 
         color: black; 
         border: 1px solid;
       }

       .button2:hover {
         background-color: #008CBA;
         color: white;
       }
       .vl {
             border-left: 1px solid #33b5e5;
             height: 160%;
             position: absolute;
             left: 15%;
             margin-left: 10px;
             top:57px;
         }


    .sidebar li {
      padding: 8px;
      margin-bottom: 7px;
      background-color: #33b5e5;
      color: #ffffff;
      box-shadow: 0 1px 3px rgba(0,0,0,0.12), 0 1px 2px rgba(0,0,0,0.24);
    }

    .sidebar li:hover {
        background-color: #0099cc;
    }
     button.like{
         width: 30px;
         height: 30px;
         margin: 0 auto;
         line-heigth: 50px;
         border-radius: 50%;
         color: rgba(0,150,136 ,1);
         background-color:rgba(38,166,154 ,0.3);
         border-color: rgba(0,150,136 ,1);
         border-width: 1px;
         font-size: 15px;
     }

     button.dislike{
        width: 30px;
        height: 30px;
        margin: 0 auto;
        line-heigth: 50px;
        border-radius: 50%;
        color: rgba(255,82,82 ,1);
        background-color: rgba(255,138,128 ,0.3);
        border-color: rgba(255,82,82 ,1);
        border-width: 1px;
        font-size: 15px;
     }


     .fa:hover {
        opacity: 0.7;
     }

     .fa-facebook {
       padding: 20px;
       font-size: 30px;
       width: 70px;
       text-align: center;
       text-decoration: none;
       margin: 5px 2px;
       background: #3B5998;
       color: white;
     }

     .fa-twitter {
       padding: 20px;
       font-size: 30px;
       width: 70px;
       text-align: center;
       text-decoration: none;
       margin: 5px 2px;
       background: #55ACEE;
       color: white;
     }

     .fa-google {
         padding: 20px;
       font-size: 30px;
       width: 70px;
       text-align: center;
       text-decoration: none;
       margin: 5px 2px;
       background: #dd4b39;
       color: white;
     }

     .fa-youtube {
       padding: 20px;
       font-size: 30px;
       width: 70px;
       text-align: center;
       text-decoration: none;
       margin: 5px 2px;
       background: #bb0000;
       color: white;
     }

     .fa-instagram {
       padding: 20px;
       font-size: 30px;
       width: 70px;
       text-align: center;
       text-decoration: none;
       margin: 5px 2px;
       background: #125688;
       color: white;
     }

     .fa-pinterest {
       padding: 20px;
       font-size: 30px;
       width: 70px;
       text-align: center;
       text-decoration: none;
       margin: 5px 2px;
       background: #cb2027;
       color: white;
     }
                
        </style>
        
        <script>
                $(document).ready(function(){
                    $("#search").keyup(function(){
                        if($(this).val().length==0){
                            $("#sv").html("");
                       }
                        else{
                            var v = $(this).val();
                            $.post(
                                "search_record.jsp",{id:v},function(data){
                                    $("#main").html(data);

                                });
                        }
                    });
                
                
            });
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
        <!--Login modal end-->
    <div class="navbar navbar-light bg-warning">
    
        <div class="container-fluid">
            <div class="row">
                <div class="col-lg-12">

                    <div class="navbar-header">
                        <button class="navbar-toggle" data-target="#mobile_menu" data-toggle="collapse"><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button>
                        <a href="#" class="navbar-brand"><strong>S T A C K E X C H A N G E</strong></a>
                    </div>

                    <div class="navbar-collapse collapse" id="mobile_menu">
                        
                        

                        <ul class="nav navbar-nav navbar-right">
                            
                            <li><a href="tags.jsp"><i class="glyphicon glyphicon-tags" style="font-size:20px"></i></a></li> 
                            <li><a href="#"><i class="glyphicon glyphicon-envelope" style="font-size:20px"></i></a></li>
                            <li><a href="#"><span class="fa fa-question-circle" style="font-size:20px"></span></a></li>
                            
                            <li><button id="login"  class="btn btn-primary" style="margin-top:5px">Log-In<i class="glyphicon glyphicon-log-in"></i></button></li>
                            
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="container-fluid">
         <div class="vl">
          
         </div>
        <div class="row" style="margin-top:-60px">
            <header class="w3-container w3-bg-light">
                <marquee style="color:orange;margin-left:250px;margin-right:20px"><h2 style="font-family:Long Cang;">WELCOME TO NEW ERA OF SOLUTIONS</h2></marquee>
            </header>
            <div class="col-sm-2">
                
                <div class="sidebar sidebar-light bg-light" style="margin-left:30px">
                    <li><a class="" href="#">Home</a></li>
                     <li><a href="#">Questions</a></li>
                     <li><a href="#">Users</a></li>
                     <li><a href="#">Unanswered</a></li>
                </div>
            </div>
           
                
            
            <div class="col-sm-7">
                 <%
          if(request.getParameter("id")!=null){
                   %>
                   <div class="panel-body"> 
                        <div class="alert alert-success">
                                <strong>Well done!</strong> Your Feedback sent successfully.
                        </div>
                   </div>
        <%
            }
                if(request.getParameter("err")!=null){
        %>
                    <div class="panel-body"> 
                        <div class="alert alert-danger ">
                            <strong>All Fields Required.</strong>
                        </div>
                   </div>
        <%            
                }
                if(request.getParameter("invalid_pass")!=null){
        %>
        <div class="panel-body"> 
                        <div class="alert alert-danger">
                                <strong>Invalid PASSWORD</strong> Enter a correct Password.
                        </div>
                   </div>
                    <%
                    }
                
                if(request.getParameter("invalid_email")!=null){
                   %>
                  <div class="panel-body"> 
                        <div class="alert alert-warning">
                                <strong>Invalid Email</strong> Enter a correct Email-id.
                        </div>
                   </div>
                   <%
                   }
                if(request.getParameter("login")!=null){
                   %>
                  <div class="panel-body"> 
                        <div class="alert alert-success">
                                <strong>Sign-Up</strong> Successfull, Login to Continue.
                        </div>
                   </div>
                   <%
                   }
                
         %>
        
         
                                <form action="" class="navbar-form w3-padding-28">
                                    <div class="form-group">
                                        
                                            <label>Search</label>
                                            <input type="search" name="search" id="search" style="color:#9acfea;width:700px;" placeholder="Search Anything Here..." class="form-control">
                                      
                                    </div>
                                </form>
                          
               <div class="row">
                   
                    <table class="table table-responsive w3-card">
                        <tr>
                            <td><h2>Explore Your Questions</h2></td>
                            
                        </tr>
                        <tr>
                            <td style="border:none"><button class="button1">hello</button> <button class="button1">hello</button> <button class="button1">hello</button> <button class="button1">hello</button> <button class="button1">hello</button> <button class="button1">hello</button> <button class="button1">hello</button>
                                <button class="button1">hello</button> <a href="#">More Tags..</a></td>
                            <td style="border:none"><button class="button2">Active</button><button class="button2">Hot</button><button class="button2">Week</button><button class="button2">Month</button></td>
                        </tr>
                    </table>


                </div>
                
                <div class="row w3-card" id="main">
                    
                        <%
                            String pg=request.getParameter("pg");
                            
                            int i=0;
                            if(pg!=null){
                         i=Integer.parseInt(pg);
                    }
                    int start=i*2;
                    int next=i+1;
                    int previous=i-1;                           
                        try{
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stackoverflow","root","");
                            Statement st = cn.createStatement();

                            ResultSet rs=st.executeQuery("select * from trends where status=0 order by sn limit "+start+",3");
                            while(rs.next()){
                                 int sn=rs.getInt(1);
                                            %>
                                         
                <div class="col-sm-12 col-sm-12">
                    <div class="panel panel-info">
                        <div class="panel-heading">
                            <h1><a href="answer.jsp?id=<%=rs.getString("qcode")%>"><%=rs.getString("question")%></a></h1>
                        </div>
                        <div class="panel-body">
                            <label>Answer</label>:- <%=rs.getString("answer")%><br>
                            <br><br>
                                

                            
                            <div class="form-group">
                            <button class="dislike">
                                    <i class="fa fa-thumbs-o-down" aria-hidden="true"></i>
                            </button>

                            <button class="like">
                                    <i class="fa fa-thumbs-o-up" aria-hidden="true"></i>
                            </button>
                            </div>
                        </div>
                            
                        
                    </div>
                </div>
               
                      <%
                       } 
                             cn.close();
                                            }
                                            catch(Exception er){
                                                 out.print(er.getMessage());
                                            }
                      
                      %>
                     <div class="w3-padding-32">
			    <a style="margin-left:10px" href="index.jsp?pg=<%=previous%>" id="aid">Previous</a>
                            <a style="float:right;margin-right: 10px" href="index.jsp?pg=<%=next%>">Next</a>
		   </div>
                    </div>
                </div>
            <!--Main Box End-->
            <div class="col-sm-3  w3-padding-32">
                <div class="panel-body"> 
                    <div class="alert alert-info">
                      <h2>Ask Your Questions</h2>  
                    </div>
                   
                
                    <form method="post" action="user_question.jsp">
                        <label>Subject</label><input class="form-control" type="text" name="tag" required>
                        <label class="form-control-static">Your Question</label><br>
                        <textarea class="form-control" name="question" cols="12" rows="8"></textarea><br>
                    <button class="btn btn btn-success">Submit</button>
                    </form>
            </div>
            </div>
        </div>              
        </div>
        <div class="row bg-warning " style="margin-top:20px">
            <div class="container-fluid">    
                <div class="col-sm-6 w3-container w3-padding-32 " id="contact">
                    <h3 style="color:BLACK">Contact</h3>
                    <p style="color:BLACK">Lets get in touch and talk about your Queries.</p>
                    <form method="post"  action="feedback.jsp"  >
                      <input class="w3-input w3-border" type="text" placeholder="Name" required name="name">
                      <input class="w3-input w3-section w3-border" type="text" placeholder="Email" required name="email">
                      <input class="w3-input w3-section w3-border" type="text" placeholder="Subject" required name="subject">
                      <input class="w3-input w3-section w3-border" type="text" placeholder="Comment" required name="comment">
                      <button class="w3-button w3-black w3-section"   type="submit">Send Message</button>
                    </form>
                </div>
                <div class="col-sm-6 w3-container w3-padding-32" style="margin-top:100px" >
                    <center><h2 style="color:black;font-family:'Comic Sans MS'">STACKEXCHANGE</h2>
                    <h2 style="color:black;font-size:32px">Contact Us</h2>
                    <h4  style="color:BLACK"><i class="fa fa-inbox" style="color:BLACK"></i> info@stackoverflow.com</h4></center>
                </div>
                <div class="col-sm-12">
                    <center>
                        <a href="#" class="fa fa-facebook"></a>
                        <a href="#" class="fa fa-twitter"></a>
                        <a href="#" class="fa fa-google"></a>
                        <a href="#" class="fa fa-youtube"></a>
                        <a href="#" class="fa fa-instagram"></a>
                        <a href="#" class="fa fa-pinterest"></a>
                    </center>
                </div>
            </div> 
            <div class="row" style="background-color:#000000">
  		<div class="col-sm-12" style="height:50px"><br><center><a href="#" style="color:#FFFFFF">Deepak @STACKOVERFLOW  ©  2020</a></center></div>
            </div>
        </div>
	<!-- end footer -->  
        
    </body>
</html>
