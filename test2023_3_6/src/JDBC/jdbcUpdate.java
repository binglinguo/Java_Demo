package JDBC;


import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @Author: guo bing lin
 * @Date: 2023-03-06 08:55
 **/
public class jdbcUpdate {
    public static void main (String[] args) throws SQLException {
        //创建并初始化一个数据源
        DataSource dataSource = new MysqlDataSource();
        //设定数据源端口以及ip
        ((MysqlDataSource)dataSource).setUrl("jdbc:mysql://127.0.0.1:3306/students?characterEncoding=utf8&useSSL=false");
        //设定数据源访问的用户
        ((MysqlDataSource)dataSource).setUser("root");
        //设定数据源访问的用户密码
        ((MysqlDataSource)dataSource).setPassword("010822");
        //与数据库服务器建立连接
        Connection connection = dataSource.getConnection();
        //构建sql语句
        String sql = "update student set name = '江南' where id = 2";
        //将SQL语句包裹起来 一方面也是为了检查sql语句的正确性 也避免了出现坏数据情况
        PreparedStatement statement = connection.prepareStatement(sql);
        //执行sql语句
        int ret = statement.executeUpdate();
        //打印检查是否影响到数据库内容
        System.out.println("代码执行成功,共影响到了" + ret + "行元素");
        //释放资源
        statement.close();
        connection.close();
    }
}
