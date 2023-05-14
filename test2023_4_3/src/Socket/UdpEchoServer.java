package Socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-03 08:44
 **/
public class UdpEchoServer {
    private DatagramSocket socket = null;
    public UdpEchoServer(int post) throws SocketException {
        socket = new DatagramSocket(post);
    }
    public void start() throws IOException {
        System.out.println("服务器启动");
        while(true){
            //构造空盘
            DatagramPacket requesPacket = new DatagramPacket(new byte[1024],1024);
            socket.receive(requesPacket);
            //获取到请求后处理响应
            //转换为字符串更好处理
            String reques = new String(requesPacket.getData(),0,requesPacket.getLength());
            //处理响应
            String reponest = response(reques);
            //封装起来写回到网卡
            DatagramPacket reponestPacket = new DatagramPacket(reponest.getBytes(),reponest.length(),
                    requesPacket.getSocketAddress());//记得传入IP和端口号 不然会造成数据丢失
            socket.send(reponestPacket);
            //此处处理完毕之后打印一下
            System.out.printf("[%s : %d] req : %s , reps : %s\n",requesPacket.getAddress().toString(),
                    requesPacket.getPort(),
                    reques, reponest);
        }
    }

    public String response (String reques) {
        //因为此处我们做的是回显服务器  所以我们可以直接返回即可
        //如果要对其中数据进行重写 可以直接继承该服务器类 重写该方法即可
        return reques;
    }

    public static void main (String[] args) throws IOException {
        UdpEchoServer server = new UdpEchoServer(8888);
        server.start();
    }
}
