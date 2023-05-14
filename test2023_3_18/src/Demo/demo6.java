package Demo;

import java.util.Deque;
import java.util.Stack;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-18 19:01
 **/
//最小元素栈
public class demo6 {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int node) {
        if(minStack.isEmpty() || node <= minStack.peek()){
            minStack.push(node);
        }
        stack.push(node);
    }

    public void pop() {
        if(stack.isEmpty()){
            return ;
        }
        int ret = stack.pop();
        if(!minStack.isEmpty() && ret == minStack.peek()){
            minStack.pop();
        }
    }

    public int top() {
        if(stack.isEmpty()){
            return -1;
        }
        return stack.peek();
    }

    public int min() {
        if(!minStack.isEmpty()){
            int ret = minStack.peek();
            return ret;
        }
        return -1;
    }
}
