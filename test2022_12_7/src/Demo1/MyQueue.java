package Demo1;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 普通队列的使用 使用泛型来使用 Queue是LinkedList的父类
 * 因为Queue是接口，所以不能被实例化对象，想要使用必须创建他的子类的对象来使用Queue类型的来使用
 */
public class MyQueue {
    public static void main(String[] args) {
        Queue<Integer> qu=new LinkedList<>();
        qu.offer(1);
        System.out.println(qu.peek());
        qu.poll();
        System.out.println(qu.isEmpty());
    }
}
