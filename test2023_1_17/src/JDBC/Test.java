package JDBC;

import com.mysql.jdbc.exceptions.MySQLDataException;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test {
    public static void main (String[] args) throws SQLException {
        //创建数据源
        DataSource datasource=new MysqlDataSource();
        //设置数据库所在URL
        ((MysqlDataSource)datasource).setURL("jdbc:mysql://127.0.0.1:3306/a?characterEncoding=utf8&useSSL=false");
        ((MysqlDataSource)datasource).setUser("root");
        ((MysqlDataSource)datasource).setPassword("010822");
        //建立代码和数据库之间的连接
        Connection connection = datasource.getConnection();
        //设定sql语句
        String sql="insert into s values(3,'王炸')";
        //将String转换为语句对象
        PreparedStatement statement=connection.prepareStatement(sql);
        //使用语句对象
        int ret=statement.executeUpdate();
        System.out.println(ret);
        //释放资源
        statement.close();
        connection.close();
    }
}
