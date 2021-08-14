<%-- 
    Document   : tags
    Created on : 30 May, 2021, 10:12:22 AM
    Author     : Lenovo
--%>
<%@page contentType="text/html" import="java.sql.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <style>
            /* unvisited link */
            a:link {
              color:black;
            }

            /* visited link */
            a:visited {
              color: green;
            }

            /* mouse over link */
            a:hover {
              color: red;
            }

            /* selected link */
            a:active {
              color: yellow;
            }
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
                  input[type=text] {
                    width: 140px;
                    box-sizing: border-box;
                    border: 2px solid #ccc;
                    border-radius: 20px;
                    font-size: 16px;
                    background-color: white;
                    background-image: url('https://img.icons8.com/ios/25/000000/search--v1.png');
                    background-position: 10px 10px; 
                    background-repeat: no-repeat;
                    padding: 12px 20px 12px 40px;
                    -webkit-transition: width 0.4s ease-in-out;
                    transition: width 0.4s ease-in-out;
                  }

                  input[type=text]:focus {
                    width: 100%;
                  }
                  .vl {
                        border-left: 1px solid blue;
                        height:900px;
                        position: absolute;
                        left: 21%;
                        margin-left: 10px;
                        top:55px;
                    }
                  
        </style>
 
    </head>
    <body>
    <div class="navbar navbar-light bg-warning">
    
        <div class="container-fluid">
            <div class="row">
                <div class="col-lg-12">

                    <div class="navbar-header">
                        <button class="navbar-toggle" data-target="#mobile_menu" data-toggle="collapse"><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button>
                        <a href="#" class="navbar-brand">StackOverflow</a>
                    </div>

                    <div class="navbar-collapse collapse" id="mobile_menu">
                        
                        <ul class="nav navbar-nav" style="margin-left:370px">
                            <li>
                                <form action="" class="navbar-form">
                                    <div class="form-group">
                                        <div class="input-group">
                                            <input type="search" name="search" id="" style="width:300px" placeholder="Search Anything Here..." class="form-control">
                                            <span class="input-group-addon"><span class="glyphicon glyphicon-search"></span></span>
                                        </div>
                                    </div>
                                </form>
                            </li>
                        </ul>

                        <ul class="nav navbar-nav navbar-right">
                            
                            <li><a href="#"><i class="glyphicon glyphicon-tags" style="font-size:20px"></i></a></li> 
                            <li><a href="#"><i class="glyphicon glyphicon-envelope" style="font-size:20px"></i></a></li>
                            <li><a href="#"><i class="fa fa-question-circle" style="font-size:20px"></i></a></li>
                            <li><a href="#"><span class="glyphicon glyphicon-user"></span> Profile</a></li>
                            <li><a href="#"><span class="glyphicon glyphicon-log-in"></span></a></li>
                            
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="container">
        
         <div class="row">
            
            <div class="col-sm-2">
                
                <div class="sidebar sidebar-light bg-light">
                    <li><a class="" href="#">Home</a></li>
                     <li><a href="#">Questions</a></li>
                     <li><a href="#">Users</a></li>
                     <li><a href="#">Unanswered</a></li>
                </div>
            </div>
			
			<div class="vl">
			</div>
                
            
            <div class="col-sm-10">
               <div class="row">
                    <table class="table table-responsive w3-card">
                        <tr>
                            <td><h2>Tags</h2></td>
                        </tr>
                        <tr>
                            <td>A tag is a keyword or label that categorizes your question with other, similar questions. Using the right tags makes it easier for others to find and answer your question.</td>
                            
                        </tr>
                    </table>
                   <table class="table">
                       <tr>
                           <td style="border:none">
                               <form>
                                    <input type="text" name="search" placeholder="Search..">
                               </form>
                           </td>
                            <td style="border:none" align="right">
                                <button class="button2">Active</button><button class="button2">Hot</button><button class="button2">Week</button><button class="button2">Month</button>
                            </td>
                       </tr>
                   </table> 
                <div class="row w3-card"  style="margin-top:-15px">
                    <table class="table table-responsive">
                        
                           <%
                           
                        try{
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stackoverflow","root","");
                            Statement st = cn.createStatement();

                            ResultSet rs=st.executeQuery("select * from tags");
                            while(rs.next()){
                                 int sn=rs.getInt(1);
                                            %>
                                            <tr>
                                                <td><%=sn%></td>
                                                <td><%=rs.getString(2)%></td>
                                            </tr>
                      <%
                       } 
                             cn.close();
                                            }
                                            catch(Exception er){
                                                 out.print(er.getMessage());
                                            }
                      %>
                      
                        </tr>
                    </table>
                </div>
                
               
                
            </div>
            <!--Main Box End-->
            
        </div>
        </div>
        
        
    
        
    </body>
</html>