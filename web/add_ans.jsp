<%-- 
    Document   : add_ans.jsp
    Created on : 2 June, 2021, 10:38:23 PM
    Author     : Lenovo
--%>

<%@page import="java.util.Collections"%>
<%@page import="java.util.LinkedList"%>
<%@page contentType="text/html" import="java.sql.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    Cookie c[] = request.getCookies();
    String email=null;
    for(int i=0;i<c.length;i++){
       if(c[i].getName().equals("user")){
           email=c[i].getValue();
           break;
        } 
    }
    if(email!=null && session.getAttribute(email)!=null){
        if(request.getParameter("question").trim().length()>0 && request.getParameter("tag").trim().length()>0 ){
            String question=request.getParameter("question");
            String tcode=request.getParameter("tag");
            
            int sn=0;
            String code="";
             try {
                    /* TODO output your page here. You may use following sample code. */
                   Class.forName("com.mysql.jdbc.Driver");
                   Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stackoverflow","root","");
                   Statement st = cn.createStatement();
                   
                   ResultSet rs=st.executeQuery("select MAX(sn) from questions");
                   if(rs.next()){
                       sn=rs.getInt(1);
                   }
                   sn++;
                   
                   LinkedList l = new LinkedList();
                   for(char i='a';i<='z';i++){
                       l.add(""+i);
                   }
                   
                   for(char i='A';i<='Z';i++){
                       l.add(""+i);
                   }
                   for(int i=0;i<=9;i++){
                       l.add(new Integer(i));
                   }
                   
                   Collections.shuffle(l);
                   for(int i=0;i<=8;i++){
                       code=code+l.get(i);
                   }
                   code=code+sn;
                   
                   PreparedStatement ps=cn.prepareStatement("insert into questions values(?,?,?,?,?,?,?)");
                   ps.setInt(1,sn);
                   
                   ps.setString(4,code);
                   
                   ps.execute();
                   
                   response.sendRedirect("add_question.jsp?id="+code+"");
                   
                   
                   
                   
                   
                   cn.close();
             }
             catch(Exception e){
                 out.println(e.getMessage());
             }
        }
        else{
            response.sendRedirect("dashboard.jsp?tag_err=1");
        }
        
    }
    else{
        response.sendRedirect("index.jsp");
    }
 %>

