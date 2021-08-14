<%-- 
    Document   : search
    Created on : 27 May, 2021, 7:52:16 AM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        </style>
        <script>
     $(document).ready(function(){
        $("search").keyup(function(){
           var id=$(this).attr("name");
           $.post(
                   "search_record.jsp",{id:id},function(data){
                          $("#search").html(data);
                          var search=data;
                          
                   });
          
        }); 
     });
</script>
    </head>
    <body>
        <form action="" class="navbar-form">
                                    <div class="form-group">
                                        <div class="input-group">
                                            <input type="search" name="search" id="search" style="width:300px" placeholder="Search Anything Here..." class="form-control">
                                            <span class="input-group-addon"><span class="glyphicon glyphicon-search"></span></span>
                                        </div>
                                    </div>
                                </form>
    </body>
</html>
