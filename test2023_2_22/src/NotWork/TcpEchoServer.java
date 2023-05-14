package NotWork;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-22 22:51
 **/
public class TcpEchoServer {
    private ServerSocket socket = null;

    public TcpEchoServer (int port) throws IOException {
        socket = new ServerSocket(port);
    }

    public void start() throws IOException {
        System.out.println("启动服务器!!!");
        Scanner scanner = new Scanner(System.in);
        while(true){
            Socket clientSocket = socket.accept();//接电话
            processConnection(clientSocket);
        }
    }

    private void processConnection (Socket clientSocket) {
        System.out.println("服务器建立链接成功!");
        try(InputStream inputStream = clientSocket.getInputStream()) {
            try(OutputStream outputStream = clientSocket.getOutputStream()){
                Scanner scanner = new Scanner(inputStream);
                while(true){
                    if(!scanner.hasNext()){
                        System.out.println("服务器断开链接");
                        break;
                    }
                    String request = scanner.next();
                    //计算响应
                    String response = process(request);
                    //包裹起来
                    PrintWriter printWriter = new PrintWriter(outputStream);
                    printWriter.println(response);
                    printWriter.flush();//刷新缓存区
                    System.out.printf("[%s , %d] req: %s , resp : %s \n",
                            clientSocket.getInetAddress().toString(),clientSocket.getPort(),
                            request,response);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
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
        TcpEchoServer tcpEchoServer = new TcpEchoServer(9090);
        tcpEchoServer.start();
    }
}
