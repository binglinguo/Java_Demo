package NotWork;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-22 20:19
 **/
public class UdpEchoSever {
    //创建一个Socket文件 用来操作系统中的网卡
    private DatagramSocket socket = null;//这里为什么为空呢? 因为我们的服务器在构建的时候要指定端口号 以便于客户端进行传输

    public UdpEchoSever(int port) throws SocketException {
        socket = new DatagramSocket(port);//这边的创建socket文件是会抛出异常的
        // 因为我们创建文件的时候 可能端口号以被其他的应用锁占用 或者 进程打开的数量是有上限的 进程打开的数量已满
    }

    public void start() throws IOException {
        int i = 0;
        //启动服务器
        System.out.println("启动服务器!!");
        while(true){
            //我们的服务器要不停的接收从客户端发来的数据报
            DatagramPacket requestPacket = new DatagramPacket(new byte[1024],1024);//此处创建一个数据源类型用于接收
            socket.receive(requestPacket);//此处接收的类型是一个DatagramPacket 类型
            i++;
            //并且 此处的receive 是会抛出异常的 那么如果没有接收到从客户端传来的 数据的时候 receive会发生阻塞
            //接收到数据报后 我们要对于数据报进行解析
            String requet = new String(requestPacket.getData(),0,requestPacket.getLength(),"UTF-8");
            //此处构造String 的参数 第一个为数据报中的数据 第二个是从0开始一直到第三个参数 第三个参数是数据的长度 不一定是1024 UTF-8 是指定字符编译类型
            //接收到数据报后计算响应
            String response = process(requet);
            //接收到计算后的响应后 要对响应内容进行封装为DatagramPacket 的数据报才能使用服务器进行返回给客户端
            DatagramPacket responsePasket = new DatagramPacket(response.getBytes(),response.getBytes().length,
                    requestPacket.getSocketAddress());
            //第一个参数是服务器计算后的响应 第二个参数是响应内容的长度 第三个参数是我们要将数据传回哪个IP+端口号
            //注意!!! 此处第二个参数不可以写为length() 因为我们当前的是UDP 是一个数据报 而不是一个数据流
            //最后我们将封装好的Packet数据报响应给客户端
            socket.send(responsePasket);//此处要将服务器计算后的响应传回客户端
            System.out.printf("第"+ i + "条响应"+"[%s : %d] req : %s, resp : %s\n",
                    requestPacket.getAddress(),requestPacket.getPort(),requet,response);
        }
    }
    //因为我们当前实现的是一个回显服务器 所以我们可以直接对数据进行返回
    public String process (String requet) {
        return requet;
    }

    public static void main (String[] args) throws IOException {
        UdpEchoSever udpEchoSever = new UdpEchoSever(9090);
        udpEchoSever.start();
    }
}
