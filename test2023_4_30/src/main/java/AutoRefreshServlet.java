import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: 冰激凌
 * @Date: 2023-05-02 17:12
 **/
@WebServlet("/autoRefresh")
public class AutoRefreshServlet extends HttpServlet {
    @Override
    protected void doGet (HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
        resp.setHeader("Refresh","1");
        resp.getWriter().write("timeStamp = " + System.currentTimeMillis());
    }
}
