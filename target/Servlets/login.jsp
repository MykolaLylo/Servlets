<%@ page contentType = "text/html; charset=UTF-8" language = "java" %>
<html>
<head>
    <title>login</title>
    <link rel = "stylesheet" href = "./css/form.css">
</head>
<body>
 <jsp:include page ="header.jsp"/>
   <link href='https://fonts.googleapis.com/css?family=Ubuntu:500' rel='stylesheet' type='text/css'>

   <div class="login">
     <div class="login-header">
       <h1>Login</h1>
     </div>
     <form action = "login" method = "post">
     <div class="login-form">
       <h3>Email:</h3>
       <input type="text" name = "email" placeholder="Email"/><br>
       <h3>Password:</h3>
       <input type="password" name = "password" placeholder="Password"/>
       <br>
       <%
        Object error = request.getParameter("error");
        if(error != null){
            out.print("<div class=\"try-again\">Incorrect value.Try again?</div>");
        }
       %>
       <input type="submit" value="Login" class="login-button"/>
       </form>
       <br>
       <a href = "register.jsp" class="sign-up">Register!</a>
       <br>
       <h6 class="no-access">Can't access your account?</h6>
     </div>
   </div>
</body>
</html>