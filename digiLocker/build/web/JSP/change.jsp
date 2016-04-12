<%-- 
    Document   : change
    Created on : Oct 22, 2015, 10:09:46 PM
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
        
        <form method="post" action="../ChangePassword.do">
        <table>
            <tr>
                <td>
                    Current Password
                </td>
                <td ><input type="text" name="cPsw">
                    
                </td>
            </tr>
             <tr>
                <td>
                    New password
                </td>
                 <td ><input type="text" name="nPsw">
                    
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
