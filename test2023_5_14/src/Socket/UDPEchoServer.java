package Socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @Author: 冰激凌
 * @Date: 2023-05-14 17:34
 **/

public class UDPEchoServer {
    //我们先来定义一个DatagramSocket类 用来接收数据和发送数据
    DatagramSocket datagramSocket = null;
    //在构造方法中我们将指定端口号
    // 为何要指定端口号？
    // 因为我们客户端在发送的时候要明确知道服务器的端口号 所以此处我们手动指定
    public UDPEchoServer(int port) throws SocketException {
        datagramSocket = new DatagramSocket(port);
    }
    //启动服务器方法
    public void start() throws IOException {
        System.out.println("服务器启动");
        //因为服务器要不停的接收处理数据 所以我们将它设置为一个无限循环
        while(true){
            //我们先来创建一个DatagramPacket类用来接收从客户端接收到的数据
            DatagramPacket requsePacket = new DatagramPacket(new byte[1024],1024);
            //接收客户端发来的数据 当没有接收到数据的时候 这个方法会阻塞等待
            datagramSocket.receive(requsePacket);
            //我们为了方便处理 将接收到的数据转换为字符串进行处理
            String requse = new String(requsePacket.getData(),0,requsePacket.getLength());
            //处理数据
            String repouse = process(requse);
            //打包数据报 其中将要返回的数据 以及端口号都要放入
            DatagramPacket repousePacket = new DatagramPacket(repouse.getBytes(), repouse.getBytes().length,
                    requsePacket.getSocketAddress());
            //发送数据报
            datagramSocket.send(repousePacket);
            //打印查看数据
            System.out.printf("[%s : %d] req ; %s ; reps : %s\n",requsePacket.getAddress().toString(),
                    requsePacket.getPort(),requse,repouse);
        }
    }
    //因为我们写的是回显服务器 所以直接返回接收到的字符串即可
    public String process (String requse) {
        return requse;
    }

    public static void main (String[] args) throws IOException {
        UDPEchoServer udpEchoServer = new UDPEchoServer(8848);
        udpEchoServer.start();
    }
}
