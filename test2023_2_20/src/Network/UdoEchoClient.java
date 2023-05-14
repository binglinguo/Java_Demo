package Network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-20 21:10
 **/
public class UdoEchoClient {
    private DatagramSocket socket = null;
    private String serverIP;
    private int serverPort;
    public UdoEchoClient(String serverIP,int serverPort) throws SocketException {
        socket = new DatagramSocket();//不分配 让系统自动分配端口号
        this.serverIP = serverIP;
        this.serverPort = serverPort;
    }

    public void start() throws IOException {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("-> ");
            String request = scanner.nextLine();
            DatagramPacket requstPacket = new DatagramPacket(request.getBytes(),request.getBytes().length,
                    InetAddress.getByName(serverIP),serverPort);
            socket.send(requstPacket);
            DatagramPacket responsePacket = new DatagramPacket(new byte[1024],1024);
            socket.receive(responsePacket);
            String response = new String(responsePacket.getData(),0,responsePacket.getLength(),
                    "UTF-8");
            System.out.printf("req: %s, resp: %s\n", request, response);
        }
    }

    public static void main (String[] args) throws IOException {
        UdoEchoClient client = new UdoEchoClient("127.0.0.1",9090);
        client.start();
    }
}
