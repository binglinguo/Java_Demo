package controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.Blog;
import model.BlogDAO;
import model.User;
import model.UserDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: 冰激凌
 * @Date: 2023-05-06 18:52
 **/
@WebServlet("/authorInfo")
public class AuthorServlet extends HttpServlet {
    private ObjectMapper objectMapper = new ObjectMapper();
    @Override
    protected void doGet (HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json;charset=utf8");
        String param = req.getParameter("blogId");
        if(param == null || "".equals(param)){
            resp.getWriter().write("{ \"ok\": false, \"reason\": \"参数缺失!\" }");
            return ;
        }

        BlogDAO blogDAO = new BlogDAO();
        Blog blog = blogDAO.selectOne(Integer.parseInt(param));
        if(blog == null){
            resp.getWriter().write("{ \"ok\": false, \"reason\": \"查找的博客不存在\" }");
            return ;
        }

        UserDAO userDAO = new UserDAO();
        User user = userDAO.selectUserId(blog.getUserId());
        if(user == null){
            resp.getWriter().write("{ \"ok\": false, \"reason\": \"要查询的用户不存在\" }");
            return ;
        }

        user.setPassWord("");
        resp.getWriter().write(objectMapper.writeValueAsString(user));
    }
}
