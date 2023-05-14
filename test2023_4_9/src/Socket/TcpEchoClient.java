package Socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-09 19:34
 **/
public class TcpEchoClient {
    private Socket socket ;

    public TcpEchoClient(String ip,int port) throws IOException {
        socket = new Socket(ip,port);
    }

    public void start(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("服务器已连接成功");
        try(InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream()) {
            Scanner clientScanner = new Scanner(inputStream);
            PrintWriter printWriter = new PrintWriter(outputStream,true);
            while(true){
                System.out.print("->");
                String requse = scanner.next();
                printWriter.println(requse);
                String repuse = clientScanner.next();
                System.out.printf("req : %s : reps : %s\n",requse,repuse);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main (String[] args) throws IOException {
        TcpEchoClient tcpEchoClient = new TcpEchoClient("127.0.0.1",7897);
        tcpEchoClient.start();
    }
}
