package JDBC;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC {
    public static void main (String[] args) throws SQLException{
        DataSource dataSource=new MysqlDataSource();
        ((MysqlDataSource)dataSource).setURL("jdbc:mysql://127.0.0.1:3306/a?characterEncoding=utf8&useSSL=false");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("010822");

        //连接 数据库
        Connection connection = dataSource.getConnection();

        //构建sql语句
        String sql="insert into s values(6,'郭祥')";
        //转化String语句为语句对象
        PreparedStatement statement=connection.prepareStatement(sql);
        //执行语句 ret获取到的是影响到的多少列
        int ret=statement.executeUpdate();
        System.out.println(ret);
        //关闭资源
        statement.close();
        connection.close();
    }
}
