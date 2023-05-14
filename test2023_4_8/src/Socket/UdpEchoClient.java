package Socket;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-08 17:32
 **/
public class UdpEchoClient {
    private DatagramSocket socket = null;
    private String socketIP;
    private int socketPort;

    public UdpEchoClient(String IP,int Port) throws SocketException {
        socket = new DatagramSocket();//此处不分配端口  让系统自行分配端口
        this.socketIP = IP;
        this.socketPort = Port;
    }

    public void start() throws IOException {
        System.out.println("连接服务器成功！");
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.printf("-->");
           String requse = scanner.next();
           DatagramPacket repusePacket = new DatagramPacket(requse.getBytes(),requse.getBytes().length,
                   InetAddress.getByName(socketIP),socketPort);
           socket.send(repusePacket);
           DatagramPacket repousePacket = new DatagramPacket(new byte[1024],1024);
           socket.receive(repousePacket);
           String repouse = new String(repousePacket.getData(),0,repousePacket.getLength());
            System.out.printf("req : %s , reps : %s\n ",requse,repouse);
        }
    }

    public static void main (String[] args) throws IOException {
        UdpEchoClient udpEchoClient = new UdpEchoClient("127.0.0.1",7789);
        udpEchoClient.start();
    }
}
