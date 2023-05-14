package Demo1;

import java.util.Stack;

/**
 *
 */
public class MinStack {
    private Stack<Integer> st1;
    private Stack<Integer> st2;
    public MinStack() {
        st1=new Stack<>(); 
        st2=new Stack<>();

    }
    //将元素val推入堆栈。
    public void push(int  val) {
        st1.add(val);
        if(st2.isEmpty()){
            st2.add(val);
        }else if(st2.peek()>=val){
            st2.add(val);
        }
    }
    //删除堆栈顶部的元素。
    public void pop() {
        int t=st1.pop();
        if(t==st2.peek()){
            st2.pop();
        }
    }
    //获取堆栈顶部的元素
    public int top() {
        if(st1.isEmpty()){
            return -1;
        }
        return st1.peek();
    }

    public int getMin() {
        if(st2.isEmpty()){
            return -1;
        }
        return st2.peek();
    }
}
