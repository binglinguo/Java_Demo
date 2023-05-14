package Socket;

import java.io.IOException;
import java.net.SocketException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-04 20:04
 **/
public class UdpEchodic extends UdpEchoServer{
    private Map<String ,String> map = new HashMap<>();
    public UdpEchodic (int post) throws SocketException {
        super(post);
        map.put("cat","小猫");
        map.put("dog","小狗");
        map.put("fack","我曹");
    }

    @Override
    public String response (String reques) {
        return map.getOrDefault(reques,"我正在学习更多单词中");
    }

    public static void main (String[] args) throws IOException {
        UdpEchodic udpEchodic = new UdpEchodic(8888);
        udpEchodic.start();
    }
}
