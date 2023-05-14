package Socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-05-14 20:49
 **/
public class TCPEchoClient {
    private Socket socket;

    public TCPEchoClient(String ip,int port) throws IOException {
        socket = new Socket(ip,port);
    }

    public void start(){
        System.out.println("客户端已经连接成功");
        Scanner scanner = new Scanner(System.in);
        try(InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream()) {
            Scanner SocketScanner = new Scanner(inputStream);
            PrintWriter printWriter = new PrintWriter(outputStream);
            while(true){
                System.out.printf("-->");
                String requse = scanner.next();
                printWriter.println(requse);
                printWriter.flush();
                String repouse = SocketScanner.next();
                System.out.printf("req : %s : reps : %s\n",requse,repouse);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main (String[] args) throws IOException {
        TCPEchoClient tcpEchoClient = new TCPEchoClient("127.0.0.1",8878);
        tcpEchoClient.start();
    }
}
