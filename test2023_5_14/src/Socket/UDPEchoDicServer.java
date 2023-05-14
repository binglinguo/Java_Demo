package Socket;

import java.io.IOException;
import java.net.SocketException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 冰激凌
 * @Date: 2023-05-14 20:00
 **/
public class UDPEchoDicServer extends UDPEchoServer{
    //为了方便查询 也为了可以保证我们的查找速度 我们选择哈希表来做一个数据存储
    private Map<String,String> map = new HashMap<>();

    public UDPEchoDicServer (int port) throws SocketException {
        super(port);
        //我们只做一个简单的词库
        map.put("dog","小狗");
        map.put("cat","小猫");
        map.put("synchronized","同步");
    }

    @Override
    public String process (String requse) {
        //因为我们继承了处理后返回方法 所以直接继承之后重写即可
        return map.getOrDefault(requse,"暂时未学习该单词");

    }

    public static void main (String[] args) throws IOException {
        UDPEchoDicServer udpEchoDicServer = new UDPEchoDicServer(8848);
        udpEchoDicServer.start();
    }
}
