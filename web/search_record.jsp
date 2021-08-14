<%-- 
    Document   : search_record
    Created on : 27 May, 2021, 8:10:35 AM
    Author     : Lenovo
--%>


    <%@page contentType="text/html" import="java.sql.*" pageEncoding="UTF-8"%>
<%  String search = request.getParameter("id");
   
                   try{
                     
                   Class.forName("com.mysql.jdbc.Driver");
                   Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stackoverflow","root","");
                   Statement st = cn.createStatement();
                   String sql="select * from trends where question LIKE '"+search+"%' OR question LIKE '%"+search+"%' OR question LIKE '%"+search+"' ";
                   String rec[] = search.split(" ");
                   for(int i=0;i<rec.length;i++){
                       String rt = rec[i];
                       sql = sql+"OR question LIKE '"+rt+"%' OR question LIKE '%"+rt+"%' OR question LIKE '%"+rt+"' ";
                   }
                  // sql = sql+"order by sn desc limit 0,5";
                   
                   ResultSet rs = st.executeQuery(sql); 
                   while(rs.next()){
                      %>
                      <div class="container-fluid">
                          <table class="table">
                              <tr>
                                  <td>
                                      <a href="answer.jsp?id='<%=rs.getString("qcode")%>'">
                                      <%
                                       out.println("<br>"+rs.getString("question"));   
                                      %>
                                      </a>
                                  </td>
                              </tr>
                          </table>
                      </div>
                      <%
                   }
                   cn.close();
                   
                   
                 }
                 catch(ClassNotFoundException e){
                     out.println(e.getMessage());
                     
                 }
                 catch(SQLException e){ 
                     out.println(e.getMessage());
                     
                 }
          
%>