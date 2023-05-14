package Demo1;

public class Main {
    public static void main(String[] args) {
        myStack mystack=new myStack();
        mystack.push(1);
        mystack.push(2);
        mystack.push(3);
        mystack.push(4);
        mystack.push(5);
        mystack.push(1);
        System.out.println(mystack.peek());
        System.out.println(mystack.pop());
        System.out.println(mystack.peek());
    }
}
