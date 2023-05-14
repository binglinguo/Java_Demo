package Demo1;

import java.util.Stack;

public class Test {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
    Stack<Integer> stack = new Stack<>();
    int j=0;
    for(int i=0;i<pushA.length;i++){
        stack.push(pushA[i]);
        while(j<popA.length&&!stack.isEmpty()&&stack.peek()==popA[j]){
            j++;
            stack.pop();
        }
    }
    return j==popA.length&&stack.empty();
}
    public boolean IsPopOrder2(int[] pushA, int[] popA) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        int j = 0;
        while (i < pushA.length) {
            if (pushA[i] != popA[j]) {
                stack.push(Integer.parseInt(String.valueOf(pushA[i])));
                i++;
                continue;
            }
            stack.push(Integer.parseInt(String.valueOf(pushA[i])));
            i++;
            while (!stack.isEmpty() && j < popA.length && stack.peek() == popA[j]) {
                // if(stack.isEmpty()){
                //     break;
                // }
                stack.pop();
                j++;
            }
        }
        if (stack.isEmpty()) return true;
        else return false;
    }

    public boolean IsPopOrder1(int [] pushA,int [] popA) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        int j = 0;
        while (i < pushA.length) {
            if (pushA[i] != popA[j]) {
                stack.push(Integer.parseInt(String.valueOf(pushA[i])));
                i++;
            }
        }
        return false;
    }
    public static void main1(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
