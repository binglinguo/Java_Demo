package Socket;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-10 09:07
 **/
public class TcpEchoDicServer extends TcpEchoServer{
    private Map<String,String> map = new HashMap<>();

    public TcpEchoDicServer (int port) throws IOException {
        super(port);
        map.put("cat","小猫");
    }

    @Override
    public String provess (String requse) {
        return map.getOrDefault(requse,"不会！");
    }

    public static void main (String[] args) throws IOException {
        TcpEchoDicServer server = new TcpEchoDicServer(9999);
        server.start();
    }
}
