package Notwork;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-23 20:30
 **/
public class UdpEchoServer {
    private DatagramSocket socket = null;

    public UdpEchoServer(int port) throws SocketException {
        socket = new DatagramSocket(port);
    }

    public void start() throws IOException {
        System.out.println("启动服务器!!!");
        while(true){
            //首先我们要先接收客户端发来的数据
            DatagramPacket requesPacket = new DatagramPacket(new byte[1024],1024);
            socket.receive(requesPacket);
            //解析为String类型为了方便计算响应
            String requet = new String(requesPacket.getData(),0,requesPacket.getLength(),"UTF-8");
            //计算响应
           String response = process(requet);
           DatagramPacket reqsponsePacket = new DatagramPacket(response.getBytes(),response.getBytes().length,
                   requesPacket.getSocketAddress());
           socket.send(reqsponsePacket);
            System.out.printf("[%s , %d] req : %s, resp : %s\n",requesPacket.getAddress(),requesPacket.getPort(),
                    requet,response);
        }
    }

    public String process (String requet) {
        return requet;
    }

    public static void main (String[] args) throws IOException {
        UdpEchoServer udpEchoServer = new UdpEchoServer(8888);
        udpEchoServer.start();
    }
}
