<%-- 
    Document   : feedback.jsp
    Created on : 4 June, 2021, 8:17:50 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" import="java.sql.*,java.util.*" pageEncoding="UTF-8"%>
<%
                        String name=request.getParameter("name");
                        String email=request.getParameter("email");
                        String subject=request.getParameter("subject");
                        String comment=request.getParameter("comment");
                        int sn=0;
                        String code="";
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
                            code=code+l.get(i);

                        }
                        code=code+"_";
                        try{
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/stackoverflow","root","");
                            Statement st=cn.createStatement();
                            ResultSet rs=st.executeQuery("select MAX(sn) from feedback");
                            if(rs.next()){
                                sn=rs.getInt(1);
                            }
                            sn++;
                            code=code+sn;
                            PreparedStatement ps=cn.prepareStatement("insert into feedback values(?,?,?,?,?,?,?)");

                            ps.setInt(1, sn);
                            ps.setString(2,name);
                            ps.setString(3,email);
                            ps.setString(4,subject);
                            ps.setString(5,comment);
                            ps.setString(6,code);
                            ps.setInt(7,0);
                            ps.execute();   
                            response.sendRedirect("index.jsp?id=1");
                            cn.close();
                        }
                        catch(ClassNotFoundException e){
                                out.println(e.getMessage());
                            }
                        catch(SQLException e){
                            out.println(e.getMessage());
                        }
%>
