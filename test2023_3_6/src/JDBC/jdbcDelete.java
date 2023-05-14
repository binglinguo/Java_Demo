package JDBC;


import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @Author: guo bing lin
 * @Date: 2023-03-06 08:49
 **/
public class jdbcDelete {
    public static void main (String[] args) throws SQLException {
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setURL("jdbc:mysql://127.0.0.1:3306/students?characterEncoding=utf8&useSSL=false");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("010822");
        Connection connection = dataSource.getConnection();
        String sql = "delete from student where name = '孟佩瑶'";
        PreparedStatement statement = connection.prepareStatement(sql);
        int ret = statement.executeUpdate();
        System.out.println("代码执行成功,共影响到了" + ret + "行元素");
        statement.close();
        connection.close();
    }
}
