package Dome1;

import java.util.Scanner;
class StackByArray{//以数组模拟堆栈的类声明
    private int[] stack;
    private int top;

    public StackByArray(int stacksize) {
        stack=new int[stacksize];
        top=-1;//-1代表无数据
    }
    public boolean push(int data){//压入堆栈元素
        if(top>stack.length){
            System.out.println("堆栈已满，无法再压入");
            return false;
        } else {
          stack[++top]=data;
          return true;
        }
    }

    public boolean empet(){//判断堆栈是否为空栈
        if(top==-1)return true;
        else return false;
    }

    public int pop(){//从栈顶弹出数据
        if(empet()){
            System.out.println("栈为空，无法弹出");
            return -1;//此处-1为代表空栈
        }
        else{
            return stack[top--];
        }
    }
}
public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=10;
        StackByArray stack=new StackByArray(n);
        System.out.println("请按照要压入栈的顺序输入10个数字");
        while(n>0){
            int val=scanner.nextInt();
            if(!stack.push(val)){
                System.out.println("压入失败");
                break;
            }
            n--;
        }

        System.out.println("================");
        System.out.println("下面为取出栈帧中的值");
        while(!stack.empet()){
            System.out.print(stack.pop()+" ");
        }

    }

}
