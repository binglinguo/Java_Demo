package NotWork;

import java.io.IOException;
import java.net.SocketException;
import java.util.HashMap;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-22 22:20
 **/
public class UdpdictServer extends UdpEchoSever{
    HashMap<String,String> map = new HashMap<>();

    public UdpdictServer (int port) throws SocketException {
        super(port);

        map.put("cat","小猫");
        map.put("dog","休勾");
        map.put("fuck","我曹");
        map.put("pig","小猪");
    }

    @Override
    public String process (String requet) {
        return map.getOrDefault(requet,"我正在学习中~~~");
    }

    public static void main (String[] args) throws IOException {
        UdpdictServer udpdictServer = new UdpdictServer(9090);
        udpdictServer.start();
    }
}
