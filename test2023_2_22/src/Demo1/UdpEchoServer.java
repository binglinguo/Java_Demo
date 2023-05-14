package Demo1;

import NotWork.UdpEchoSever;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-22 23:06
 **/
public class UdpEchoServer {
    private DatagramSocket socket = null;

    public UdpEchoServer(int port) throws SocketException {
        socket = new DatagramSocket(port);
    }

    public void start() throws IOException {
        System.out.println("启动服务器");
        while(true){
            DatagramPacket requestPacket = new DatagramPacket(new byte[1024],1024);
            //接收客户端的响应
            socket.receive(requestPacket);
            //解析数据报
            String requet = new String(requestPacket.getData(),0,requestPacket.getLength(),"UTF-8");
            //计算响应
            String response = process(requet);
            //获取到计算后的响应给客户端
            //先包裹
            DatagramPacket responsePacket = new DatagramPacket(response.getBytes(),response.getBytes().length,
                    requestPacket.getSocketAddress());
            socket.send(requestPacket);
            System.out.printf("[%s , %d] req : %s, resp : %s\n",requestPacket.getAddress().toString(),requestPacket.getPort(),
                    requet,response);
        }
    }

    private String process (String requet) {
        return requet;
    }

    public static void main (String[] args) throws IOException {
        UdpEchoServer udpEchoServer = new UdpEchoServer(8888);
        udpEchoServer.start();
    }
}
