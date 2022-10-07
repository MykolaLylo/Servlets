package servlets.controller;

import com.google.gson.Gson;
import dao.impl.ProductDaoImpl;
import entity.Product;
import services.ProductService;
import services.impl.ProductServiceImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

@WebServlet("/product")
public class ProductController extends HttpServlet {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = new ProductServiceImpl(new ProductDaoImpl());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BufferedReader reader = req.getReader();
        Gson gson = new Gson();
        Product product = gson.fromJson(reader, Product.class);
        try {
            productService.save(product);
            resp.sendRedirect("index.jsp");
            // req.getRequestDispatcher("index.jsp").forward(req,resp);
        } catch (SQLException e) {
            resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Gson gson = new Gson();
        resp.setContentType("application/json");
        PrintWriter writer = resp.getWriter();
        List<Product> all = productService.getAll();
        writer.print(gson.toJson(all));
    }

}
