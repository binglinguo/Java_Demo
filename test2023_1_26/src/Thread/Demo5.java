package Thread;

import java.util.Scanner;

public class Demo5 {
    private static  int fly = 1;
    public static void main (String[] args) {
        Thread t = new Thread(() -> {
            while (fly == 1) {

            }
            System.out.println("t线程结束 ");
        });
        t.start();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输如fly要修改的值");
        fly= scanner.nextInt();
        System.out.println("main线程结束");
    }
}
