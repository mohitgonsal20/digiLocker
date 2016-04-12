<%-- 
    Document   : digilocker
    Created on : Oct 18, 2015, 6:02:24 PM
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
        <form action="../UploadServlet.do" method="post" enctype="multipart/form-data" name="form1" id="form1">
   <center>
   <table border="1">
       <tr>
           <td align="center" colspan="2"><b>File Upload</td>
       </tr>
       <tr>
           <td>
               Aadhar Card :</td><td> <input name="file" type="file" id="file">
           </td>
       </tr>
       <tr>
          <td>Driving License :</td>
          <td>
              <input name="file" type="file" id="file">
          </td>
        <tr>
           <td>
               Other :</td><td><input name="file" type="file" id="file">
           </td>
         </tr>
         <tr>
            <td align="center">
               <input type="submit" name="Submit" value="Submit files"/>
            </td>
         </tr>
    </table>
    <center>
 </form>
    </body>
</html>
