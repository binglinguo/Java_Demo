package test;

import java.util.Scanner;
import java.util.Stack;

/**
 * @Author: 冰激凌
 * @Date: 2023-05-11 23:13
 **/
//Emacs计算器
public class Demo1 {
    // write your code here
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = Integer.parseInt(scanner.nextLine());
            String str = scanner.nextLine();
            Stack<Integer> stack = new Stack<>();
            String[] strs = str.split(" ");
            for(int i = 0 ;i < strs.length; i++){
                if(strs[i].equals("+")||strs[i].equals("-")||
                        strs[i].equals("*") || strs[i].equals("/")){
                    if(stack.isEmpty()){
                        return ;
                    }
                    int a = stack.pop();
                    int b = stack.pop();
                    int c = 0;
                    switch(strs[i]){
                        case "+" : c = a + b;break;
                        case "-" : c = b - a;break;
                        case "*" : c = b * a;break;
                        case "/" : c = b / a;break;
                    }
                    stack.push(c);
                }else {
                    stack.push(Integer.parseInt(strs[i]));
                }
            }
            int num = stack.pop();
            System.out.println(num);
        }
        scanner.close();
    }
}
