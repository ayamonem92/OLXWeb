<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="css/style.css" />
        <%
            String e = request.getParameter("e");
            String msg = "";
            if (e != null && e.equals("true")) {
                msg = "Invalid username or Password";
            }
        %>
        <script type="text/javascript" src="js/myscript.js" ></script>
    </head>
    <body >
    <center>
        <form id="form1">
            <table border="1">
                <tbody>
                    <tr>
                        <td>Username</td>
                        <td><input type="text" name="name" value="" size="40"
                                   id="username" /></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="password" value="" size="40"
                                   id="pass"/></td>
                    </tr>
                </tbody>
            </table>
           
                
            <!--<input type="submit" value="Login" />-->
           
        </form>
         <button onclick="checkUsername()" >Login</button>
          <br>
            <%= msg %>
        <a href="register.jsp">Register</a>
    </center>
</body>
</html>