<%-- 
    Document   : user_question
    Created on : 31 May, 2020, 8:56:13 AM
    Author     : Lenovo
--%>

<%@page contentType="text/html" import="java.sql.*,java.util.*, javax.servlet.*" pageEncoding="UTF-8"%>
 <%  
            int sn=0;
            String qcode="";
            LinkedList l =new LinkedList();
            for(char c='A';c<='Z';c++){
                l.add(c+"");
            }
            for(char c='a';c<='z';c++){
                l.add(c+"");
            }
            for(int i=1;i<=9;i++){
                l.add(new Integer(i));
            }
            Collections.shuffle(l);
            for(int i=1;i<6;i++){
                qcode=qcode+l.get(i);
                
            }
            qcode=qcode+"_";
            String question=request.getParameter("question");
            String tag=request.getParameter("tag");
            String tcode="";
            String email="";
            long millis=System.currentTimeMillis();  
            java.sql.Date date=new java.sql.Date(millis);
            
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/stackoverflow","root","");
                Statement st=cn.createStatement();
                ResultSet rs1=st.executeQuery("select * from tags where tname='"+tag+"'");
                    if(rs1.next()){
                        tcode=rs1.getString(4);
                    }
                ResultSet rs=st.executeQuery("select MAX(sn) from questions");
                    
                    if(rs.next()){
                        sn=rs.getInt(1);
                    }
                    sn++;
                    qcode=qcode+sn;
                    PreparedStatement ps=cn.prepareStatement("insert into questions values(?,?,?,?,?,?,?)");
                    
                    ps.setInt(1, sn);
                    ps.setString(2,question);
                    ps.setString(3,qcode);
                    ps.setString(4,tcode);
                    ps.setString(5,email);
                    ps.setDate(6,date);
                    ps.setInt(7,0);
                    
                    ps.execute();
                    response.sendRedirect("index.jsp?login=1");
                    cn.close();
            }
            catch(ClassNotFoundException e){
                    out.println(e.getMessage());
                }
                catch(SQLException e){
                    out.println(e.getMessage());
                }
            

            
        %>