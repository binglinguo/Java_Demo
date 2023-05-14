package Demo;

import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-05-08 22:07
 **/
//最大线程个数
public class Demo1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int max = 0;
            int size = 0;
            while(n > 0){
                n--;
                String id = scanner.next();
                String cs = scanner.next();
                if(cs.equals("connect")){
                    size++;
                }else if(cs.equals("disconnect")){
                    size--;
                }
                max = Math.max(size,max);
            }
            System.out.println(max);
        }

    }
}
