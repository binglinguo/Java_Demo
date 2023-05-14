package JDBC;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-08 21:36
 **/
public class jdbcdelete {
    public static void main (String[] args) throws SQLException {
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setUrl("jdbc:mysql://127.0.0.1:3306/students?characterEncoding=utf8&useSSL=false");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("010822");
        Connection connection = dataSource.getConnection();
        String sql = "delete from student where id = 15";
        PreparedStatement statement = connection.prepareStatement(sql);
        int ret = statement.executeUpdate();
        System.out.println(ret);
        statement.close();
        connection.close();
    }
}
