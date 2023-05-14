import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Author: 冰激凌
 * @Date: 2023-05-03 22:10
 **/
@WebServlet("/index")
public class IndexServlet extends HttpServlet {
    @Override
    protected void doGet (HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
        //接收session对象
        HttpSession httpSession = req.getSession(false);
        //传入一个false是因为之前我们已经获取到了这个对象是否存在
        String username = (String) httpSession.getAttribute("username");
        resp.setContentType("text/html;charset=utf8");
        resp.getWriter().write("<h3>欢迎 " + username + " 进入系统</h3>");
    }
}
