import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Author: 冰激凌
 * @Date: 2023-05-03 21:52
 **/

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost (HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if("zhangsan".equals(username) && "123".equals(password)){
            //登录成功
            HttpSession httpSession = req.getSession(true);
            httpSession.setAttribute("username",username);
            resp.sendRedirect("index");
        }else {
            //登录失败
            resp.getWriter().write("login failed!");
        }
    }
}
