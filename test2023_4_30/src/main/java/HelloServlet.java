import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-30 21:33
 **/
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet (HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req , resp);
        System.out.println("hello world");
        resp.getWriter().write("hello world " + System.currentTimeMillis());
    }

//    @Override
//    protected void doPost (HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req , resp);
//    }
//
//    @Override
//    protected void doPut (HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
//        super.doPut(req , resp);
//    }
//
//    @Override
//    protected void doDelete (HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
//        super.doDelete(req , resp);
//    }
}
