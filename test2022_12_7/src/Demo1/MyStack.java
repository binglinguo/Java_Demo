package Demo1;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    Queue<Integer> queue1=new LinkedList<>();
    Queue<Integer> queue2=new LinkedList<>();
    public MyStack() {

    }
    //将元素 x 压入栈顶。
    public void push(int x) {
        if(!queue1.isEmpty()){
            queue1.offer(x);
        }else {
            queue2.offer(x);
        }
    }
    // 移除并返回栈顶元素。
    public int pop() {
        if(!queue1.isEmpty()){
            int size=queue1.size();
            for(int i=0;i<size-1;i++){
                queue2.offer(queue1.poll());

            }
            return queue1.poll();
        }else {
            int size=queue2.size();
            for(int i=0;i<size-1;i++){
                queue1.offer(queue2.poll());

            }
            return queue2.poll();
        }
    }
    //返回栈顶元素。
    public int top() {
        if(empty()){
            return -1;
        }
        int val=0;
        if(!queue1.isEmpty()){
            int size=queue1.size();

            for(int i=0;i<size;i++){
                val=queue1.poll();
                queue2.offer(val);
            }
        }else {
            int size=queue2.size();

            for(int i=0;i<size;i++){
                val=queue2.poll();
                queue1.offer(val);
            }

        }
        return val;
    }
    // 如果栈是空的，返回 true ；否则，返回 false
    public boolean empty() {
        return queue1.isEmpty()&&queue2.isEmpty();
    }
}
