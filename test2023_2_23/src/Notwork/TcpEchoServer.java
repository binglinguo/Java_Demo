package Notwork;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-23 21:00
 **/
public class TcpEchoServer {
    private ServerSocket serverSocket = null;

    public TcpEchoServer(int port) throws IOException {
        serverSocket = new ServerSocket(port);
    }

    public void start() throws IOException {
        System.out.println("服务器启动!");
        while(true){
            Socket clientSocket = serverSocket.accept();
            processconnection(clientSocket);
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
        TcpEchoServer tcpEchoServer = new TcpEchoServer(8888);
        tcpEchoServer.start();
    }
}







//public class TcpEchoServer {
//    private ServerSocket socket = null;
//
//    public TcpEchoServer(int port) throws IOException {
//        socket = new ServerSocket(port);
//    }
//
//    public void start() throws IOException {
//        System.out.println("服务器启动~");
//        while(true){
//            Socket requesSocket = socket.accept();
//            processConnection(requesSocket);
//        }
//    }
//
//    private void processConnection (Socket requesSocket) throws IOException {
//        System.out.printf("客户端建立链接 req : %s,resp : %s",requesSocket.getInetAddress(),requesSocket.getPort());
//        try(InputStream inputStream = requesSocket.getInputStream()){
//            try(OutputStream outputStream = requesSocket.getOutputStream()){
//                Scanner scanner = new Scanner(inputStream);
//                while(true){
//                    if(!scanner.hasNext()){
//                        System.out.println("客户端断开链接");
//                        break;
//                    }
//                    String request = scanner.next();
//                    //根据请求计算响应
//                    String response = process(request);
//                    PrintWriter printWriter = new PrintWriter(outputStream);
//                    printWriter.println(response);
//                    //刷新缓存区
//                    printWriter.flush();
//                    System.out.printf("[%s , %d] req : %s , resp : %s\n",requesSocket.getInetAddress().toString(),
//                            requesSocket.getPort(),request,response);
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally{
//            requesSocket.close();
//        }
//    }
//
//    public String process (String request) {
//        return request;
//    }
//
//    public static void main (String[] args) throws IOException {
//        TcpEchoServer tcpEchoServer = new TcpEchoServer(8888);
//        tcpEchoServer.start();
//    }
//}
