package Demo;

import java.util.Stack;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-18 19:52
 **/
//栈的压入 弹出序列
public class demo7 {
    public boolean IsPopOrder(int [] pushA, int [] popA) {
        int i = 0;
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        while(i < pushA.length && j < popA.length){
            stack.push(pushA[i]);
            while(!stack.isEmpty() && stack.peek() == popA[j] && j <= popA.length){
                j++;
                stack.pop();
            }
            i++;
        }
        return stack.isEmpty() && i == pushA.length && j == popA.length;
    }
}
