package controller;

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

/**
 * @Author: 冰激凌
 * @Date: 2023-05-07 09:37
 **/
@WebServlet("/blogDelete")
public class BlogDeleteServlet extends HttpServlet {
    @Override
    protected void doGet (HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false);
        if(session == null){
            resp.setContentType("text/html;charset=utf8");
            resp.getWriter().write("当前尚未登录 不能执行删除");
            return ;
        }

        User user = (User) session.getAttribute("user");
        if(user == null){
            resp.setContentType("text/html;charset=utf8");
            resp.getWriter().write("当前尚未登录 不能执行删除");
            return ;
        }

        String blogId = req.getParameter("blogId");
        if(blogId == null || "".equals(blogId)){
            resp.setContentType("text/html;charset=utf8");
            resp.getWriter().write("当前blogId参数有异");
            return ;
        }

        BlogDAO blogDAO = new BlogDAO();
        Blog blog = blogDAO.selectOne(Integer.parseInt(blogId));
        if(blog == null){
            resp.setContentType("text/html;charset=utf8");
            resp.getWriter().write("当前要删除的博客不存在");
            return ;
        }

        if(user.getUserId() != blog.getUserId()){
            resp.setContentType("text/html;charset=utf8");
            resp.getWriter().write("当前登录用户无删除权限");
            return ;
        }

        blogDAO.delete(Integer.parseInt(blogId));
        resp.sendRedirect("blog_list.html");
    }
}
