package Socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-02 20:21
 **/
public class UdpEchonServer {
    DatagramSocket datagramSocket = null;
    public UdpEchonServer(int post) throws SocketException {
        datagramSocket = new DatagramSocket(post);
        //此处是要处理一个异常的 因为端口号是被指定的 所以可能存在端口号已经被占用的情况
    }
    public void start() throws IOException {
        System.out.println("启动服务器成功！");
        while(true){
            //首先我们要先去网卡接收数据报
            DatagramPacket requestPacket = new DatagramPacket(new byte[1024] , 1024);
            datagramSocket.receive(requestPacket);//要处理一个异常 IOException
            //对于datagramPacket进行解析 转换为String类型用来处理响应
            String request = new String(requestPacket.getData(),0,requestPacket.getLength());
            String response = process(request);
            //当我们接收到响应之后 我们对其封装为一个DatagramPacket类 来进行返回
            DatagramPacket responsePacket = new DatagramPacket(response.getBytes(),response.length(),
                    requestPacket.getSocketAddress());
            //处理完毕 我们进行写回网卡
            datagramSocket.send(responsePacket);
            //为了帮助我们理解 我们再打印一下内容
            System.out.printf("[%s : %d] req：%s resp: %s\n",requestPacket.getAddress().toString(),
                    requestPacket.getPort(),request,response);
        }
    }

    private String process (String request) {
        //因为我 们的是回显服务器 所以我们直接返回即可
        return request;
    }

    public static void main (String[] args) throws IOException {
        UdpEchonServer udpEchonServer = new UdpEchonServer(8888);
        udpEchonServer.start();
    }
}
