package Thread;

import java.util.Random;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-19 10:22
 **/
public class thread1 {
    public static int t1Sum = 0;
    public static int t2Sum = 0;
    public static void main (String[] args) throws InterruptedException {
        int[] array = new int[1000_0000];
        Random random = new Random();
        for(int i = 0;i < array.length; i++){
            array[i] = random.nextInt() % 100 + 1;
        }
        long time = System.currentTimeMillis();
        Thread t1 = new Thread(()->{
            for (int i = 0 ; i < array.length ; i+=2) {
                t1Sum += array[i];
            }
        });
        Thread t2 = new Thread(()->{
            for (int i = 1 ; i < array.length ; i+=2) {
                t2Sum += array[i];
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        long timeEnd = System.currentTimeMillis();
        int sum = t1Sum + t2Sum;
        System.out.println( sum + " 使用时间 ： "+(timeEnd - time) +"ms");
    }
}
