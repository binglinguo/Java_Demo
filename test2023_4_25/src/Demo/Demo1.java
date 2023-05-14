package Demo;

import java.util.*;
/**
 * @Author: 冰激凌
 * @Date: 2023-04-25 22:58
 **/
//客似云来
public class Demo1 {
    public static void main(String[] args){
        long[] table = new long[81];
        table[0] = 0;
        table[1] = 1;
        for(int i = 2;i < 81; i++){
            table[i] = table[i - 1] + table[i - 2];
        }
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()){
            int from = scanner.nextInt();
            int end = scanner.nextInt();
            long sum = 0;
            for(int i = from; i <= end;i++){
                sum += table[i];
            }
            System.out.println(sum);
        }
    }
}
