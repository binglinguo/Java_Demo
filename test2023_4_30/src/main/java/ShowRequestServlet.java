import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @Author: 冰激凌
 * @Date: 2023-05-01 14:49
 **/
@WebServlet("/showRequest")
public class ShowRequestServlet extends HttpServlet {
    @Override
    protected void doGet (HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req , resp);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<h3> 首行部分</h3>");
        stringBuilder.append(req.getProtocol());//协议名和版本
        stringBuilder.append("<br>");
        stringBuilder.append(req.getMethod());//方法
        stringBuilder.append("<br>");
        stringBuilder.append(req.getRequestURI());//拿到请求路径
        stringBuilder.append("<br>");
        stringBuilder.append(req.getContextPath());//获取到上层路径 也就是URL部分
        stringBuilder.append("<br>");
        stringBuilder.append(req.getQueryString());//获取到请求之后包含的字符串
        stringBuilder.append("<h3>header</h3>");
        Enumeration<String> headerNames = req.getHeaderNames();
        while(headerNames.hasMoreElements()){
            String headerName = headerNames.nextElement();
            String headerValue = req.getHeader(headerName);
            stringBuilder.append(headerName + ":" + headerValue + "<br>");
        }

        resp.setContentType("text/html; charset=utf8");
        resp.getWriter().write(stringBuilder.toString());
    }
}
