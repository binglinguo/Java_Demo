package JDBC;


import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * @Author: guo bing lin
 * @Date: 2023-03-05 20:37
 **/
public class jdbcSelect {
    public static void main (String[] args) throws SQLException {
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setURL("jdbc:mysql://127.0.0.1:3306/students?characterEncoding=utf8&useSSL=false");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("010822");
        Connection connection = dataSource.getConnection();
        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入要查询的数据表");
//        String table = scanner.next();
//        System.out.println("请输入要查询的列名 如果要查询全部请输入'*'号");
//        String list = scanner.next();
        String sql = "select * from student";
        PreparedStatement statement = connection.prepareStatement(sql);
//        statement.setString(1,list);
//        statement.setString(1,table);
        System.out.println(statement);
        ResultSet resultSet = statement.executeQuery();
        while(resultSet.next()){
            int id = resultSet.getInt("id");
            String name  = resultSet.getString("name");
            System.out.println("id = " + id + ", name = " + name);
        }
        resultSet.close();
        statement.close();
        connection.close();
    }
}
