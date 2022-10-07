package servlets;

import Excptions.UserAlreadyExistException;
import com.google.gson.Gson;
import dao.impl.UserDaoImpl;
import entity.User;
import services.UserServices;
import services.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
   private final UserServices userServices;
   public RegistrationServlet(){
       userServices = new UserServiceImpl(new UserDaoImpl());
   }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//    String name = req.getParameter("name");
//    String surname = req.getParameter("surname");
//    String email = req.getParameter("email");
//    String password = req.getParameter("password");
        BufferedReader reader = req.getReader();
        Gson gson = new Gson();
        User user = gson.fromJson(reader,User.class);

   // User user = new User(name,surname,email,password);
        try {
            userServices.save(user);
            resp.sendRedirect("login.jsp");
        } catch (UserAlreadyExistException e) {
            resp.setStatus(HttpServletResponse.SC_CONFLICT);
            e.printStackTrace();
        }

    }
}
