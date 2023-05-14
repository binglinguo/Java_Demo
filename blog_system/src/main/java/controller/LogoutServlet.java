package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Author: 冰激凌
 * @Date: 2023-05-06 19:26
 **/
@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
    @Override
    protected void doGet (HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false);
        if(session == null){
            resp.getWriter().write("当前用户尚未登录！");
            return ;
        }
        session.removeAttribute("user");
        resp.sendRedirect("blog_login.html");
    }
}
