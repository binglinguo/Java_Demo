package controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.Blog;
import model.BlogDAO;
import model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 冰激凌
 * @Date: 2023-05-05 20:05
 **/
@WebServlet("/blog")
public class BlogServlet extends HttpServlet {
    private ObjectMapper objectMapper = new ObjectMapper();
    @Override
    protected void doGet (HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
        BlogDAO blogDAO = new BlogDAO();
        resp.setContentType("application/json; charset=utf8");

        String param = req.getParameter("blogId");
        if(param == null){
            //获取博客列表
            List<Blog> blogs = blogDAO.selectAll();
            String respJson = objectMapper.writeValueAsString(blogs);
            resp.getWriter().write(respJson);
        }else {
            int blogId = Integer.parseInt(param);
            Blog blog = blogDAO.selectOne(blogId);
            String respJson = objectMapper.writeValueAsString(blog);
            resp.getWriter().write(respJson);
        }
    }

    @Override
    protected void doPost (HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false);
        if(session == null){
            resp.setContentType("text/html;charset=utf8");
            resp.getWriter().write("用户未登录 不能发布博客·");
            return ;
        }
        User user = (User) session.getAttribute("user");
        if(user == null){
            resp.setContentType("text/html;charset=utf8");
            resp.getWriter().write("用户未登录 不能发布博客~");
            return ;
        }
        req.setCharacterEncoding("utf8");
        String title = req.getParameter("title");
        String content = req.getParameter("content");
        if(title == null || "".equals(title) || content == null || "".equals(content)){
            resp.setContentType("text/html;charset=utf8");
            resp.getWriter().write("提交博客失败 缺少必要的参数 error");
            return ;
        }
        Blog blog = new Blog();
        blog.setTitle(title);
        blog.setContent(content);
        blog.setUserId(user.getUserId());
        BlogDAO blogDAO = new BlogDAO();
        blogDAO.insert(blog);
        resp.sendRedirect("blog_list.html");

    }
}
