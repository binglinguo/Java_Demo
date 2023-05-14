package Socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-10 08:51
 **/
public class TcpEchoServer {
    private ServerSocket socket;
    public TcpEchoServer(int port) throws IOException {
        socket = new ServerSocket(port);
    }

//    public void start() throws IOException {
//        System.out.println("服务器启动成功");
//        while(true){
//            Socket ClinetSocket = socket.accept();
//            Thread thread = new Thread(()->{
//                try {
//                    ConnectionClient(ClinetSocket);
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            });
//            thread.start();
//        }
//    }

    public void start() throws IOException {
        System.out.println("服务器启动成功");
        ExecutorService executor = Executors.newCachedThreadPool();
        while(true){
            Socket ClinetSocket = socket.accept();
            executor.submit(new Runnable() {
                @Override
                public void run () {
                    try {
                        ConnectionClient(ClinetSocket);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    private void ConnectionClient (Socket clinetSocket) throws IOException {
        System.out.printf("[%s : %d] 客户端已建立连接\n",clinetSocket.getInetAddress().toString(),clinetSocket.getPort());
        try (InputStream inputStream = clinetSocket.getInputStream();
             OutputStream outputStream = clinetSocket.getOutputStream()){
            Scanner scanner = new Scanner(inputStream);
            PrintWriter printWriter = new PrintWriter(outputStream);
            while(true){
                if(!scanner.hasNext()){
                    System.out.printf("[%s : %d] 客户端下线\n",clinetSocket.getInetAddress().toString(),clinetSocket.getPort());
                    break;
                }
                String requse = scanner.next();
                String repouse = provess(requse);
                printWriter.println(repouse);
                printWriter.flush();
                System.out.printf("[%s : %d] req : %s ; reps : %s\n",clinetSocket.getInetAddress().toString(),clinetSocket.getPort(),
                        requse,repouse);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            clinetSocket.close();
        }
    }

    public String provess (String requse) {
        return requse;
    }

    public static void main (String[] args) throws IOException {
        TcpEchoServer tcpEchoServer = new TcpEchoServer(9999);
        tcpEchoServer.start();
    }
}
