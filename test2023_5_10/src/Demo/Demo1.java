package Demo;

import java.util.Scanner;
import java.util.Stack;

/**
 * @Author: 冰激凌
 * @Date: 2023-05-10 22:57
 **/
//最长上升子序列 error  过不了全部用例
public class Demo1 {
    // write your code here
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int[] arr = new int[n];
            int max = 0;
            for(int i  = 0;i < n; i++){
                arr[i] = scanner.nextInt();
            }
            Stack<Integer> stack = new Stack<>();
            for(int i = 0;i < n; i++){
                if(stack.isEmpty()){
                    stack.push(arr[i]);
                }else{
                    if(stack.peek() <= arr[i]){
                        stack.push(arr[i]);
                    }else {
                        while(!stack.isEmpty() && stack.peek() > arr[i]){
                            stack.pop();
                        }
                        stack.push(arr[i]);
                    }
                }
                max = Math.max(stack.size(),max);
            }
            System.out.println(max);
        }
    }

}
