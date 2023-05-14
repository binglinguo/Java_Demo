package Socket;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 冰激凌
 * @Date: 2023-05-14 21:19
 **/
public class TCPEchoDicServer extends TCPEchoServer{

    private Map<String,String> map = new HashMap<>();

    public TCPEchoDicServer (int port) throws IOException {
        super(port);
        map.put("dog","小狗");
        map.put("cat","小猫");
        map.put("synchronized","同步");
    }

    @Override
    public String process (String requse) {
        return map.getOrDefault(requse,"暂未学习该单词");
    }

    public static void main (String[] args) throws IOException {
        TCPEchoDicServer tcpEchoDicServer = new TCPEchoDicServer(8878);
        tcpEchoDicServer.start();
    }
}
