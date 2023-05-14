package Demo1;

import java.util.concurrent.PriorityBlockingQueue;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-13 15:27
 **/    
public class demo1 {
    public static void main (String[] args) {
        PriorityBlockingQueue<Integer> minHeao = new PriorityBlockingQueue<>();
        int a = 1;
        int b = 2;
        b = a * b++;
        System.out.println(b);
    }
}
