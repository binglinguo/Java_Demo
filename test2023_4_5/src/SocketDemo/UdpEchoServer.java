package SocketDemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-05 09:43
 **/
public class UdpEchoServer {
    private DatagramSocket socket = null;
    public UdpEchoServer(int post) throws SocketException {
        socket = new DatagramSocket(post);
    }
    public void start() throws IOException {
        System.out.println("服务器启动");
        while(true){
            DatagramPacket requesPacket = new DatagramPacket(new byte[1024],1024);
            socket.receive(requesPacket);
            String reques = new String(requesPacket.getData(),0,requesPacket.getLength());
            //处理响应
            String reponse = process(reques);
            DatagramPacket reponsePacket = new DatagramPacket(reponse.getBytes(),reponse.getBytes().length,
                    requesPacket.getSocketAddress());
            socket.send(reponsePacket);
            System.out.printf("[%s : %d] req : %s ,reps : %s\n",requesPacket.getAddress().toString(),requesPacket.getPort(),
                    reques,reponse);
        }
    }

    public String process (String reques) {
        return reques;
    }

    public static void main (String[] args) throws IOException {
        UdpEchoServer udpEchoServer = new UdpEchoServer(9090);
        udpEchoServer.start();
    }
}
