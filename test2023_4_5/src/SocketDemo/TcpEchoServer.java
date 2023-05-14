package SocketDemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-05 10:47
 **/
public class TcpEchoServer {
    private ServerSocket socket = null;
    public TcpEchoServer(int port) throws IOException {
        socket = new ServerSocket(port);
    }
    public void satrt() throws IOException {
        System.out.println("服务器启动成功~");
       for(int i = 0;i < 10;i++){
           Thread t = new Thread(()->{
               while(true){
                   Socket cilentSocket = null;
                   try {
                       cilentSocket = socket.accept();
                   } catch (IOException e) {
                       e.printStackTrace();
                   }
                   try {
                       processConnection(cilentSocket);
                   } catch (IOException e) {
                       e.printStackTrace();
                   }
               }
           });
           t.start();
       }
    }

    private void processConnection (Socket cilentSocket) throws IOException {
        System.out.printf("%s  %d 客户端上线\n",cilentSocket.getInetAddress().toString(),cilentSocket.getPort());
        try(InputStream inputStream = cilentSocket.getInputStream() ;
            OutputStream outputSream = cilentSocket.getOutputStream()){
            Scanner scanner = new Scanner(inputStream);
            PrintWriter printWriter = new PrintWriter(outputSream);
            while(true){
                if(!scanner.hasNext()){
                    //断开连接
                    System.out.printf("%s %d 服务器已下线\n",cilentSocket.getInetAddress().toString(),cilentSocket.getPort());
                    break;
                }
                String reques = scanner.next();
                //我们约定好了 遇到\n为一条请求
                String reponse = process(reques);
                //我们要发回给服务器 我们使用一个printWriter包裹一下可以直接发回 记得我们的也要带换行的
                printWriter.println(reponse);
                printWriter.flush();
                System.out.printf("[%s : %d] req : %s,reps : %s\n",cilentSocket.getInetAddress().toString(), cilentSocket.getPort(),
                        reques,reponse);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private String process (String reques) {
        return reques;
    }

    public static void main (String[] args) throws IOException {
        TcpEchoServer tcpEchoServer = new TcpEchoServer(4561);
        tcpEchoServer.satrt();
    }
}
