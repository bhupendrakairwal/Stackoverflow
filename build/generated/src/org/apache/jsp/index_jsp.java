package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.lang.*;
import java.sql.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Stackoverflow</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Long Cang' rel='stylesheet'>\n");
      out.write("    <style>\n");
      out.write("        h2{\n");
      out.write("            color:coral;\n");
      out.write("        }\n");
      out.write("        .button {\n");
      out.write("         color: white;\n");
      out.write("         text-align: center;\n");
      out.write("         text-decoration: none;\n");
      out.write("         display: inline-block;\n");
      out.write("         font-size: 8px;\n");
      out.write("         margin: 4px 2px;\n");
      out.write("         transition-duration: 0.3s;\n");
      out.write("         cursor: pointer;\n");
      out.write("       }\n");
      out.write("\n");
      out.write("       .button1 {\n");
      out.write("         background-color:buttonface; \n");
      out.write("         color: black;\n");
      out.write("         border: 1px solid;\n");
      out.write("         border-radius:8px;\n");
      out.write("\n");
      out.write("       }\n");
      out.write("\n");
      out.write("       .button1:hover {\n");
      out.write("         background-color:lavender;\n");
      out.write("         color: black;\n");
      out.write("       }\n");
      out.write("\n");
      out.write("       .button2 {\n");
      out.write("         background-color: white; \n");
      out.write("         color: black; \n");
      out.write("         border: 1px solid;\n");
      out.write("       }\n");
      out.write("\n");
      out.write("       .button2:hover {\n");
      out.write("         background-color: #008CBA;\n");
      out.write("         color: white;\n");
      out.write("       }\n");
      out.write("       .vl {\n");
      out.write("             border-left: 1px solid #33b5e5;\n");
      out.write("             height: 160%;\n");
      out.write("             position: absolute;\n");
      out.write("             left: 15%;\n");
      out.write("             margin-left: 10px;\n");
      out.write("             top:57px;\n");
      out.write("         }\n");
      out.write("\n");
      out.write("\n");
      out.write("    .sidebar li {\n");
      out.write("      padding: 8px;\n");
      out.write("      margin-bottom: 7px;\n");
      out.write("      background-color: #33b5e5;\n");
      out.write("      color: #ffffff;\n");
      out.write("      box-shadow: 0 1px 3px rgba(0,0,0,0.12), 0 1px 2px rgba(0,0,0,0.24);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .sidebar li:hover {\n");
      out.write("        background-color: #0099cc;\n");
      out.write("    }\n");
      out.write("     button.like{\n");
      out.write("         width: 30px;\n");
      out.write("         height: 30px;\n");
      out.write("         margin: 0 auto;\n");
      out.write("         line-heigth: 50px;\n");
      out.write("         border-radius: 50%;\n");
      out.write("         color: rgba(0,150,136 ,1);\n");
      out.write("         background-color:rgba(38,166,154 ,0.3);\n");
      out.write("         border-color: rgba(0,150,136 ,1);\n");
      out.write("         border-width: 1px;\n");
      out.write("         font-size: 15px;\n");
      out.write("     }\n");
      out.write("\n");
      out.write("     button.dislike{\n");
      out.write("        width: 30px;\n");
      out.write("        height: 30px;\n");
      out.write("        margin: 0 auto;\n");
      out.write("        line-heigth: 50px;\n");
      out.write("        border-radius: 50%;\n");
      out.write("        color: rgba(255,82,82 ,1);\n");
      out.write("        background-color: rgba(255,138,128 ,0.3);\n");
      out.write("        border-color: rgba(255,82,82 ,1);\n");
      out.write("        border-width: 1px;\n");
      out.write("        font-size: 15px;\n");
      out.write("     }\n");
      out.write("\n");
      out.write("\n");
      out.write("     .fa:hover {\n");
      out.write("        opacity: 0.7;\n");
      out.write("     }\n");
      out.write("\n");
      out.write("     .fa-facebook {\n");
      out.write("       padding: 20px;\n");
      out.write("       font-size: 30px;\n");
      out.write("       width: 70px;\n");
      out.write("       text-align: center;\n");
      out.write("       text-decoration: none;\n");
      out.write("       margin: 5px 2px;\n");
      out.write("       background: #3B5998;\n");
      out.write("       color: white;\n");
      out.write("     }\n");
      out.write("\n");
      out.write("     .fa-twitter {\n");
      out.write("       padding: 20px;\n");
      out.write("       font-size: 30px;\n");
      out.write("       width: 70px;\n");
      out.write("       text-align: center;\n");
      out.write("       text-decoration: none;\n");
      out.write("       margin: 5px 2px;\n");
      out.write("       background: #55ACEE;\n");
      out.write("       color: white;\n");
      out.write("     }\n");
      out.write("\n");
      out.write("     .fa-google {\n");
      out.write("         padding: 20px;\n");
      out.write("       font-size: 30px;\n");
      out.write("       width: 70px;\n");
      out.write("       text-align: center;\n");
      out.write("       text-decoration: none;\n");
      out.write("       margin: 5px 2px;\n");
      out.write("       background: #dd4b39;\n");
      out.write("       color: white;\n");
      out.write("     }\n");
      out.write("\n");
      out.write("     .fa-youtube {\n");
      out.write("       padding: 20px;\n");
      out.write("       font-size: 30px;\n");
      out.write("       width: 70px;\n");
      out.write("       text-align: center;\n");
      out.write("       text-decoration: none;\n");
      out.write("       margin: 5px 2px;\n");
      out.write("       background: #bb0000;\n");
      out.write("       color: white;\n");
      out.write("     }\n");
      out.write("\n");
      out.write("     .fa-instagram {\n");
      out.write("       padding: 20px;\n");
      out.write("       font-size: 30px;\n");
      out.write("       width: 70px;\n");
      out.write("       text-align: center;\n");
      out.write("       text-decoration: none;\n");
      out.write("       margin: 5px 2px;\n");
      out.write("       background: #125688;\n");
      out.write("       color: white;\n");
      out.write("     }\n");
      out.write("\n");
      out.write("     .fa-pinterest {\n");
      out.write("       padding: 20px;\n");
      out.write("       font-size: 30px;\n");
      out.write("       width: 70px;\n");
      out.write("       text-align: center;\n");
      out.write("       text-decoration: none;\n");
      out.write("       margin: 5px 2px;\n");
      out.write("       background: #cb2027;\n");
      out.write("       color: white;\n");
      out.write("     }\n");
      out.write("                \n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("                $(document).ready(function(){\n");
      out.write("                    $(\"#search\").keyup(function(){\n");
      out.write("                        if($(this).val().length==0){\n");
      out.write("                            $(\"#sv\").html(\"\");\n");
      out.write("                       }\n");
      out.write("                        else{\n");
      out.write("                            var v = $(this).val();\n");
      out.write("                            $.post(\n");
      out.write("                                \"search_record.jsp\",{id:v},function(data){\n");
      out.write("                                    $(\"#main\").html(data);\n");
      out.write("\n");
      out.write("                                });\n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            });\n");
      out.write("            $(document).ready(function(){\n");
      out.write("\t\t\t$(\"#login\").click(function(){\n");
      out.write("\t\t\t\t$(\"#signin\").modal();\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("            function pageRedirect() {\n");
      out.write("                window.location.replace(\"register.jsp\");\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("           \n");
      out.write("                \n");
      out.write("            \n");
      out.write("    </script>\n");
      out.write(" \n");
      out.write("    </head>\n");
      out.write("   \n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div id=\"signin\" class=\"modal fade\" role=\"dialog\">\n");
      out.write("  <div class=\"modal-dialog\">\n");
      out.write("\n");
      out.write("    <!-- Modal content-->\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("      <div class=\"modal-header\"  style=\"background-color:oldlace;color:black\">\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("        <h4 class=\"modal-title\">Login</h4>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("          <form method=\"post\" action=\"cookie.jsp\">\n");
      out.write("            <div class=\"input-group\">\n");
      out.write("                <span class=\"input-group-addon\"><i class=\"fa fa-user\"></i></span>\n");
      out.write("                <input id=\"email\" type=\"text\" class=\"form-control\" name=\"email\" placeholder=\"Email\">\n");
      out.write("            </div><br>\n");
      out.write("            <div class=\"input-group\">\n");
      out.write("                <span class=\"input-group-addon\"><i class=\"fa fa-lock\"></i></span>\n");
      out.write("                <input id=\"password\" type=\"password\" class=\"form-control\" name=\"pass\" placeholder=\"Password\">\n");
      out.write("            </div><br>\n");
      out.write("        \t<input type=\"submit\" value=\"Login\" class=\"btn btn-primary\" />\n");
      out.write("                <a href=\"signup.jsp\" style=\"float:right\">Forgot Password?</a>\n");
      out.write("          </form>      \n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-footer\">\n");
      out.write("          <button class=\"btn btn-success\" onclick=\"pageRedirect()\" style=\"float:left;border:none\">Create an Account</button>\n");
      out.write("          <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("        <!--Login modal end-->\n");
      out.write("    <div class=\"navbar navbar-light bg-warning\">\n");
      out.write("    \n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("\n");
      out.write("                    <div class=\"navbar-header\">\n");
      out.write("                        <button class=\"navbar-toggle\" data-target=\"#mobile_menu\" data-toggle=\"collapse\"><span class=\"icon-bar\"></span><span class=\"icon-bar\"></span><span class=\"icon-bar\"></span></button>\n");
      out.write("                        <a href=\"#\" class=\"navbar-brand\"><strong>S T A C K E X C H A N G E</strong></a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"navbar-collapse collapse\" id=\"mobile_menu\">\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("\n");
      out.write("                        <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                            \n");
      out.write("                            <li><a href=\"tags.jsp\"><i class=\"glyphicon glyphicon-tags\" style=\"font-size:20px\"></i></a></li> \n");
      out.write("                            <li><a href=\"#\"><i class=\"glyphicon glyphicon-envelope\" style=\"font-size:20px\"></i></a></li>\n");
      out.write("                            <li><a href=\"#\"><span class=\"fa fa-question-circle\" style=\"font-size:20px\"></span></a></li>\n");
      out.write("                            \n");
      out.write("                            <li><button id=\"login\"  class=\"btn btn-primary\" style=\"margin-top:5px\">Log-In<i class=\"glyphicon glyphicon-log-in\"></i></button></li>\n");
      out.write("                            \n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("         <div class=\"vl\">\n");
      out.write("          \n");
      out.write("         </div>\n");
      out.write("        <div class=\"row\" style=\"margin-top:-60px\">\n");
      out.write("            <header class=\"w3-container w3-bg-light\">\n");
      out.write("                <marquee style=\"color:orange;margin-left:250px;margin-right:20px\"><h2 style=\"font-family:Long Cang;\">WELCOME TO NEW ERA OF SOLUTIONS</h2></marquee>\n");
      out.write("            </header>\n");
      out.write("            <div class=\"col-sm-2\">\n");
      out.write("                \n");
      out.write("                <div class=\"sidebar sidebar-light bg-light\" style=\"margin-left:30px\">\n");
      out.write("                    <li><a class=\"\" href=\"#\">Home</a></li>\n");
      out.write("                     <li><a href=\"#\">Questions</a></li>\n");
      out.write("                     <li><a href=\"#\">Users</a></li>\n");
      out.write("                     <li><a href=\"#\">Unanswered</a></li>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("                \n");
      out.write("            \n");
      out.write("            <div class=\"col-sm-7\">\n");
      out.write("                 ");

          if(request.getParameter("id")!=null){
                   
      out.write("\n");
      out.write("                   <div class=\"panel-body\"> \n");
      out.write("                        <div class=\"alert alert-success\">\n");
      out.write("                                <strong>Well done!</strong> Your Feedback sent successfully.\n");
      out.write("                        </div>\n");
      out.write("                   </div>\n");
      out.write("        ");

            }
                if(request.getParameter("err")!=null){
        
      out.write("\n");
      out.write("                    <div class=\"panel-body\"> \n");
      out.write("                        <div class=\"alert alert-danger \">\n");
      out.write("                            <strong>All Fields Required.</strong>\n");
      out.write("                        </div>\n");
      out.write("                   </div>\n");
      out.write("        ");
            
                }
                if(request.getParameter("invalid_pass")!=null){
        
      out.write("\n");
      out.write("        <div class=\"panel-body\"> \n");
      out.write("                        <div class=\"alert alert-danger\">\n");
      out.write("                                <strong>Invalid PASSWORD</strong> Enter a correct Password.\n");
      out.write("                        </div>\n");
      out.write("                   </div>\n");
      out.write("                    ");

                    }
                
                if(request.getParameter("invalid_email")!=null){
                   
      out.write("\n");
      out.write("                  <div class=\"panel-body\"> \n");
      out.write("                        <div class=\"alert alert-warning\">\n");
      out.write("                                <strong>Invalid Email</strong> Enter a correct Email-id.\n");
      out.write("                        </div>\n");
      out.write("                   </div>\n");
      out.write("                   ");

                   }
                if(request.getParameter("login")!=null){
                   
      out.write("\n");
      out.write("                  <div class=\"panel-body\"> \n");
      out.write("                        <div class=\"alert alert-success\">\n");
      out.write("                                <strong>Sign-Up</strong> Successfull, Login to Continue.\n");
      out.write("                        </div>\n");
      out.write("                   </div>\n");
      out.write("                   ");

                   }
                
         
      out.write("\n");
      out.write("        \n");
      out.write("         \n");
      out.write("                                <form action=\"\" class=\"navbar-form w3-padding-28\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        \n");
      out.write("                                            <label>Search</label>\n");
      out.write("                                            <input type=\"search\" name=\"search\" id=\"search\" style=\"color:#9acfea;width:700px;\" placeholder=\"Search Anything Here...\" class=\"form-control\">\n");
      out.write("                                      \n");
      out.write("                                    </div>\n");
      out.write("                                </form>\n");
      out.write("                          \n");
      out.write("               <div class=\"row\">\n");
      out.write("                   \n");
      out.write("                    <table class=\"table table-responsive w3-card\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td><h2>Explore Your Questions</h2></td>\n");
      out.write("                            \n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td style=\"border:none\"><button class=\"button1\">hello</button> <button class=\"button1\">hello</button> <button class=\"button1\">hello</button> <button class=\"button1\">hello</button> <button class=\"button1\">hello</button> <button class=\"button1\">hello</button> <button class=\"button1\">hello</button>\n");
      out.write("                                <button class=\"button1\">hello</button> <a href=\"#\">More Tags..</a></td>\n");
      out.write("                            <td style=\"border:none\"><button class=\"button2\">Active</button><button class=\"button2\">Hot</button><button class=\"button2\">Week</button><button class=\"button2\">Month</button></td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"row w3-card\" id=\"main\">\n");
      out.write("                    \n");
      out.write("                        ");

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
                                            
      out.write("\n");
      out.write("                                         \n");
      out.write("                <div class=\"col-sm-12 col-sm-12\">\n");
      out.write("                    <div class=\"panel panel-info\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                            <h1><a href=\"answer.jsp?id=");
      out.print(rs.getString("qcode"));
      out.write('"');
      out.write('>');
      out.print(rs.getString("question"));
      out.write("</a></h1>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <label>Answer</label>:- ");
      out.print(rs.getString("answer"));
      out.write("<br>\n");
      out.write("                            <br><br>\n");
      out.write("                                \n");
      out.write("\n");
      out.write("                            \n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                            <button class=\"dislike\">\n");
      out.write("                                    <i class=\"fa fa-thumbs-o-down\" aria-hidden=\"true\"></i>\n");
      out.write("                            </button>\n");
      out.write("\n");
      out.write("                            <button class=\"like\">\n");
      out.write("                                    <i class=\"fa fa-thumbs-o-up\" aria-hidden=\"true\"></i>\n");
      out.write("                            </button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                            \n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("               \n");
      out.write("                      ");

                       } 
                             cn.close();
                                            }
                                            catch(Exception er){
                                                 out.print(er.getMessage());
                                            }
                      
                      
      out.write("\n");
      out.write("                     <div class=\"w3-padding-32\">\n");
      out.write("\t\t\t    <a style=\"margin-left:10px\" href=\"index.jsp?pg=");
      out.print(previous);
      out.write("\" id=\"aid\">Previous</a>\n");
      out.write("                            <a style=\"float:right;margin-right: 10px\" href=\"index.jsp?pg=");
      out.print(next);
      out.write("\">Next</a>\n");
      out.write("\t\t   </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            <!--Main Box End-->\n");
      out.write("            <div class=\"col-sm-3  w3-padding-32\">\n");
      out.write("                <div class=\"panel-body\"> \n");
      out.write("                    <div class=\"alert alert-info\">\n");
      out.write("                      <h2>Ask Your Questions</h2>  \n");
      out.write("                    </div>\n");
      out.write("                   \n");
      out.write("                \n");
      out.write("                    <form method=\"post\" action=\"user_question.jsp\">\n");
      out.write("                        <label>Subject</label><input class=\"form-control\" type=\"text\" name=\"tag\" required>\n");
      out.write("                        <label class=\"form-control-static\">Your Question</label><br>\n");
      out.write("                        <textarea class=\"form-control\" name=\"question\" cols=\"12\" rows=\"8\"></textarea><br>\n");
      out.write("                    <button class=\"btn btn btn-success\">Submit</button>\n");
      out.write("                    </form>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("        </div>              \n");
      out.write("        </div>\n");
      out.write("        <div class=\"row bg-warning \" style=\"margin-top:20px\">\n");
      out.write("            <div class=\"container-fluid\">    \n");
      out.write("                <div class=\"col-sm-6 w3-container w3-padding-32 \" id=\"contact\">\n");
      out.write("                    <h3 style=\"color:BLACK\">Contact</h3>\n");
      out.write("                    <p style=\"color:BLACK\">Lets get in touch and talk about your Queries.</p>\n");
      out.write("                    <form method=\"post\"  action=\"feedback.jsp\"  >\n");
      out.write("                      <input class=\"w3-input w3-border\" type=\"text\" placeholder=\"Name\" required name=\"name\">\n");
      out.write("                      <input class=\"w3-input w3-section w3-border\" type=\"text\" placeholder=\"Email\" required name=\"email\">\n");
      out.write("                      <input class=\"w3-input w3-section w3-border\" type=\"text\" placeholder=\"Subject\" required name=\"subject\">\n");
      out.write("                      <input class=\"w3-input w3-section w3-border\" type=\"text\" placeholder=\"Comment\" required name=\"comment\">\n");
      out.write("                      <button class=\"w3-button w3-black w3-section\"   type=\"submit\">Send Message</button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-6 w3-container w3-padding-32\" style=\"margin-top:100px\" >\n");
      out.write("                    <center><h2 style=\"color:black;font-family:'Comic Sans MS'\">STACKEXCHANGE</h2>\n");
      out.write("                    <h2 style=\"color:black;font-size:32px\">Contact Us</h2>\n");
      out.write("                    <h4  style=\"color:BLACK\"><i class=\"fa fa-inbox\" style=\"color:BLACK\"></i> info@stackoverflow.com</h4></center>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-12\">\n");
      out.write("                    <center>\n");
      out.write("                        <a href=\"#\" class=\"fa fa-facebook\"></a>\n");
      out.write("                        <a href=\"#\" class=\"fa fa-twitter\"></a>\n");
      out.write("                        <a href=\"#\" class=\"fa fa-google\"></a>\n");
      out.write("                        <a href=\"#\" class=\"fa fa-youtube\"></a>\n");
      out.write("                        <a href=\"#\" class=\"fa fa-instagram\"></a>\n");
      out.write("                        <a href=\"#\" class=\"fa fa-pinterest\"></a>\n");
      out.write("                    </center>\n");
      out.write("                </div>\n");
      out.write("            </div> \n");
      out.write("            <div class=\"row\" style=\"background-color:#000000\">\n");
      out.write("  \t\t<div class=\"col-sm-12\" style=\"height:50px\"><br><center><a href=\"#\" style=\"color:#FFFFFF\">Deepak @STACKOVERFLOW  ©  2020</a></center></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\t<!-- end footer -->  \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
