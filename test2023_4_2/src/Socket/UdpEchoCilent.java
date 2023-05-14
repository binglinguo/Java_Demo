package Socket;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-02 22:28
 **/
public class UdpEchoCilent {
    private DatagramSocket datagramSocket = null;
    private String socketIP ;
    private int socketPost;
    public UdpEchoCilent(String socketIP,int socketPost) throws SocketException {
        datagramSocket = new DatagramSocket();
        this.socketIP = socketIP;
        this.socketPost = socketPost;
    }
    public void start() throws IOException {
        Scanner scanner = new Scanner(System.in);
        while(true){
            //首先我们输入执行
            System.out.print("-->");
            String request = scanner.nextLine();
            //然后我们将这个字符串封装为一个DatagramPacket数据报
            //我们要记得传入我们的要发送到的ip和端口号
            DatagramPacket requestPacket = new DatagramPacket(request.getBytes(),0,request.getBytes().length,
                    InetAddress.getByName(socketIP),socketPost);
            datagramSocket.send(requestPacket);
            //当我们传入数据报之后 我们要接收从服务器返回的响应
            //我们还是先构造一个DatagramPacket来接收我们的响应
            DatagramPacket responsepacket = new DatagramPacket(new byte[1024],1024);
            datagramSocket.receive(responsepacket);
            //我们将接收回来的数据报转换为一个字符串方便我们答应
            String response = new String(responsepacket.getData(),0,responsepacket.getLength());
            System.out.printf("req : %s resp: %s\n",request,response);
        }
    }

    public static void main (String[] args) throws IOException {
        UdpEchoCilent udpEchoCilent = new UdpEchoCilent("127.0.0.1",8888);
        udpEchoCilent.start();
    }
}
