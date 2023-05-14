package NotWork;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-22 21:15
 **/
public class UdpEchoCilent {
    private DatagramSocket socket = null;
    private String serverIp;//IP
    private int serverPort;//端口号

    public UdpEchoCilent (String ip,int port) throws SocketException {
        this.socket = new DatagramSocket();
        this.serverIp = ip;
        this.serverPort = port;
    }

    public void start() throws IOException {
        //创建Scannner类 让用户可以在客户端进行输入
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("-> ");
            String request = scanner.next();//接收用户输入的请求
            //将用户输入的请求包装成一个DatagramPacket 数据报
            DatagramPacket requestPacket = new DatagramPacket(request.getBytes(),request.getBytes().length,
                    InetAddress.getByName(serverIp),serverPort);
            //此处构建数据报传入的参数 第一个参数是用户请求中的内容 第二个参数是内容的长度
            // 第三个内容是要传给的服务器的IP 第四个参数是要传给的服务器的端口号
            //将数据报传给服务器
            socket.send(requestPacket);
            //接收服务器响应的数据
            //还是一样的 我们首先要来构造一个空的DatagramPacket 数据报
            DatagramPacket responsePacket = new DatagramPacket(new byte[1024],1024);
            //接收服务器响应的数据
            socket.receive(responsePacket);
            //接收到服务器的响应后 解析数据报
            String response = new String(responsePacket.getData(),0,responsePacket.getLength(),"UTF-8");
            //此处的第一个参数是数据报中的内容 第二个参数是数据报中内容的长度 第三个参数是解析类型
            //输出解析后的内容
            System.out.printf("req: %s, resp : %s\n",request,response);
        }
    }

    public static void main (String[] args) throws IOException {
        UdpEchoCilent udpEchoCilent = new UdpEchoCilent("127.0.0.1",9090);
        udpEchoCilent.start();
    }
}
