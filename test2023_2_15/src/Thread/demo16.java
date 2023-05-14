package Thread;

import java.util.Scanner;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-15 22:54
 **/
public class demo16 {
    static int val = 0;
    public static void main (String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        //int val = 0; 线程中不可以引用局部变量中的值 除非是静态的

        Thread t1 = new Thread(()-> {
            while( val == 0){
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        System.out.println("请输入一个val的值");
        val = scanner.nextInt();
        t1.join();
        System.out.println("线程结束");
    }
}
