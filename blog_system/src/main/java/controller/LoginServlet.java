package controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.User;
import model.UserDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Author: 冰激凌
 * @Date: 2023-05-06 15:12
 **/
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    protected void doPost (HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf8");
        resp.setCharacterEncoding("utf8");

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if(username == null || "".equals(username) || password == null || "".equals(password)){
            resp.setContentType("text/html;charset=utf8");
            resp.getWriter().write("用户名或者密码为空");
            return ;
        }
        UserDAO userDAO = new UserDAO();
        User user = userDAO.selectByname(username);
        if(user == null || !password.equals(user.getPassWord())){
            resp.setContentType("text/html;charset=utf8");
            resp.getWriter().write("用户名或密码错误");
            return ;
        }

        HttpSession session = req.getSession(true);
        session.setAttribute("user",user);

        resp.sendRedirect("blog_list.html");
    }

    @Override
    protected void doGet (HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json;charset=utf8");
        HttpSession session = req.getSession(false);
        if(session == null){
            User user = new User();
            resp.getWriter().write(objectMapper.writeValueAsString(user));
            return ;
        }
        User user = (User) session.getAttribute("user");
        if(user == null){
            user = new User();
            resp.getWriter().write(objectMapper.writeValueAsString(user));
            return ;
        }
        user.setPassWord("");
        resp.getWriter().write(objectMapper.writeValueAsString(user));
    }
}
