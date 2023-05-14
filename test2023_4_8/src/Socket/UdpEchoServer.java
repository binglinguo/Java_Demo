package Socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-08 17:18
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
            String repouse = response(requse);
            DatagramPacket repousePacket = new DatagramPacket(repouse.getBytes(),0,repouse.getBytes().length,
                    requsePacket.getAddress(),requsePacket.getPort());
            socket.send(repousePacket);
            System.out.printf("[%s : %d] rep : %s , reqs : %s\n",requsePacket.getAddress().toString(),repousePacket.getPort(),
                    requse,repouse);
        }
    }

    public String response (String repose) {
        return repose;
    }

    public static void main (String[] args) throws IOException {
        UdpEchoServer udpEchoServer = new UdpEchoServer(7789);
        udpEchoServer.start();
    }
}
