<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Product</title> 
    </head>
    <body>
        <jsp:include page="header.jsp"/>   
        <div class="small-container single-product">
            <img class="product_img" src="" alt="product"
            style="float: left; padding: 1% 4%;" width="45%" height="75%" id="ProductImg">
         <div style="padding-top: 8%">
         <h1 style="font-size: 72px; font-family: 'Righteous', cursive;"></h1>
         <h3 style="font-size: 38px; padding-top: 1%; color: #007214">$</h3>
         <a href="#" style=" text-decoration: none;"><button class="byton">Buy product</button></a>>
         </div>
         <div style=" padding-top: 12%; padding-left: 5%; padding-right: 4%;">
         <h2 style="font-size: 38px; padding-left: 4%;">Product description</h2>
         <hr>
         <p style ="font-size: 20px;"></p>
         <hr>
         </div>
        </div> 
    </body>
</html>