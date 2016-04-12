<%-- 
    Document   : DisplayImg
    Created on : Oct 20, 2015, 11:29:41 PM
    Author     : Mohit
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Images"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Display Images</h1>
        
        <img src="./${images.id}/${images.one}" alt="Image not found ">
        
        <br>
        <img src="./${images.id}/${images.two}" alt="Image not found ">
        
        <br>
        <img src="./${images.id}/${images.three}" alt="Image not found ">
        
        
        
    </body>
</html>
