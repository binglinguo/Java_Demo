package Notwork;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-23 22:11
 **/
public class TcpEchoClient {
    private Socket socket = null;
    public TcpEchoClient(String ip,int post) throws IOException {
        socket = new Socket(ip,post);
    }

    public void start(){
        System.out.println("和服务器建立连接成功!");
        Scanner scanner = new Scanner(System.in);
        try(InputStream inputStream = socket.getInputStream()) {
            try(OutputStream outputStream = socket.getOutputStream()){
                while(true){
                    System.out.print("-> ");
                    String request = scanner.next();
                    PrintWriter printWriter = new PrintWriter(outputStream);
                    printWriter.println(request);
                    printWriter.flush();
                    Scanner response = new Scanner(inputStream);
                    String responseSocket = response.next();
                    System.out.printf("[req : %s,resp : %s\n",request,responseSocket);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main (String[] args) throws IOException {
        TcpEchoClient client = new TcpEchoClient("127.0.0.1",8888);
        client.start();
    }
}
