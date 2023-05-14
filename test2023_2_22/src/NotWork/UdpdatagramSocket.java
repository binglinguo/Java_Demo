package NotWork;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-22 18:32
 **/
public class UdpdatagramSocket {
    //创建出一个socket文件 用来操作系统中的一个socket文件
    private DatagramSocket datagramSocket = null;
    public UdpdatagramSocket(int drop) throws SocketException {
        //初始化socket 并且分配一个端口号 因为服务器一般都会指定端口号以便于客户端来进行传输
        datagramSocket = new DatagramSocket(drop);
    }

    public void start() throws IOException {
        System.out.println("启动服务器");
        //服务器要不停歇的接收客户端发送的指令 当接收到客户端发送的指令的时候 立即唤醒
        while(true){
            //创建一个实例 UDP数据报 用来接收客户端传来的数据报
            DatagramPacket datagramPacket = new DatagramPacket(new byte[1024],1024);
            //读取客户端发送来的数据
            datagramSocket.receive(datagramPacket);
            //将客户端发送来的数据进行解析
            String str = new String(datagramPacket.getData(),0,datagramPacket.getLength(),"UTF-8");
            //将接收到的数据计算响应
            String response = process(str);
            //将响应写回到客户端
            DatagramPacket datagramPacket1 = new DatagramPacket(response.getBytes(),response.getBytes().length,
                    datagramPacket.getSocketAddress());
            datagramSocket.send(datagramPacket1);
            System.out.printf("[%s : %d] req : %s ,resp : %s\n",datagramPacket.getAddress().toString(),datagramPacket.getPort(),
                    str,response);
        }
    }

    private String process (String str) {
        return str;
    }

    public static void main (String[] args) throws IOException {
        UdpdatagramSocket udpdatagramSocket = new UdpdatagramSocket(9090);
        udpdatagramSocket.start();
    }
}
