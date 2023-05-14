package model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 冰激凌
 * @Date: 2023-05-05 18:51
 **/
public class BlogDAO {
    //1、插入操作
    public void insert(Blog blog){
        //1.建立数据库链接
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DBUtil.getConnection();
            //2.构造sql语句
            String sql = "insert into blog values(null,?,?,?,now())";
            statement = connection.prepareStatement(sql);
            statement.setString(1,blog.getTitle());
            statement.setString(2,blog.getContent());
            statement.setInt(3,blog.getUserId());
            //3.执行sql语句
            statement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            //4.释放资源
            DBUtil.close(connection,statement,null);
        }
    }
    //2、查询所有博客内容
    public List<Blog> selectAll(){
        List<Blog> blogs = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            connection = DBUtil.getConnection();
            String sql = "select * from blog order by postTime desc";
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Blog blog = new Blog();
                blog.setBlogId(resultSet.getInt("blogId"));
                blog.setTitle(resultSet.getString("title"));
                // 这里需要针对内容进行截断(太长了, 就去掉后面)
                String content = resultSet.getString("content");
                // 这个 50 纯属拍脑门出来的!! 这个数字具体写多少, 都可以灵活应对!!
                if (content.length() > 50) {
                    content = content.substring(0, 50) + "...";
                }
                blog.setContent(content);
                blog.setUserId(resultSet.getShort("userId"));
                blog.setPostTime(resultSet.getTimestamp("postTime"));
                blogs.add(blog);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DBUtil.close(connection, statement, resultSet);
        }
        return blogs;
    }
    //3、查询一条博客内容
    public Blog selectOne (int blogId){
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try{
            connection = DBUtil.getConnection();
            String sql = "select * from blog where blogId=?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1, blogId);
            resultSet = statement.executeQuery();
            // 此处我们是使用 主键 来作为查询条件的. 查询结果, 要么是 1 , 要么是 0.
            if (resultSet.next()) {
                Blog blog = new Blog();
                blog.setBlogId(resultSet.getInt("blogId"));
                blog.setTitle(resultSet.getString("title"));
                blog.setContent(resultSet.getString("content"));
                blog.setUserId(resultSet.getShort("userId"));
                blog.setPostTime(resultSet.getTimestamp("postTime"));
                return blog;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DBUtil.close(connection, statement, resultSet);
        }
        return null;
    }
    //4、删除博客
    public void delete(int blogId){
        Connection connection = null;
        PreparedStatement statement = null;
        try{
            connection = DBUtil.getConnection();
            String sql = "delete from blog where blogId=?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,blogId);
            int ret = statement.executeUpdate();
            System.out.println(ret);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DBUtil.close(connection, statement,null);
        }
    }
    //5、修改博客
}

