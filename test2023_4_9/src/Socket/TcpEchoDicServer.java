package Socket;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-09 19:42
 **/
public class TcpEchoDicServer extends TcpEchoServer{

    private Map<String,String> map ;

    public TcpEchoDicServer (int port) throws IOException {
        super(port);
        map = new HashMap<>();
        map.put("cat","小猫");
    }

    @Override
    public String process (String requse) {
        return map.getOrDefault(requse,"不会！");
    }

    public static void main (String[] args) throws IOException {
        TcpEchoDicServer dicServer = new TcpEchoDicServer(7897);
        dicServer.start();
    }
}
