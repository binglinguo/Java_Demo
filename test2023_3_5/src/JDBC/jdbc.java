package JDBC;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * @Author: guo bing lin
 * @Date: 2023-03-05 19:57
 **/
public class jdbc {
    public static void main (String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setURL("jdbc:mysql://127.0.0.1:3306/a?characterEncoding=utf8&useSSL=false");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("010822");
        Connection connection = dataSource.getConnection();
        System.out.println("请输入姓名");
        String name = scanner.nextLine();
        System.out.println("请输入学号");        int id = scanner.nextInt();
        String sql = "insert into s value(?,?)";
        PreparedStatement statement =connection.prepareStatement(sql);
        statement.setInt(1,id);
        statement.setString(2,name);
        System.out.println(statement);
        int ret = statement.executeUpdate();
        System.out.println(ret);
    }
}
