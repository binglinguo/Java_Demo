package SocketDemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-05 11:12
 **/
public class TcpEchoCilent {
    private Socket socket = null;
    public TcpEchoCilent(String socketIP,int socketPort) throws IOException {
        socket = new Socket(socketIP,socketPort);
    }
    public void start() throws IOException {
        System.out.println("服务器连接成功");
        Scanner scanner = new Scanner(System.in);
        try(InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream()){
            Scanner scannerCilent = new Scanner(inputStream);
            PrintWriter printWriter = new PrintWriter(outputStream);
            while(true){
                System.out.printf("-->");
                String reques = scanner.nextLine();
                printWriter.println(reques);
                printWriter.flush();
                String reponse = scannerCilent.next();
                System.out.printf("req : %s, reps : %s\n",reques,reponse);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            socket.close();
        }
    }

    public static void main (String[] args) throws IOException {
        TcpEchoCilent tcpEchoCilent = new TcpEchoCilent("127.0.0.1",4561);
        tcpEchoCilent.start();
    }
}
