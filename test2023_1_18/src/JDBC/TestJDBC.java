package JDBC;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestJDBC {











    public static void main1 (String[] args) throws SQLException {
        //创建数据源
        DataSource dataSource=new MysqlDataSource();
        //设置数据库所在地址
        ((MysqlDataSource)dataSource).setURL("jdbc:mysql://127.0.0.1:3306/a?characterEncoding=utf8&useSSL=false");
        //设置访问数据库的用户
        ((MysqlDataSource)dataSource).setUser("root");
        //设置用户名的密码
        ((MysqlDataSource)dataSource).setPassword("010822");

        //连接数据库 这边如果访问失败（出现地址错误 或者 用户名错误 或者 密码错误都会抛出SQLException异常
        Connection connection=dataSource.getConnection();

        //设定sql语句
        String sql="insert into s values(4,'八分')";
        //将String类型的语句转换为语句对象
        PreparedStatement statement=connection.prepareStatement(sql);
        //执行语句
        int ret=statement.executeUpdate();
        System.out.println(ret);

        //关闭资源
        connection.close();
        statement.close();
    }
}
