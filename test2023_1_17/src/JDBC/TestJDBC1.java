package JDBC;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestJDBC1 {
    public static void main (String[] args) throws SQLException {
        //1.创建好数据源
        DataSource dataSource=new MysqlDataSource();
        //2.导入数据库所在URL（地址）
        ((MysqlDataSource)dataSource).setURL("jdbc:mysql://127.0.0.1:3306/a?characterEncoding=utf8&useSSL=false");
        //3.导入数据库用户名
        ((MysqlDataSource)dataSource).setUser("root");
        //4.导入数据库用户密码
        ((MysqlDataSource)dataSource).setPassword("010822");
        //connection连接  使idea和数据库建立连接
        Connection connection=dataSource.getConnection();
        //设定sql语句
        String sql="insert into s values(1,'张三');";
        //光是一个String类型的语句对于使用sql还不行  要包装成一个语句对象
        PreparedStatement statement=connection.prepareStatement(sql);
        //查看一下语句对象内容保证sql语句出错能够第一时间发现
        System.out.println(statement);
        //调用sql语句 ret为返回值 返回值为影响到了几行数据
        int ret=statement.executeUpdate();
        //打印查看受到影响的数据有几行 来观察是否执行成功
        System.out.println(ret);

        //释放资源
        statement.close();
        connection.close();


    }
}
