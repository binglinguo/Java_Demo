package Demo;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-20 21:07
 **/
//排序子序列
import java.util.*;
public class demo4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int[] array = new int[n + 1];
            for( int i = 0; i < n ; i++){
                array[i] = scanner.nextInt();
            }
            int count = 0;
            int i = 0;
            while(i < n){
                if(i < n && array[i] > array[i + 1]){
                    while(i < n && array[i] > array[i + 1]){
                        i++;
                    }
                    i++;
                    count++;
                }else if(i < n && array[i] == array[i + 1]){
                    while(i < n && array[i] == array[i + 1]){
                        i++;
                    }
                }else {
                    while(i < n && array[i] < array[i + 1]){
                        i++;
                    }
                    i++;
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
