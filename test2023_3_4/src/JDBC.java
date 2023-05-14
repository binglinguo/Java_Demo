import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @Author: guo bing lin
 * @Date: 2023-03-04 20:39
 **/
public class JDBC {
    public static void main (String[] args) throws SQLException {
        DataSource source = new MysqlDataSource();
        ((MysqlDataSource)source).setURL("jdbc:mysql://127.0.0.1:3306/a?characterEncoding=utf8&useSSL=false");
        ((MysqlDataSource)source).setUser("root");
        ((MysqlDataSource)source).setPassword("010822");
        Connection connection = source.getConnection();
        String sql = "insert into s value(20,'王多鱼')";
        PreparedStatement statement = connection.prepareStatement(sql);
        int ret = statement.executeUpdate();
        System.out.println("ret = "+ ret);
        statement.close();
        connection.close();
    }
}
