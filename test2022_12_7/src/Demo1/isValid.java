package Demo1;

import java.util.Stack;

/**
 * 有效的括号，使用泛型实现
 */
public class isValid {
    Stack<Character> stack=new Stack<>();
    public boolean isValid(String s) {
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='['||s.charAt(i)=='{'||s.charAt(i)=='('){
                stack.add(s.charAt(i));
            }else if(!stack.isEmpty()){
                if( s.charAt(i)=='}'&&stack.peek()=='{'||
                        s.charAt(i)==']'&&stack.peek()=='['||
                        s.charAt(i)==')'&&stack.peek()=='(')
                {
                    stack.pop();
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }
        return stack.isEmpty();
    }
}
