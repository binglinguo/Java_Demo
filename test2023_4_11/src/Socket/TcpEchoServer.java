package Socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-11 17:25
 **/
public class TcpEchoServer {
    private ServerSocket socket ;

    public TcpEchoServer(int port) throws IOException {
        socket = new ServerSocket(port);
    }

    public void start() throws IOException {
        System.out.println("服务器启动");
        while(true){
            Socket clientSocket = socket.accept();
            ConnctionClient(clientSocket);
        }
    }

    private void ConnctionClient (Socket clientSocket) throws IOException {
        System.out.printf("[%s : %d]客户端上线\n",clientSocket.getInetAddress().toString(),clientSocket.getPort());
        try(InputStream inputStream = clientSocket.getInputStream();
            OutputStream outputStream = clientSocket.getOutputStream()) {
            Scanner scanner = new Scanner(inputStream);
            PrintWriter printWriter = new PrintWriter(outputStream);
            while(true){
               if(!scanner.hasNext()){
                   System.out.printf("[%s , %d]服务器下线\n",clientSocket.getInetAddress().toString(),clientSocket.getPort());
                   break;
               }
                String requse = scanner.next();
                printWriter.println(requse);
                String repouse = prouess(requse);
                printWriter.println(repouse);
                printWriter.flush();
                System.out.printf("[%s : %d] req : %s ,reps : %s\n",clientSocket.getInetAddress().toString(),
                        clientSocket.getPort(),requse,repouse);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            clientSocket.close();
        }
    }

    private String prouess (String requse) {
        return requse;
    }

    public static void main (String[] args) throws IOException {
        TcpEchoServer tcpEchoServer = new TcpEchoServer(8855);
        tcpEchoServer.start();
    }
}
