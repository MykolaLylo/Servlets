<%@ page contentType="text/html;charset = UTF-8" language="java" %>
<html>
<head>
    <title>journal_shop</title>

 <%-- Bootstrap --%>
   <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">

   <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-u1OknCvxWvY5kfmNBILK2hRnQC3Pr17a+RTT6rIHI7NnikvbZlHgTPOOmMi466C8" crossorigin="anonymous"></script>

   <script src="https://kit.fontawesome.com/ced9387d80.js" crossorigin="anonymous"></script>
</head>

<body>
     <header class="p-3 text-bg-dark">
            <div class="container">
              <div class="d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start">
                <a href="index.jsp" class="d-flex align-items-center mb-2 mb-lg-0 text-white text-decoration-none">
                  <svg class="bi me-2" width="40" height="32" role="img" aria-label="Bootstrap"><use xlink:href="#bootstrap"/></svg>
                </a>

                <ul class="nav col-12 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0">
                  <li><a href="index.jsp" class="nav-link px-2 text-secondary">Home</a></li>
                  <li><a href="#" class="nav-link px-2 text-white">Bucket</a></li>
                  <li><a href="create_product.jsp" class="nav-link px-2 text-white">Create product</a></li>
                  <li><a href="#" class="nav-link px-2 text-white">Contacts</a></li>
                </ul>

                <form class="col-12 col-lg-auto mb-3 mb-lg-0 me-lg-3" role="search">
                  <input type="search" class="form-control form-control-dark text-bg-dark" placeholder="Search..." aria-label="Search">
                </form>

                <div class="text-end">

                <%
                 String name = (String) session.getAttribute("userName");
                 %>
                 <span style = "display: <%= name == null ? "inline" : "none"%>">
                  <button type="button" class="btn btn-outline-light me-2">
                  <a href="login.jsp">Login</a>
                  </button>
                  <button type="button" class="btn btn-warning">
                  <a href="register.jsp">Register</a>
                  </button>
                </span>
                <button style = "display: <%= name != null ? "inline" : "none"%>" type = "button" class = "btn btn-warning">
                   <a href = "logout">Logout</a>
                </button>
                </div>
              </div>
            </div>
          </header>

</body>
</html>
