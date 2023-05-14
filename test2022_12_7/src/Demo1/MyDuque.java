package Demo1;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 双端队列的泛型使用 可以对两头都进行入队和出队，也可以用来模拟一个栈的使用！
 *
 */
public class MyDuque {
    public static void main(String[] args) {
        Deque<Integer> deque=new LinkedList<>();
        deque.offerFirst(1);
        deque.offerLast(2);
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        System.out.println(deque.isEmpty());
    }
}
