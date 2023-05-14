package LinkListStack;
import java.util.*;

class Node{
    public  int val;
    public Node next;

    public Node(int val) {
        this.val = val;
        this.next = null;
    }
}
class LinkListStack{
    public Node front;
    public Node rear;

    public  boolean IsEmpty(){
        return front==null;
    }

    public void insert(int data){//压入栈
        Node newStack=new Node(data);
        if(IsEmpty()){//如果是空栈
            front=newStack;
            rear=newStack;
        }else {
            rear.next=newStack;
            rear=newStack;
        }

    }

    public void pop(){
        if(IsEmpty()){
            System.out.println("栈为空栈");
            return ;
        }else {
            Node cur=front;
            while(cur!=rear&&cur.next!=rear){
                cur=cur.next;
            }
            if(cur==front){
                front=null;
                rear=null;
            }else {
                cur.next=null;
            }
            rear=cur;//弹出栈
        }
    }

    public void print_Stack(){
        if(IsEmpty()){
            System.out.println("当前栈为空栈");
            return ;
        }
        System.out.println(rear.val+"  ");
        pop();
    }
}
public class Test {
    public static void mune(){
        System.out.println("0->退出");
        System.out.println("1->压栈");
        System.out.println("2->弹栈");
        System.out.println("3->打印并弹出");
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        LinkListStack stack=new LinkListStack();
        int input=0;
        while(true){
            mune();
            input=scanner.nextInt();
            switch(input){
                case 0:return;
                case 1:{
                    System.out.println("请输入要压入栈的值");
                    int data=scanner.nextInt();
                    stack.insert(data);
                    break;
                }
                case 2:stack.pop();break;
                case 3:stack.print_Stack();break;
            }
        }

    }

}
