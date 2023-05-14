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
 * @Date: 2023-04-17 08:46
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
            peosspask(clientSocket);
        }
    }

    private void peosspask (Socket clientSocket) throws IOException {
        System.out.printf("客户端建立连接 [%s : %d]\n",clientSocket.getInetAddress().toString(),
                clientSocket.getPort());
        try(InputStream inputStream = clientSocket.getInputStream();
            OutputStream outputStream = clientSocket.getOutputStream()) {
            Scanner scanner = new Scanner(inputStream);
            PrintWriter printWriter = new PrintWriter(outputStream);
            while(true){
                if(!scanner.hasNext()){
                    System.out.printf("客户端断开连接 [%s : %d]\n",clientSocket.getInetAddress().toString(),
                            clientSocket.getPort());
                    break;
                }
                String requse  = scanner.next();
                String repouse = reply(requse);
                printWriter.println(repouse);
                printWriter.flush();
                System.out.printf("[%s : %d] req : %s ; reps : %s\n",clientSocket.getInetAddress().toString(),
                        clientSocket.getPort(),requse,repouse);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            clientSocket.close();
        }
    }

    private String reply (String requse) {
        return requse;
    }

    public static void main (String[] args) throws IOException {
        TcpEchoServer tcpEchoServer = new TcpEchoServer(8852);
        tcpEchoServer.start();
    }
}
