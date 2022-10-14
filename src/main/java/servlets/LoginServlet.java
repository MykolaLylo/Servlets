package servlets;

import Excptions.IncorectCredentialsException;
import Models.UserCredentials;
import dao.impl.UserDaoImpl;
import entity.User;
import services.UserServices;
import services.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    private final UserServices userServices;

    public LoginServlet(){
        userServices = new UserServiceImpl(new UserDaoImpl());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserCredentials credentials = new UserCredentials(req.getParameter("email"),req.getParameter("password"));
        System.out.println(credentials + "credentials");
        HttpSession session = req.getSession();
        try {
            User user = userServices.login(credentials);
            session.setAttribute("userName", user.getName());
            session.setAttribute("userRole", user.getRole().name());
            session.setAttribute("userId",user.getUser_id());
            resp.sendRedirect("index.jsp");
        } catch (IncorectCredentialsException e) {
            e.printStackTrace();
            resp.sendRedirect("login.jsp?error=error");
        }
    }
}
