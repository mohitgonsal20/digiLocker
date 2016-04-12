<%-- 
    Document   : adminLogin
    Created on : Oct 7, 2015, 10:44:10 PM
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
        <div>
        <form method="post" action="../AdminLoginServlet.do">
        <table>
            <tr>
                <td>
                    UserName
                </td>
                <td ><input type="text" name="UserName">
                    
                </td>
            </tr>
             <tr>
                <td>
                    password
                </td>
                 <td ><input type="text" name="Password">
                    
                </td>
            </tr>
            <td>
                <input type="submit" name="submit">
                <input type="reset">
            </td>
        </table>
    </form>
        </div>
    </body>
</html>
