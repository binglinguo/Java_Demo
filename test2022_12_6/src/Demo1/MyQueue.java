package Demo1;

import java.util.Queue;
import java.util.Stack;

/**
 * 使用两个堆栈来模拟队列
 */

public class MyQueue {
    public Stack<Integer> st1=new Stack<>();
    public Stack<Integer> st2=new Stack<>();
    public MyQueue() {

    }

    public void push(int x) {
        st1.push(x);
    }

    public int pop() {
        if(empty()){
            return -1;//-1表示两个栈都为空
        }
        if(st2.isEmpty()){
            while(!st1.isEmpty()){
                int val=st1.pop();
                st2.push(val);
            }
        }
        return st2.pop();
    }

    public int peek() {
        if(st1.isEmpty()&&st2.isEmpty()){
            return -1;//-1表示两个栈都为空
        }
        if(st2.isEmpty()){
            while(!st1.isEmpty()){
                int val=st1.pop();
                st2.push(val);
            }
        }
        return st2.peek();
    }

    public boolean empty() {
        return st1.isEmpty()&&st2.isEmpty();
    }
}
