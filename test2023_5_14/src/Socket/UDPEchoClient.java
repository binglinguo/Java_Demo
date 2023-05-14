package Socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-05-14 19:40
 **/
public class UDPEchoClient {
    private DatagramSocket datagramSocket = null;
    private String IP;//目的IP
    private int port;//目的端口

    public UDPEchoClient(String IP,int port) throws SocketException {
        //此处我们不分配端口号 为了我们的客户端程序可以主动分配一个可用的端口号
        datagramSocket = new DatagramSocket();
        this.IP = IP;
        this.port = port;
    }

    public void start() throws IOException {
        System.out.println("客户端启动");
        Scanner scanner = new Scanner(System.in);
        while(true){
            //提醒客户端输入
            System.out.printf("-->");
            //获取客户端的输入
            String requse = scanner.nextLine();
            //打包为UDP数据报 其中要放入要传入的目的端口 目的IP
            DatagramPacket requsePacket = new DatagramPacket(requse.getBytes(),requse.getBytes().length,
                    InetAddress.getByName(IP) ,port);
            //发送数据报
            datagramSocket.send(requsePacket);
            //创建对象用于接收服务发回的数据报
            DatagramPacket repousePacket = new DatagramPacket(new byte[1024],1024);
            //将获取到的数据报填充到数据报中
            datagramSocket.receive(repousePacket);
            //打印
            String repouse = new String(repousePacket.getData(),0,repousePacket.getLength());
            System.out.printf("req : %s : reps : %s\n",requse,repouse);
        }
    }

    public static void main (String[] args) throws IOException {
        UDPEchoClient udpEchoClient = new UDPEchoClient("127.0.0.1",8848);
        udpEchoClient.start();
    }
}
