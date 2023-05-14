package Notwork;

import java.io.IOException;
import java.util.HashMap;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-23 23:39
 **/
public class TcpThreadDictServer extends TcpEchoThreadServer{
    private HashMap<String ,String> map = new HashMap<>();
    public TcpThreadDictServer (int port) throws IOException {
        super(port);
        map.put("cat","小猫");
        map.put("dog","小狗");
        map.put("fuck","我曹");
    }

    @Override
    public String process (String request) {
        return map.getOrDefault(request,"正在学习该单词中");
    }

    public static void main (String[] args) throws IOException {
        TcpThreadDictServer server = new TcpThreadDictServer(8888);
        server.start();
    }
}
