package Demo1;

import java.util.Stack;

public class Test {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")||tokens[i].equals("-")||tokens[i].equals("*")||tokens[i].equals("/")){
                int nums2=stack.pop();
                int nums1=stack.pop();
                switch(tokens[i]){
                    case "+":stack.push(nums1+nums2);break;
                    case "-":stack.push(nums1-nums2);break;
                    case "*":stack.push(nums1*nums2);break;
                    case "/":stack.push(nums1/nums2);break;
                }
            }else{
                stack.push(Integer.parseInt(tokens[i]));
            }

        }
        return stack.pop();
    }
}
