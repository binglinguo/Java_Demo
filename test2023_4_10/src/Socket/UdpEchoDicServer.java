package Socket;

import java.io.IOException;
import java.net.SocketException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-10 08:48
 **/
public class UdpEchoDicServer extends UdpEchoServer{
    private Map<String,String> map = new HashMap<>();

    public UdpEchoDicServer (int port) throws SocketException {
        super(port);
        map.put("cat","小猫");
        map.put("dog","小狗");
    }

    @Override
    public String provess (String requse) {
        return map.getOrDefault(requse,"不会!");
    }

    public static void main (String[] args) throws IOException {
        UdpEchoDicServer server = new UdpEchoDicServer(9989);
        server.start();
    }
}
