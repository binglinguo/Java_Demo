package Notwork;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-23 20:41
 **/
public class UdpEchoclient {
    private DatagramSocket socket = null;
    private String serverIp;
    private int serverPost;

    public UdpEchoclient(String ip,int post) throws SocketException {
        socket = new DatagramSocket();
        serverIp = ip;
        serverPost = post;
    }

    public void start() throws IOException {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("-> ");
            String reques = scanner.next();
            DatagramPacket requesPacket = new DatagramPacket(reques.getBytes(),reques.getBytes().length,
                    InetAddress.getByName(serverIp),serverPost);
            socket.send(requesPacket);
            DatagramPacket reqsonsePacket = new DatagramPacket(new byte[1024],1024);
            socket.receive(reqsonsePacket);
            String reqsonse = new String(reqsonsePacket.getData(),0,reqsonsePacket.getLength(),"UTF-8");
            System.out.printf("[req: %s,resp : %s]\n",reques,reqsonse);
        }
    }

    public static void main (String[] args) throws IOException {
        UdpEchoclient udpEchoclient = new UdpEchoclient("127.0.0.1",8888);
        udpEchoclient.start();
    }
}
