package Demo;

import java.util.Scanner;
import java.util.Stack;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-11 22:59
 **/
//扑克牌洗牌
public class Demo1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t > 0){
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] array = new int[2*n];
            for(int j = 0;j < 2*n;j++){
                array[j] = scanner.nextInt();
            }
            for(int i = 0;i < k; i++){
                int start = n - 1;
                int end = 2 * n - 1;
                Stack<Integer> stack = new Stack<>();
                while(start >= 0 && end >=n){
                    stack.push(array[end]);
                    stack.push(array[start]);
                    start--;
                    end--;
                }
                for(int j = 0;j < 2 * n;j++){
                    array[j] = stack.pop();
                }
            }
            for(int i = 0;i < 2 * n; i++){
                System.out.print(array[i] + " ");
            }
            System.out.println();
            t--;
        }
    }
}
