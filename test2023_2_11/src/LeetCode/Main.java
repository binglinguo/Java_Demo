package LeetCode;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-11 17:05
 **/
import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    /**
     * 点击消除 牛客
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String str = in.nextLine();
            Stack<Character> stack = new Stack<>();
            for(int i = 0; i < str.length(); i++){
                if(stack.isEmpty()){
                    stack.add(str.charAt(i));
                }else {
                    if(str.charAt(i) == stack.peek()){
                        stack.pop();
                    }else {
                        stack.add(str.charAt(i));
                    }
                }
            }
            if(stack.isEmpty()){
                System.out.print("0");
                return ;
            }
            List<Character> list = new ArrayList<>();
            while(!stack.isEmpty()){
                list.add(stack.pop());
            }
            Collections.reverse(list);
            for(int i = 0;i < list.size() ;i++){
                System.out.print(list.get(i));
            }
        }
    }
}
