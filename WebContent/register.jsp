<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Insert title here</title>
</head>

    <body>
    <center>
        <form action="RegisterAction">
            <table border="1">
                <tbody>
                    <tr>
                        <td>Username</td>
                        <td><input type="text" name="name" value="" size="40" /></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="password" value="" size="40" /></td>
                    </tr>
                    <tr>
                        <td>Confirm Password</td>
                        <td><input type="password" name="password" value="" size="40" /></td>
                    </tr>
                    <tr>
                        <td>phone</td>
                        <td><input type="number" name="phone" value="" size="20" /></td>
                    </tr>
                    <tr>
                        <td>Email</td>
                        <td><input type="email" name="email" value="" size="40" /></td>
                    </tr>
                     <tr>
                        <td>City</td>
                        <td><input type="text" name="city" value="" size="40" /></td>
                    </tr>
                       <tr>
                        <td>Address</td>
                        <td><input type="text" name="address" value="" size="40" /></td>
                    </tr>
                </tbody>
            </table>
            <input type="submit" value="Register" />
            <br>

        </form>
    </center>
</body>
</html>
