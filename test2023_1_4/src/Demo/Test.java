package Demo;

import java.util.Stack;

public class Test {
    //    Stack<Integer> stack;
//    Stack<Integer> minStack;
//    public MinStack() {
//        stack=new Stack<>();
//        minStack=new Stack<>();
//    }
//
//    public void push(int val) {
//        stack.push(val);
//        if(minStack.isEmpty()){
//            minStack.push(val);
//        }else {
//            if(val<=minStack.peek()){
//                minStack.push(val);
//            }
//        }
//    }
//
//    public void pop() {
//        if(stack.isEmpty()){
//            return ;
//        }
//        int n=stack.pop();
//        if(!minStack.isEmpty()&&minStack.peek().equals(n)){
//            minStack.pop();
//        }
//    }
//
//    public int top() {
//        if(!stack.isEmpty()){
//            return stack.peek();
//        }else{
//            return -1;
//        }
//    }
//
//    public int getMin() {
//        if(!minStack.isEmpty()){
//            return minStack.peek();
//        }else {
//            return -1;
//        }
//    }
//}
    public class Solution {
        public boolean IsPopOrder (int[] pushA , int[] popA) {
            Stack<Integer> stack = new Stack<>();
            int k = 0;
            for (int i = 0 ; i < pushA.length ; i++) {
                stack.push(pushA[i]);
                while (! stack.isEmpty() && k < popA.length && popA[k] == (stack.peek())) {
                    stack.pop();
                    k++;
                }
            }
            return stack.isEmpty();
        }

        public boolean isValid (String s) {
            Stack<Character> stack = new Stack<>();
            int i = 0;
            for (i = 0; i < s.length() ; i++) {
                char ch = s.charAt(i);
                if (ch == '(' || ch == '[' || ch == '{') {
                    stack.push(ch);
                } else {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    char ch1 = stack.peek();
                    if (ch == ')' && ch1 == '(' || ch == '}' && ch1 == '{' || ch == ']' && ch1 == '[') {
                        stack.pop();
                    } else {
                        return false;
                    }

                }
            }
            return stack.isEmpty();
        }

        public void main (String[] args) {
            String s = "(){}[]";
            System.out.println(isValid(s));
        }

        public int evalRPN (String[] tokens) {
            Stack<Integer> stack = new Stack<>();
            for (int i = 0 ; i < tokens.length ; i++) {
                if (tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")) {
                    String s = tokens[i];
                    int nums1 = stack.pop();
                    int nums2 = stack.pop();
                    switch (s) {
                        case "+":
                            stack.push(nums2 + nums1);
                            break;
                        case "-":
                            stack.push(nums2 - nums1);
                            break;
                        case "*":
                            stack.push(nums2 * nums1);
                            break;
                        case "/":
                            stack.push(nums2 / nums1);
                            break;
                    }
                } else {
                    stack.push(Integer.parseInt(tokens[i]));
                }
            }
            return stack.pop();
        }
//    public void func(ListNode head){
//        if(head==null){
//            return ;
//        }
//        return func(head.next);
//        System.out.println(head.val);
//    }
    }
}
