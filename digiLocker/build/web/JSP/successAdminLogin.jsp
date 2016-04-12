<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : successAdminLogin
    Created on : Oct 7, 2015, 11:18:08 PM
    Author     : Mohit
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="model.Admin"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Success Admin Login</title>
    </head>
    <body>
        Welcome ${admin.firstName}<br>
       
        <a href="/ePention/PendingSearch.do">List pending requests</a> <br>
        
        <br>
        <a href="JSP/change.jsp">change password</a>
        
            
            
            
        <br />
    </body>
</html>
