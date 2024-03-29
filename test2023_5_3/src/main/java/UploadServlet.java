import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;

/**
 * @Author: 冰激凌
 * @Date: 2023-05-03 23:36
 **/
@MultipartConfig
@WebServlet("/upload")
public class UploadServlet extends HttpServlet {
    @Override
    protected void doPost (HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
        Part part = req.getPart("MyImage");
        System.out.println(part.getSubmittedFileName());
        System.out.println(part.getContentType());
        System.out.println(part.getSize());
        part.write("d://test/aaa.jpg");
        resp.setContentType("text/html;charset=utf8");
        resp.getWriter().write("上传成功");
    }
}
