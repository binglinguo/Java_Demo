package Demo;

import java.util.Stack;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-26 21:27
 **/
//简单括号匹配
public class demo1 {
    public boolean func(String str,int n){
        if(str == null || n == 0){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        int i = 0;
        while(i < n){
            char ch = str.charAt(i);
            if(ch == '('){
                stack.push(ch);
            }else if(ch == ')'){
                char top ;
                if(!stack.isEmpty()){
                    top = stack.pop();
                }else {
                    return false;
                }
                if(top != '('){
                    return false;
                }
            }else {
                return false;
            }
            i++;
        }
        return stack.isEmpty();
    }
}
