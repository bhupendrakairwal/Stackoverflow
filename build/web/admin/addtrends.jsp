<%-- 
    Document   : addtrends
    Created on : 10 June, 2021, 10:05:09 AM
    Author     : Lenovo
--%>

<%@page contentType="text/html" import="java.sql.*,java.util.*" pageEncoding="UTF-8"%>

<%
    Cookie c[] = request.getCookies();
    String email=null;
    for(int i=0;i<c.length;i++){
       if(c[i].getName().equals("admin")){
           email=c[i].getValue();
           break;
        } 
        
    }
    if(email!=null && session.getAttribute(email)!=null){
        if(request.getParameter("question").trim().length()>0 && request.getParameter("answer").trim().length()>0){
            String question=request.getParameter("question");
            String answer=request.getParameter("answer");
            int sn=0;
            String code="";
             try {
                    /* TODO output your page here. You may use following sample code. */
                   Class.forName("com.mysql.jdbc.Driver");
                   Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stackoverflow","root","");
                   Statement st = cn.createStatement();
                   
                   ResultSet rs=st.executeQuery("select MAX(sn) from trends");
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
                   
                   PreparedStatement ps=cn.prepareStatement("insert into trends values(?,?,?,?,?)");
                   ps.setInt(1,sn);
                   ps.setString(2,question);
                   ps.setString(3,code);
                   ps.setString(4,answer);
                   ps.setInt(5,0);
         
                   
                   ps.execute();
                   
                   response.sendRedirect("dashboard.jsp?question=1");
                   
                   
                   
                   
                   
                   cn.close();
             }
             catch(Exception e){
                 out.println(e.getMessage());
             }
        }
        else{
            response.sendRedirect("dashboard.jsp?err=1");
        }
        
    }
    else{
        response.sendRedirect("index.jsp");
    }
 %>
