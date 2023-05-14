package Notwork;

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

/**
 * @Author: guo bing lin
 * @Date: 2023-02-23 22:45
 **/
public class TcpEchoPoolServer {
    private ServerSocket serverSocket = null;

    public TcpEchoPoolServer(int port) throws IOException {
        serverSocket = new ServerSocket(port);
    }

    public void start() throws IOException {
        System.out.println("服务器启动!");
        ExecutorService pool = Executors.newCachedThreadPool();
        while(true){
            Socket clientSocket = serverSocket.accept();
            pool.submit(new Runnable() {
                @Override
                public void run () {
                    processconnection(clientSocket);
                }
            });
        }
    }

    private void processconnection (Socket clientSocket) {
        System.out.printf("客户端建立连接 req : %s,resp : %s\n",clientSocket.getInetAddress().toString(),clientSocket.getPort());
        try(InputStream inputStream = clientSocket.getInputStream()) {
            try(OutputStream outputStream = clientSocket.getOutputStream()){
                Scanner scanner = new Scanner(inputStream);
                while(true){
                    if(!scanner.hasNext()){
                        System.out.printf("客户端断开链接 req : %s , resp : %s\n",clientSocket.getInetAddress().toString(),
                                clientSocket.getPort());
                        break;
                    }
                    String request = scanner.next();
                    //计算响应
                    String response = process(request);
                    PrintWriter printWriter = new PrintWriter(outputStream);
                    printWriter.println(response);
                    printWriter.flush();
                    System.out.printf("[%s:%d] req : %s , resp : %s\n",clientSocket.getInetAddress().toString(),
                            clientSocket.getPort(),request,response);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                clientSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private String process (String request) {
        return request;
    }

    public static void main (String[] args) throws IOException {
        TcpEchoPoolServer tcpEchoPoolServer = new TcpEchoPoolServer(8888);
        tcpEchoPoolServer.start();
    }
}
