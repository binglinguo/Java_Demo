package Notwork;

import java.io.IOException;
import java.net.SocketException;
import java.util.HashMap;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-23 20:55
 **/
public class UdpDictServer extends UdpEchoServer{
    private HashMap<String,String> map = new HashMap<>();
    public UdpDictServer (int port) throws SocketException {
        super(port);

        map.put("cat","小猫");
        map.put("dog","小狗");
        map.put("fuck","我曹");
    }

    @Override
    public String process (String requet) {
        return map.getOrDefault(requet,"我正在学习该单词中~");
    }

    public static void main (String[] args) throws IOException {
        UdpDictServer udpDictServer = new UdpDictServer(8888);
        udpDictServer.start();
    }
}
