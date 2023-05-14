package JDBC;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbc {
    public static void main (String[] args) throws SQLException {
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setURL("jdbc:mysql://127.0.0.1:3306/a?characterEncoding=utf8&useSSL=false");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("010822");

        Connection connection=dataSource.getConnection();
        String sql="insert into s values(8,'牛的')";
        PreparedStatement statement =  connection.prepareStatement(sql);
        int ret=statement.executeUpdate();
        System.out.println(ret);

        statement.close();
        connection.close();
    }
}
