<%-- 
    Document   : data
    Created on : 5 June, 2021, 10:38:01 PM
    Author     : Lenovo
--%>
<%@page contentType="text/html" import="java.sql.*,java.util.*" pageEncoding="UTF-8"%>
 <%  
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
            code=code+"_"+sn;
            String fname=request.getParameter("fname");
            String lname=request.getParameter("lname");
            String email=request.getParameter("email");
            String pass=request.getParameter("pass");
           
            
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/stackoverflow","root","");
                Statement st=cn.createStatement();
                ResultSet rs=st.executeQuery("select MAX(sn) from users");
                    
                    if(rs.next()){
                        sn=rs.getInt(1);
                    }
                    sn++;
                    code=code+sn;
                    PreparedStatement ps=cn.prepareStatement("insert into users values(?,?,?,?,?,?)");
                    
                    ps.setInt(1, sn);
                    ps.setString(2,fname);
                    ps.setString(3,lname);
                    ps.setString(4,email);
                    ps.setString(5,pass);
                    ps.setString(6,code);
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
