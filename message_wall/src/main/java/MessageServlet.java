import com.fasterxml.jackson.databind.ObjectMapper;
import sun.awt.AWTAccessor;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: 冰激凌
 * @Date: 2023-05-02 18:27
 **/
class Message{
    public String from;
    public String to;
    public String message;
}
@WebServlet("/message")
public class MessageServlet extends HttpServlet {
    private ObjectMapper objectMapper = new ObjectMapper();
    //private List<Message> list = new LinkedList<>();
    @Override
    protected void doPost (HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
        //处理提交请求
        Message message = objectMapper.readValue(req.getInputStream(),Message.class);
        //list.add(message);
        save(message);
        resp.setContentType("application/json; charset=utf8");
        //resp.getWriter().write("hello post");
        resp.getWriter().write("{ \"ok\": true }");
    }

    @Override
    protected void doGet (HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
        List<Message> list = load();
        String jsonString = objectMapper.writeValueAsString(list);
        System.out.println(list);
//       resp.getWriter().write("hello get");
        resp.setContentType("application/json; charset=utf8");
        resp.getWriter().write(jsonString);
    }

    private void save(Message message){
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DBUtil.getConnection();
            String sql = "insert into message values(?,?,?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1,message.from);
            statement.setString(2,message.to);
            statement.setString(3,message.message);
            statement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally{
            try {
                DBUtil.close(connection,statement,null);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

    }

    private List<Message> load(){
        List<Message> list = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try{
            connection = DBUtil.getConnection();
            String sql = "select * from message";
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            while(resultSet.next()){
                Message message = new Message();
                message.from = resultSet.getString("from");
                message.to = resultSet.getString("to");
                message.message = resultSet.getString("message");
                list.add(message);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            try {
                DBUtil.close(connection,statement,resultSet);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return list;
    }
}
