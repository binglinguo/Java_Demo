package Demo1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-22 23:16
 **/
public class UdpEchoCilent {
    private DatagramSocket socket = null;
    private String serverIp;
    private int serverPort;

    public UdpEchoCilent(String ip,int port) throws SocketException {
        socket = new DatagramSocket();//采用无参数让系统分配端口号
        serverIp = ip;
        serverPort = port;
    }

    public void start() throws IOException {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("-> ");
            String request = scanner.next();
            //包装
            DatagramPacket requestPacket = new DatagramPacket(request.getBytes(),request.getBytes().length,
                    InetAddress.getByName(serverIp) ,serverPort);
            //发送给服务器
            socket.send(requestPacket);
            DatagramPacket responsePacket = new DatagramPacket(new byte[1024],1024);
            socket.receive(responsePacket);
            String response = new String(responsePacket.getData(),0,responsePacket.getLength(),
                    "UTF-8");
            System.out.printf("req: %s,resp : %s\n",request,response);
        }
    }

    public static void main (String[] args) throws IOException {
        UdpEchoCilent udpEchoCilent = new UdpEchoCilent("127.0.0.1",8888);
        udpEchoCilent.start();
    }
}
