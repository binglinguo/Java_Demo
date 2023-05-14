package Thread;

import java.util.Random;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-16 18:37
 **/
/*
给定一个很长的数组 (长度 1000w), 通过随机数的方式生成 1-100 之间的整数.
实现代码, 能够创建两个线程, 对这个数组的所有元素求和.
其中线程1 计算偶数下标元素的和, 线程2 计算奇数下标元素的和.
最终再汇总两个和, 进行相加
记录程序的执行时间.
 */
public class demo1 {
    public static int t1Sum = 0;
    public static int t2Sum = 0;
    public static void main (String[] args) throws InterruptedException {
        int[] array = new int[1000_0000];
        Random random = new Random();
        for(int i = 0;i < array.length; i++){
            array[i] = random.nextInt() % 100 + 1;
        }

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
        int sum = t1Sum + t2Sum;
        System.out.println(sum);
    }
}
