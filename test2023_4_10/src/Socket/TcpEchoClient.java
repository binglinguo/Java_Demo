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
 * @Date: 2023-04-10 08:59
 **/
public class TcpEchoClient {
    private Socket socket ;
    public TcpEchoClient(String ip,int port) throws IOException {
        socket = new Socket(ip,port);
    }

    public void start(){
        System.out.printf("客户端上线\n");
        Scanner scanenr = new Scanner(System.in);
        try(InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream()) {
            Scanner clientScanner = new Scanner(inputStream);
            PrintWriter printWriter = new PrintWriter(outputStream);
            while(true){
                System.out.printf("->");
                String requse = scanenr.next();
                printWriter.println(requse);
                printWriter.flush();
                String repouse = clientScanner.next();
                System.out.printf("req : %s ; reps : %s\n",requse,repouse);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main (String[] args) throws IOException {
        TcpEchoClient tcpEchoClient = new TcpEchoClient("127.0.0.1",9999);
        tcpEchoClient.start();
    }
}
