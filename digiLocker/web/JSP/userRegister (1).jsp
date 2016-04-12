
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
     
<style type="text/css">
    wrapper {
        width:450px;
        margin:0 auto;
        font-family:Verdana, sans-serif;
    }
    legend {
        color:#66a143;
        font-size:16px;
        padding:0 10px;
        background:#fff;
        -moz-border-radius:4px;
        box-shadow: 0 1px 5px rgba(4, 129, 177, 0.5);
        padding:5px 10px;
        text-transform:uppercase;
        font-family:Helvetica, sans-serif;
        font-weight:bold;
    }
    fieldset {
        border-radius:4px;
        background: #fff; 
        background: -moz-linear-gradient(#fff, #f9fdff);
        background: -o-linear-gradient(#fff, #f9fdff);
        background: -webkit-gradient(linear, 0% 0%, 0% 100%, from(#fff), to(#f9fdff)); 
        background: -webkit-linear-gradient(#fff, #f9fdff);
        padding:20px;
        border-color:rgba(4, 129, 177, 0.4);
    }
    input,
    textarea {
        color: #373737;
        background: #fff;
        border: 1px solid #CCCCCC;
        color: #aaa;
        font-size: 14px;
        line-height: 1.2em;
        margin-bottom:15px;

        -moz-border-radius:4px;
        -webkit-border-radius:4px;
        border-radius:4px;
        box-shadow: 0 1px 2px rgba(0, 0, 0, 0.1) inset, 0 1px 0 rgba(255, 255, 255, 0.2);
    }
    input[type="text"],
    input[type="password"]{
        padding: 8px 6px;
        height: 22px;
        width:280px;
    }
    input[type="text"]:focus,
    input[type="password"]:focus {
        background:#f5fcfe;
        text-indent: 0;
        z-index: 1;
        color: #373737;
        -webkit-transition-duration: 400ms;
        -webkit-transition-property: width, background;
        -webkit-transition-timing-function: ease;
        -moz-transition-duration: 400ms;
        -moz-transition-property: width, background;
        -moz-transition-timing-function: ease;
        -o-transition-duration: 400ms;
        -o-transition-property: width, background;
        -o-transition-timing-function: ease;
        width: 380px;
        
        border-color:#ccc;
        box-shadow:0 0 5px rgba(4, 129, 177, 0.5);
        opacity:0.6;
    }
    input[type="submit"]{
        background: #222;
        border: none;
        text-shadow: 0 -1px 0 rgba(0,0,0,0.3);
        text-transform:uppercase;
        color: #eee;
        cursor: pointer;
        font-size: 15px;
        margin: 5px 0;
        padding: 5px 22px;
        -moz-border-radius: 4px;
        border-radius: 4px;
        -webkit-border-radius:4px;
        -webkit-box-shadow: 0px 1px 2px rgba(0,0,0,0.3);
        -moz-box-shadow: 0px 1px 2px rgba(0,0,0,0.3);
        box-shadow: 0px 1px 2px rgba(0,0,0,0.3);
    }
    textarea {
        padding:3px;
        width:96%;
        height:100px;
    }
    textarea:focus {
        background:#ebf8fd;
        text-indent: 0;
        z-index: 1;
        color: #373737;
        opacity:0.6;
        box-shadow:0 0 5px rgba(4, 129, 177, 0.5);
        border-color:#ccc;
    }
    .small {
        line-height:14px;
        font-size:12px;
        color:#999898;
        margin-bottom:3px;
    }
</style>




               <script src="http://code.jquery.com/jquery-1.7.min.js"></script>
               <script src="script.js"></script>
               <script type="text/javascript">
  function Validate()
    {
  
    if (document.ContactForm.firstName === "")
    {
        alert("Please enter your First Name.");
        document.ContactForm.firstName.focus();
        return false;
    }
    

       if (document.ContactForm.lastName === "")
    {
        alert("Please enter your Last name.");
        document.ContactForm.lname.focus();
        return false;
    }

     if(document.ContactForm.digiid === "")
     {
         alert("Please enter your name.");
        document.ContactForm.digiid.focus();
        return false;

      }


    if (document.ContactForm.Email === "")
    {
        alert("Please enter a valid e-mail address.");
        document.ContactForm.Email.focus();
        return false;
    }
   
    
    if (document.ContactForm.UserName==="")
    {
        alert("Please enter your User Name.");
        document.ContactForm.UserName.focus();
        return false;
    }


    if (document.ContactForm.pass.value === "")
    {
        alert("Please enter your Password.");
        document.ContactForm.pass.focus();
        return false;
    }

     var letters = /^[A-Za-z]+$/;  
         var did = /^\d{5}$/; 
         var eid = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
      if(!document.ContactForm.firstName.value.match(letters))  
      {   
      alert('\FirstName Sholud Conatin Only Alphabets');  
      return false;  
      } 
      
       if(!document.ContactForm.lastName.value.match(letters))  
      {   
      alert('LastName Sholud Conatin Only Alphabets');  
      return false;  
      }
      
      
   
      if(!document.ContactForm.digiid.value.match(did)) 
      {
        alert("Enter 5 digits DigiId");  
        return false;  
        }
        
           if(!document.ContactForm.Email.value.match(eid)) 
      {
        alert("Enter valid email id");  
        return false;  
        }  
} 
</script>
            
            
            
</head>
         
    <body background="/ePention/images/bg-body.jpg">  
<ul>
    <li>
        <hr>
        <span>
            <h3> <a href="/ePention/index_1.html" style="color:#000000">home</a>
        </span>
            -->
            <span>
                 <a href="register.html" style="color: #000000">sign-up</a></h3>
            </span>
            <hr>
    </li>
        <form   name="ContactForm"  action="../UserRegisterServlet.do" onsubmit="return(Validate())">
           <div id="wrapper">
        
            <fieldset>
                <legend>Sign up!</legend>
		
	
		
               
                    <div>
                        
                        <input type="text" name="firstName"  placeholder="First Name"/>
                    </div>
                      <div>
                          
                    <input type="text" name="lastName" placeholder="Last Name"/>
                         </div>
                   <div>
                    <input type="text" name="digiid" placeholder="DiGilocker code"/>
                </div>
                       <div>
                <a href="/ePention/JSP/digilocker.jsp" style="color:#66a143; display: block; margin-bottom:4%;">GENERATE DIGILOCKER CODE (if you dont have)</a>
                </div>
                        
                   
                    
                   <div>
                    <input type="text" name="UserName" placeholder="username"/>
                </div>
                <div>
                    <input type="password" name="Password" placeholder="Password"/>
                </div>
                     <div>
                    <input type="text" name="Email" placeholder="Email"/>
                </div>
             
                    <tr>
                        <td><input type="submit" value="Register" name="s" /></td>
                        <td><input type="reset" value="Reset" name="s" /></td>
                    </tr>
                </tbody>
            </table>
            
   
        </form>
    </body>
</html>
