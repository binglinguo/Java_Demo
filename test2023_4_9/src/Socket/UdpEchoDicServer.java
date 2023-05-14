package Socket;

import java.io.IOException;
import java.net.SocketException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-09 19:21
 **/
public class UdpEchoDicServer extends UdpEchoServer{

    private Map<String,String> map = new HashMap<>();

    public UdpEchoDicServer (int port) throws SocketException {
        super(port);
        map.put("cat","小猫");
        map.put("dog","小狗");
        map.put("head","头");
    }

    @Override
    public String process (String requse) {
        return map.getOrDefault(requse,"暂未查询到");
    }

    public static void main (String[] args) throws IOException {
        UdpEchoDicServer dicServer = new UdpEchoDicServer(8855);
        dicServer.start();
    }
}
