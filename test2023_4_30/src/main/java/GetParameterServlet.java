import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: 冰激凌
 * @Date: 2023-05-01 15:14
 **/
@WebServlet("/getparameterServlet")
public class GetParameterServlet extends HttpServlet {
    @Override
    protected void doGet (HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req , resp);
        String userId = req.getParameter("userId");
        String classId = req.getParameter("classId");
        resp.getWriter().write("userId = " + userId + " , classId = " + classId);
    }
}
