package JDBC;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class TestJDBC {
    public static void main (String[] args) throws SQLException {
//        MysqlDataSource mysqlDataSource=new MysqlDataSource();
//        mysqlDataSource.setURL();
//        mysqlDataSource.setUser();
//        mysqlDataSource.setPassword();
        //以上的写法也是可以的  但是高耦合
        DataSource dataSource=new MysqlDataSource();
        //获取数据库所在的地址
        ((MysqlDataSource)dataSource).setURL("jdbc:mysql://127.0.0.1:3306/java102?characterEncoding=utf8&useSSL=flase");

        //获取登录数据库的用户名
        ((MysqlDataSource)dataSource).setUser("root");
        //这个是设置登录数据库的密码
        ((MysqlDataSource)dataSource).setPassword("010822");
        //2.让代码和服务器建立链接
        Connection connection = dataSource.getConnection();
    }
}
