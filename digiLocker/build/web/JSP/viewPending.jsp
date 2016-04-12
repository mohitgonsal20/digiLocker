<%-- 
    Document   : viewPending
    Created on : Oct 20, 2015, 9:58:20 PM
    Author     : Mohit
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        Following Request are pending :
        
        <table>
            <c:forEach var="user1" items="${pUsers}"  >
                
                <form action="./UpdateServlet.do?did1=${user1.digiid}" method="post">
            <tr><td>Customer First Name is:</td><td><c:out value="${user1.firstName}" /> </td> </tr>
            <tr><td>Customer Last Name  is:</td><td><c:out value="${user1.lastName}" /></td> </tr>
            <tr><td>DigiLocker ID:</td><td><a href="./DisplayServlet.do?did1=${user1.digiid}"><c:out value="${user1.digiid}" /></a></td> </tr>
            <tr><td><input type="radio" name="status1" value="approved">Approve </td><td><input type="radio" name="status1" value="rejected">Reject</td></tr>
            <tr><td><input type="submit" name="status1"></td></tr>
            <tr><td>---------------</td></tr>
            <tr></tr>
            </form>
        </c:forEach>
          
</table>
        
        
        
    </body>
</html>
