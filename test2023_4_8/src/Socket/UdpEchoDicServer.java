package Socket;

import java.io.IOException;
import java.net.SocketException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-08 17:53
 **/
public class UdpEchoDicServer extends UdpEchoServer{
    private Map<String,String> map = new HashMap<>();
    public UdpEchoDicServer (int port) throws SocketException {
        super(port);
        map.put("cat","小猫");
        map.put("dog","小狗");
        map.put("synchronized","同步");
        map.put("fuck","卧槽");
        map.put("head","馒头");
    }

    @Override
    public String response (String repose) {
        return map.getOrDefault(repose,"暂未查询到该单词");
    }

    public static void main (String[] args) throws IOException {
        UdpEchoDicServer udpEchoDicServer = new UdpEchoDicServer(7789);
        udpEchoDicServer.start();
    }
}
