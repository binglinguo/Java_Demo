package Demo;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-26 22:53
 **/
//有假币
import java.util.*;
public class Demo3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            if(n == 0){
                break;
            }
            int count = 0;
            while(n >= 2){
                n = (int) Math.ceil(1.0 * n / 3);
                count++;
            }
            System.out.println(count);
        }
    }

}
