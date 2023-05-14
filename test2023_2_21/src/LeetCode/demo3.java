package LeetCode;

import java.util.Stack;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-21 23:42
 **/
//比较含退格字符
public class demo3 {
    public void trav(String s,Stack<Character> stack){
        for(int i = 0 ; i < s.length(); i++){
            if(s.charAt(i) == '#'){
                if(!stack.empty()){
                    stack.pop();
                }
            }else {
                stack.push(s.charAt(i));
            }
        }
    }
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stacks = new Stack<>();
        Stack<Character> stackt = new Stack<>();
        trav(s,stacks);
        trav(t,stackt);
        while(!stacks.empty()&&!stackt.empty()){
            if(!stacks.pop().equals(stackt.pop())){
                return false;
            }
        }
        return stacks.empty() && stackt.empty();
    }
}
