package JDBC;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Author: guo bing lin
 * @Date: 2023-03-06 09:06
 **/
public class jdbcSelect {
    public static void main (String[] args) throws SQLException {
        //创建并初始化一个数据源
        DataSource dataSource = new MysqlDataSource();
        //设定数据源访问的端口号和ip
        ((MysqlDataSource)dataSource).setURL("jdbc:mysql://127.0.0.1:3306/students?characterEncoding=utf8&useSSL=false");
        //设定数据源访问的用户
        ((MysqlDataSource)dataSource).setUser("root");
        //设定数据源访问的用户密码
        ((MysqlDataSource)dataSource).setPassword("010822");
        //与数据库服务器建立连接
        Connection connection = dataSource.getConnection();
        //构建SQL语句
        String sql = "select * from student";
        //将sql语句包裹起来 也是为了检查sql语句是否正确 因为服务器带宽也都是有限的 我们在客户端进行了检查 可以让服务器端做更多的工作
        PreparedStatement statement = connection.prepareStatement(sql);
        //执行SQL命令 返回类型是一个ResultSet类型
        ResultSet resultSet =  statement.executeQuery();
        //循环的打印出ResultSet中的内容
        while(resultSet.next()){
            String name = resultSet.getString("name");
            int id = resultSet.getInt("id");
            System.out.println(id +"  " + name);
        }
        //释放资源
        resultSet.close();
        statement.close();
        connection.close();
    }
}
