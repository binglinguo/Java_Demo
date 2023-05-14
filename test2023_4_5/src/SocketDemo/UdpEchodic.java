package SocketDemo;

import java.io.IOException;
import java.net.SocketException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-05 10:04
 **/
public class UdpEchodic extends UdpEchoServer{
    private Map<String,String> map = new HashMap<>();
    public UdpEchodic (int post) throws SocketException {
        super(post);
        map.put("cat","猫咪");
        map.put("dog","狗子");
        map.put("fuck","卧槽");
        map.put("bread","馒头");
    }

    @Override
    public String process (String reques) {
        return map.getOrDefault(reques,"正在学习该单词中");
    }

    public static void main (String[] args) throws IOException {
        UdpEchodic udpEchodic = new UdpEchodic(8848);
        udpEchodic.start();
    }
}
