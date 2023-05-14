package Demo;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-05-08 22:07
 **/
//Linux指令计算
public class Demo2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            String[] strs = new String[n];
            for(int i = 0;i < strs.length; i++){
                strs[i] = scanner.next();
            }
            Arrays.sort(strs);
            List<String> list = new LinkedList<>();
            for(int i = 1;i < strs.length;i++){
                if(!strs[i].startsWith(strs[i - 1] + '/')){
                    list.add(strs[i - 1]);
                }
            }
            list.add(strs[n - 1]);
            for(String s : list){
                System.out.println("mkdir -p " + s);
            }
            System.out.println();
        }
    }
}
