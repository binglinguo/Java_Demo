package Demo;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-03 00:41
 **/
public class Demo4 {
    public static void fun(int n,List<Integer> list){
        for(int i = 2;i < n ; i++){
            if(n % i == 0){
                list.add(i);
            }
        }
        //System.out.println(list);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int low = scanner.nextInt();
        int[] array = new int[low + 1];
        for(int i = 0; i < low + 1; i++){
            array[i] = Integer.MAX_VALUE;
        }
        array[n] = 0;
        for(int i = n; i < low; i++){
            if(array[i] == Integer.MAX_VALUE){
                continue;
            }
            List<Integer> list = new LinkedList<>();
            fun(i,list);//将所有的约束存放到链表中
            if(list.size() == 0){
                continue;
            }
            for(int x : list){
                if(i + x <= low){
                    array[i + x] = Math.min(array[i + x],array[i] + 1);
                }
            }
        }
        if(array[low] == Integer.MAX_VALUE){
            System.out.println(-1);
        }else {
            System.out.println(array[low]);
        }
        //System.out.println(Arrays.toString(array));
    }
}
