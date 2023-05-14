package LeetCode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Test {

    /**
     * 有效的括号
     */
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        int i=0;
        for(i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('||ch=='['||ch=='{'){
                stack.push(ch);
            }else {
                if(stack.isEmpty()){
                    return false;
                }
                char ch1=stack.peek();
                if(ch==')'&&ch1=='('||ch=='}'&&ch1=='{'||ch==']'&&ch1=='['){
                    stack.pop();
                }else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    /**
     * 最小元素栈
     */
    Stack<Integer> stack;
    Stack<Integer> minStack;
    public Test() {
        stack=new Stack<>();
        minStack=new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty()){
            minStack.push(val);
        }else {
            if(val<=minStack.peek()){
                minStack.push(val);
            }
        }
    }

    public void pop() {
        if(stack.isEmpty()){
            return ;
        }
        int n=stack.pop();
        if(!minStack.isEmpty()&&minStack.peek().equals(n)){
            minStack.pop();
        }
    }

    public int top() {
        if(!stack.isEmpty()){
            return stack.peek();
        }else{
            return -1;
        }
    }

    public int getMin() {
        if(!minStack.isEmpty()){
            return minStack.peek();
        }else {
            return -1;
        }
    }
}
