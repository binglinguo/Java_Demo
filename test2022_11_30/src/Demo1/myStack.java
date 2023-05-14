package Demo1;

import java.util.Arrays;

public class myStack {
    public int[] elem;
    public int usedSize;

    public myStack(){
        this.elem=new int[5];
        this.usedSize=0;
    }
    //压栈
    public void push(int val){
        if(isFull()){
            this.elem= Arrays.copyOf(this.elem,this.elem.length*2);
        }
        this.elem[this.usedSize]=val;
        this.usedSize++;
    }
    //检查是否满栈
    public boolean isFull(){
        return this.usedSize==this.elem.length;
    }
    //获取栈顶元素
    public int peek(){
        if (isEmpty()){
            throw new RuntimeException("栈为空！");
        }
        return this.elem[this.usedSize-1];
    }

    //获取并弹栈
    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("栈为空！");
        }
        int t=this.elem[this.usedSize-1];
        this.usedSize--;
        return t;
    }

    //判断栈是否为空
    public boolean isEmpty(){
        return this.usedSize==0;
    }
}
