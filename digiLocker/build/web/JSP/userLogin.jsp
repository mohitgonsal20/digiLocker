<%-- 
    Document   : userLogin
    Created on : Oct 22, 2015, 1:05:17 PM
    Author     : Mohit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="post" action="../UserLoginServlet.do">
        <table>
            <tr>
                <td>
                    UserName
                </td>
                <td ><input type="text" name="UserName_u">
                    
                </td>
            </tr>
             <tr>
                <td>
                    password
                </td>
                 <td ><input type="text" name="Password_u">
                    
                </td>
            </tr>
            <td>
                <input type="submit" name="submit">
                <input type="reset">
            </td>
        </table>
    </form>
        
        <a href="forget.jsp">forget password</a>
        
    </body>
</html>
