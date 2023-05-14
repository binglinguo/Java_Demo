package JDBC;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test {
    public static void main (String[] args) throws SQLException {
        DataSource datasource = new MysqlDataSource();
        ((MysqlDataSource)datasource).setURL("jdbc:mysql://127.0.0.1:3306/a?characterEncoding=utf8&useSSL=false");
        ((MysqlDataSource)datasource).setUser("root");
        ((MysqlDataSource)datasource).setPassword("010822");

        //创建数据库的连接
        Connection connetion=datasource.getConnection();

        //创建sql语句
        String sql="insert into s values(5,'等哈')";
        PreparedStatement statement = connetion.prepareStatement(sql);
        statement.executeUpdate();

        connetion.close();
        statement.close();
    }
}
