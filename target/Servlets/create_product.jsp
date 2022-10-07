<%@ page contentType = "text/html; charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Create product</title>
        <link rel = "stylesheet" href = "./css/form.css">
    </head>
    <body>
        <jsp:include page="header.jsp"/>

        <h2 style="text-align: center;">create new product</h2>

        <div style="margin: 16px;">
            <form  onsubmit = "saveProduct(event)">
                <div class="mb-3">
                    <label for="product_name" class="form-label">Product name</label>
                    <input type="text" name="product_name" class="form-control" id="product_name" placeholder="Some product"/>
                  </div>
                  <div class="mb-3">
                    <label for="description" class="form-label">Description</label>
                    <textarea class="form-control" name="description" id="description" rows="3"></textarea>
                  </div>
                  <div class="mb-3">
                    <label for="price" class="form-label">Price</label>
                    <input type="text" name="price" class="form-control" id="price" placeholder="0"/>
                </div>
                <div class="mb-3">
                    <label for="image" class="form-label">Image</label>
                    <input type="file" name="image" class="form-control" id="image" />
                </div>
                <div id="alert" hidden="hidden" class="alert alert-danger" role="alert">
                    Oops something went wrong. Please try again
                </div>
                <input type="submit"  class="btn btn-primary"/>
            </form>
        </div>
        <script src="./js/product.js"></script>
    </body>
</html>