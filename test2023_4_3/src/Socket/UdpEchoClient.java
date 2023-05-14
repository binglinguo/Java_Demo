package Socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-03 08:45
 **/
public class UdpEchoClient {
    private DatagramSocket datagramSocket = null;
    private String socketIP ;
    private int socketPost;
    public UdpEchoClient(String socketIP,int post) throws SocketException {
        this.datagramSocket = new DatagramSocket();//此处不分配端口号 让系统自动分配一个空闲的端口号
        this.socketIP = socketIP;
        this.socketPost = post;
    }
    public void start() throws IOException {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("--->");
            String reques = scanner.nextLine();
            DatagramPacket requesPacket = new DatagramPacket(reques.getBytes(),0,reques.getBytes().length,
                    InetAddress.getByName(socketIP) ,socketPost);
            datagramSocket.send(requesPacket);
            //当写回网卡之后 会被服务器接收到并且处理（服务器正常运行的情况下)
            DatagramPacket reponesPacket = new DatagramPacket(new byte[1024],1024);
            datagramSocket.receive(reponesPacket);//接收服务器返回的响应 如果服务器还未处理完 则阻塞等待
            String repones = new String(reponesPacket.getData(),0,reponesPacket.getLength());
            System.out.printf("req : %s , reps : %s\n",reques,repones);
        }
    }

    public static void main (String[] args) throws IOException {
        UdpEchoClient udpEchoClient = new UdpEchoClient("127.0.0.1",8888);
        udpEchoClient.start();
    }
}
