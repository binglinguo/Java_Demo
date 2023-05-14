package SocketDemo;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-05 09:55
 **/
public class UdpEchoCilent {
    private DatagramSocket socket = null;
    private String socketIP;
    private int socketPost;
    public UdpEchoCilent(String socketIP,int socketPost) throws SocketException {
        this.socket = new DatagramSocket();
        this.socketIP = socketIP;
        this.socketPost = socketPost;
    }
    public void start() throws IOException {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("-->");
            String reques = scanner.next();
            DatagramPacket requesPacket = new DatagramPacket(reques.getBytes(),reques.getBytes().length,
                    InetAddress.getByName(socketIP) ,socketPost);
            socket.send(requesPacket);
            DatagramPacket reponsePakcet = new DatagramPacket(new byte[1024],1024);
            socket.receive(reponsePakcet);
            String reponse = new String(reponsePakcet.getData(),0,reponsePakcet.getLength());
            System.out.printf("req : %s reps : %s\n",reques,reponse );
        }
    }

    public static void main (String[] args) throws IOException {
        UdpEchoCilent udpEchoCilent = new UdpEchoCilent("127.0.0.1",2233);
        udpEchoCilent.start();
    }
}
