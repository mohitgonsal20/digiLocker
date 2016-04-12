<%-- 
    Document   : forget
    Created on : Oct 22, 2015, 11:33:28 PM
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
        <form method="post" action="../SendEmail.do">
        <table>
            <tr>
                <td>
                   Enter UserName
                </td>
                <td ><input type="text" name="UserName_u">
                    
                </td>
            </tr>
             <tr>
                <td>
                    Enter Email
                </td>
                 <td ><input type="text" name="email_u">
                    
                </td>
            </tr>
            <td>
                <input type="submit" name="submit">
                <input type="reset">
            </td>
        </table>
    </form>
    </body>
</html>
