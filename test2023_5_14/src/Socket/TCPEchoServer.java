package Socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-05-14 20:37
 **/
public class TCPEchoServer {
    private ServerSocket socket;
    public TCPEchoServer(int port) throws IOException {
        //创建唯一的端口号
        socket = new ServerSocket(port);
    }

    public void start() throws IOException {
        System.out.println("服务器启动");
        while(true){
            //获取客户端发送来的连接
            Socket clientSocket = socket.accept();
           Thread t1 = new Thread(){
               @Override
               public void run () {
                   //处理连接后的工作
                   try {
                       SocketConnection(clientSocket);
                   } catch (IOException e) {
                       e.printStackTrace();
                   }
               }
           };
           t1.start();
        }
    }

    private void SocketConnection (Socket clientSocket) throws IOException {
        System.out.printf("[%s : %d]客户端上线\n",clientSocket.getInetAddress().toString(),clientSocket.getPort());
        //采用此方法能大大减少代码量
        try(InputStream inputStream = clientSocket.getInputStream();
            OutputStream outputStream = clientSocket.getOutputStream()) {
            Scanner scanner = new Scanner(inputStream);
            PrintWriter printWriter = new PrintWriter(outputStream);
            while(true){
                //我们约定当输入回车的时候结束输入
                //当客户端断开连接后我们服务器也要跟客户端断开连接
                if(!scanner.hasNext()){
                    System.out.printf("[%s : %d]客户端下线\n",clientSocket.getInetAddress().toString(),
                            clientSocket.getPort());
                    break;
                }
                String requse = scanner.next();
                String repouse = process(requse);
                printWriter.println(repouse);
                printWriter.flush();//这个刷新一定要 否则客户端无法知道数据已经传输完毕
                System.out.printf("[%s : %d] req : %s : reps %s\n",clientSocket.getInetAddress().toString(),
                        clientSocket.getPort(),requse,repouse);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //与客户端断开连接  也就是释放这个连接
            clientSocket.close();
        }
    }
    public String process (String requse) {
        return requse;
    }

    public static void main (String[] args) throws IOException {
        TCPEchoServer tcpEchoServer = new TCPEchoServer(8878);
        tcpEchoServer.start();
    }
}
