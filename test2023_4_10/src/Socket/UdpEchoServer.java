package Socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-10 08:34
 **/
public class UdpEchoServer {
    private DatagramSocket socket;

    public UdpEchoServer(int port) throws SocketException {
        socket = new DatagramSocket(port);
    }

    public void start() throws IOException {
        System.out.println("服务器启动");
        while(true){
            DatagramPacket requsePacket = new DatagramPacket(new byte[1024],1024);
            socket.receive(requsePacket);
            String requse = new String(requsePacket.getData(),0,requsePacket.getLength());
            String repouse = provess(requse);
            DatagramPacket repousePacket = new DatagramPacket(repouse.getBytes(),repouse.getBytes().length,
                    requsePacket.getSocketAddress());
            socket.send(repousePacket);
            System.out.printf("[%s : %d] req : %s ; reps : %s\n",requsePacket.getAddress().toString(),
                    requsePacket.getPort(),requse,repouse);
        }
    }

    public String provess (String requse) {
        return requse;
    }

    public static void main (String[] args) throws IOException {
        UdpEchoServer udpEchoServer = new UdpEchoServer(9989);
        udpEchoServer.start();
    }
}
