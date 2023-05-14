package Socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-09 19:24
 **/
public class TcpEchoServer {
    private ServerSocket socket;

    public TcpEchoServer(int port) throws IOException {
        socket = new ServerSocket(port);
    }

    public void start() throws IOException {
        System.out.println("服务器启动");
        while(true){
            Socket ClientSocket = socket.accept();
            SocketConnection(ClientSocket);
        }
    }

    private void SocketConnection (Socket clientSocket) throws IOException {
        System.out.printf("[%s : %d]客户端上线\n",clientSocket.getInetAddress().toString(),clientSocket.getPort());
        try(InputStream inputStream = clientSocket.getInputStream();
            OutputStream outputStream = clientSocket.getOutputStream()) {
            Scanner scanner = new Scanner(inputStream);
            PrintWriter printWriter = new PrintWriter(outputStream,true);//后面参数为true表示会自动刷新
            while(true){
               if(!scanner.hasNext()){
                   System.out.printf("[%s : %d]客户端下线\n",clientSocket.getInetAddress().toString(),clientSocket.getPort());
                   break;
               }
               String requse = scanner.next();
               String repouse = process(requse);
               printWriter.println(repouse);
                System.out.printf("[%s : %d] req : %s : reps %s\n",clientSocket.getInetAddress().toString(),
                        clientSocket.getPort(),requse,repouse);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            clientSocket.close();
        }
    }

    public String process (String requse) {
        return requse;
    }

    public static void main (String[] args) throws IOException {
        TcpEchoServer tcpEchoServer = new TcpEchoServer(7897);
        tcpEchoServer.start();
    }
}
