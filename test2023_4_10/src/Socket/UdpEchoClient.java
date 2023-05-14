package Socket;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-10 08:42
 **/
public class UdpEchoClient {
    private DatagramSocket socket ;
    private String ip;
    private int port;

    public UdpEchoClient(String ip,int port) throws SocketException {
        socket = new DatagramSocket();
        this.ip = ip;
        this.port = port;
    }

    public void start() throws IOException {
        System.out.println("客户端启动");
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.printf("->");
            String requse = scanner.next();
            DatagramPacket requsePacket = new DatagramPacket(requse.getBytes(),requse.getBytes().length,
                    InetAddress.getByName(ip),port);
            socket.send(requsePacket);
            DatagramPacket repousePacket = new DatagramPacket(new byte[1024],1024);
            socket.receive(repousePacket);
            String repouse = new String(repousePacket.getData(),0,repousePacket.getLength());
            System.out.printf("req : %s ; reps : %s\n",requse,repouse);
        }
    }

    public static void main (String[] args) throws IOException {
        UdpEchoClient udpEchoClient = new UdpEchoClient("127.0.0.1",9989);
        udpEchoClient.start();
    }
}
