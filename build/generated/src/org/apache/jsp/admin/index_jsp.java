package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("\t<meta content=\"\" name=\"description\" />\n");
      out.write("    <meta content=\"webthemez\" name=\"author\" />\n");
      out.write("    <title>Stackoverflow-Admin Panel</title>\n");
      out.write("    <!-- Bootstrap Styles-->\n");
      out.write("    <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" />\n");
      out.write("    <!-- FontAwesome Styles-->\n");
      out.write("    <link href=\"assets/css/font-awesome.css\" rel=\"stylesheet\" />\n");
      out.write("    <!-- Morris Chart Styles-->\n");
      out.write("    <link href=\"assets/js/morris/morris-0.4.3.min.css\" rel=\"stylesheet\" />\n");
      out.write("    <!-- Custom Styles-->\n");
      out.write("    <link href=\"assets/css/custom-styles.css\" rel=\"stylesheet\" />\n");
      out.write("    <!-- Google Fonts-->\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/js/Lightweight-Chart/cssCharts.css\"> \n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    ");

    if(request.getParameter("err")!=null){
                    out.print ("<h3 style='color:blue'>All Field Requried</h3>");
                }
                if(request.getParameter("invalid_pass")!=null){
                    out.print ("<h3 style='color:red'>Invalid Password</h3>");
                }
                if(request.getParameter("invalid_email")!=null){
                    out.print ("<h3 style='color:red'>Invalid Email-ID</h3>");
                }
                if(request.getParameter("success")!=null){
                    out.print ("<h3 style='color:green'>Registration Completed<h3>");
                }
                
      Cookie c[]=request.getCookies();
            String email=null;
            for(int i=1;i<c.length;i++){
                if(c[i].getName().equals("admin")){
                    email=c[i].getValue();
                    break;
                }
            }
            
            if(email !=null && session.getAttribute(email) !=null){
                response.sendRedirect("dashboard.jsp");
            }
            else{
                    String s="";
                    if(email!=null){
                        s=email;
                    }
                
                
      out.write("\n");
      out.write("    <div id=\"wrapper\">\n");
      out.write("        <nav class=\"navbar navbar-default top-navbar\" role=\"navigation\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".sidebar-collapse\">\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("                <a class=\"navbar-brand\" href=\"index.html\"><strong>STACKOVERFLOW</strong></a>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t<div id=\"sideNav\" href=\"\">\n");
      out.write("\t\t<i class=\"fa fa-bars icon\"></i> \n");
      out.write("\t\t</div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <ul class=\"nav navbar-top-links navbar-right\">\n");
      out.write("                \n");
      out.write("                </li>\n");
      out.write("                <!-- /.dropdown -->\n");
      out.write("                <li class=\"dropdown\">\n");
      out.write("                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\" aria-expanded=\"false\">\n");
      out.write("                        <i class=\"fa fa-user fa-fw\"></i> <i class=\"fa fa-caret-down\"></i>\n");
      out.write("                    </a>\n");
      out.write("                    <ul class=\"dropdown-menu dropdown-user\">\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-user fa-fw\"></i>Sign In</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-gear fa-fw\"></i>Sign Up</a>\n");
      out.write("                        </li>\n");
      out.write("                        \n");
      out.write("                    </ul>\n");
      out.write("                    <!-- /.dropdown-user -->\n");
      out.write("                </li>\n");
      out.write("                <!-- /.dropdown -->\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("        <!--/. NAV TOP  -->\n");
      out.write("        <nav class=\"navbar-default navbar-side\" role=\"navigation\">\n");
      out.write("            <div class=\"sidebar-collapse\">\n");
      out.write("                <ul class=\"nav\" id=\"main-menu\">\n");
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"active-menu\" href=\"dashboard.html\"><i class=\"fa fa-dashboard\"></i> Dashboard</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"ui-elements.html\"><i class=\"fa fa-desktop\"></i> UI Elements</a>\n");
      out.write("                    </li> \n");
      out.write("\t\t\t\t\t \n");
      out.write("\t\t\t\t\t <li>\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-sitemap\"></i> Charts<span class=\"fa arrow\"></span></a>\n");
      out.write("                        <ul class=\"nav nav-second-level\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"chart.html\">Charts JS</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"morris-chart.html\">Morris Chart</a>\n");
      out.write("                            </li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li>\t\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"tab-panel.html\"><i class=\"fa fa-qrcode\"></i> Tabs & Panels</a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"table.html\"><i class=\"fa fa-table\"></i> Responsive Tables</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"form.html\"><i class=\"fa fa-edit\"></i> Forms </a>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-sitemap\"></i> Multi-Level Dropdown<span class=\"fa arrow\"></span></a>\n");
      out.write("                        <ul class=\"nav nav-second-level\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">Second Level Link</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">Second Level Link</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">Second Level Link<span class=\"fa arrow\"></span></a>\n");
      out.write("                                <ul class=\"nav nav-third-level\">\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#\">Third Level Link</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#\">Third Level Link</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#\">Third Level Link</a>\n");
      out.write("                                    </li>\n");
      out.write("\n");
      out.write("                                </ul>\n");
      out.write("\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"empty.html\"><i class=\"fa fa-fw fa-file\"></i> Empty Page</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </nav>\n");
      out.write("        <!-- /. NAV SIDE  -->\n");
      out.write("      \n");
      out.write("\t\t<div id=\"page-wrapper\">\n");
      out.write("\t\t  <div class=\"header\"> \n");
      out.write("                        <h1 class=\"page-header\">\n");
      out.write("                            Login <small>Welcome User</small>\n");
      out.write("                        </h1>\n");
      out.write("\t\t\t\t\t\t<ol class=\"breadcrumb\">\n");
      out.write("                                                <li><a href=\"#\">Admin</a></li>\n");
      out.write("                                                <li class=\"active\">Login</li>\n");
      out.write("\t\t\t\t\t</ol> \n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("            <div id=\"page-inner\">\n");
      out.write("\n");
      out.write("                <!-- /. ROW  -->\n");
      out.write("\t\n");
      out.write("                <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-8 col-xs-12\">  \n");
      out.write("                            <div class=\"panel panel-default chartJs\">\n");
      out.write("                                <div class=\"panel-heading\">\n");
      out.write("                                    <div class=\"card-title\">\n");
      out.write("                                        <div class=\"title\">LOGIN</div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                               \n");
      out.write("                                <div class=\"panel-body\">\n");
      out.write("                                    <form class=\"form-horizontal\" method=\"post\" action=\"check.jsp\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label for=\"inputEmail3\" class=\"col-sm-2 control-label\">Email</label>\n");
      out.write("                                            <div class=\"col-sm-10\">\n");
      out.write("                                                <input type=\"email\" class=\"form-control\" name=\"email\" placeholder=\"Email\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label for=\"inputPassword3\" class=\"col-sm-2 control-label\">Password</label>\n");
      out.write("                                            <div class=\"col-sm-10\">\n");
      out.write("                                                <input type=\"password\" class=\"form-control\" name=\"pass\" placeholder=\"Password\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("                                              <div class=\"checkbox3 checkbox-round checkbox-check checkbox-light\">\n");
      out.write("                                                <input type=\"checkbox\" id=\"checkbox-10\">\n");
      out.write("                                                <label for=\"checkbox-10\">\n");
      out.write("                                                  Remember me\n");
      out.write("                                                </label>\n");
      out.write("                                              </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("                                                <button type=\"submit\" class=\"btn btn-default\">Sign in</button>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                             \n");
      out.write("                        \n");
      out.write("\t   \n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("                \n");
      out.write("\t\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t\t\t<footer><p>All right reserved. Template by: <a href=\"http://webthemez.com\">WebThemez.com</a></p>\n");
      out.write("\t\t\t\t\n");
      out.write("        \n");
      out.write("\t\t\t\t</footer>\n");
      out.write("            </div>\n");
      out.write("            <!-- /. PAGE INNER  -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /. PAGE WRAPPER  -->\n");
      out.write("    </div>\n");
      out.write("    <!-- /. WRAPPER  -->\n");
      out.write("    <!-- JS Scripts-->\n");
      out.write("    <!-- jQuery Js -->\n");
      out.write("    <script src=\"assets/js/jquery-1.10.2.js\"></script>\n");
      out.write("    <!-- Bootstrap Js -->\n");
      out.write("    <script src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("\t \n");
      out.write("    <!-- Metis Menu Js -->\n");
      out.write("    <script src=\"assets/js/jquery.metisMenu.js\"></script>\n");
      out.write("    <!-- Morris Chart Js -->\n");
      out.write("    <script src=\"assets/js/morris/raphael-2.1.0.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/morris/morris.js\"></script>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t<script src=\"assets/js/easypiechart.js\"></script>\n");
      out.write("\t<script src=\"assets/js/easypiechart-data.js\"></script>\n");
      out.write("\t\n");
      out.write("\t <script src=\"assets/js/Lightweight-Chart/jquery.chart.js\"></script>\n");
      out.write("\t\n");
      out.write("    <!-- Custom Js -->\n");
      out.write("    <script src=\"assets/js/custom-scripts.js\"></script>\n");
      out.write("\n");
      out.write("      \n");
      out.write("    <!-- Chart Js -->\n");
      out.write("    <script type=\"text/javascript\" src=\"assets/js/Chart.min.js\"></script>  \n");
      out.write("    <script type=\"text/javascript\" src=\"assets/js/chartjs.js\"></script> \n");
      out.write("\n");
      out.write("</body>\n");
      out.write("                ");

                    }

        

      out.write("\n");
      out.write("</html>");
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
