package JDBC;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * @Author: guo bing lin
 * @Date: 2023-03-05 22:54
 **/
public class jdbcInsert {
    public static void main (String[] args) throws SQLException {
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setURL("jdbc:mysql://127.0.0.1:3306/students?characterEncoding=utf8&useSSL=false");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("010822");
        Connection connection = dataSource.getConnection();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要插入的姓名");
        String name  = scanner.nextLine();
        System.out.println("请输入学号");
        int id = scanner.nextInt();
        String sql = "insert into student value(?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1,id);
        statement.setString(2,name);
        int ret = statement.executeUpdate();
        if(ret != 0){
            System.out.println("代码执行成功!影响到了" + ret + "行代码");
        }
        statement.close();
        scanner.close();
        connection.close();
    }
}
