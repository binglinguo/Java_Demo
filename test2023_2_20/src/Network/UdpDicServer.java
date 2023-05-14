package Network;

import java.io.IOException;
import java.net.SocketException;
import java.util.HashMap;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-20 21:32
 **/
public class UdpDicServer extends UdpEchoServer{
    private HashMap<String,String> dict = new HashMap<>();

    public UdpDicServer (int port) throws SocketException {
        super(port);
        dict.put("cat", "小猫");
        dict.put("dog", "小狗");
        dict.put("fuck", "卧槽");
        dict.put("pig", "小猪");
    }

    @Override
    public String process (String request) {
        return dict.getOrDefault(request,"我正在学习更多单词中");
    }

    public static void main (String[] args) throws IOException {
        UdpDicServer udpDicServer = new UdpDicServer(9090);
        udpDicServer.start();
    }
}
