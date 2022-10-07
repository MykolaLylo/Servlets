<%@ page contentType = "text/html; charset=UTF-8" language="java" %>
<html>
<head>
    <title>journal_shop</title>
     <link rel = "stylesheet" href = "./css/form.css">
</head>
<body>
<script src = "./js/register.js"></script>
 <jsp:include page ="header.jsp"/>
   <link href='https://fonts.googleapis.com/css?family=Ubuntu:500' rel='stylesheet' type='text/css'>

      <div class="login">
        <div class="login-header">
          <h1>Login</h1>
        </div>
        <form action = "register" method = "post" onsubmit = "handleRegister(event)">
        <div class="login-form">
          <h3>Name:</h3>
          <input type="text" name = "name" placeholder="Name"/><br>
          <h3>Surname:</h3>
          <input type="text" name = "surname" placeholder="Surname"/><br>
          <h3>Email:</h3>
          <input type="text" name = "email" id = "email" placeholder="Email"/><br>
          <h3>Password:</h3>
          <input type="password"  name = "password" placeholder="Password"/>
          <br>
          <h3>Confirm password:</h3>
           <input type="password" id = "confirmation" name = "confirmation" placeholder="Confirm password"/>
           <br>
           <div id = "massage" class="try-again"></div>

          <input type="submit" value="register" class="login-button"/>
          </form>
          <br>
          <a href = "login.jsp" class="sign-up">login!</a>
          <br>
          <h6 class="no-access">Can't access your account?</h6>
        </div>
      </div>

</body>
</html>