package Demo;

import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-17 22:39
 **/
//快到 碗里来
public class Demo3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            double n = scanner.nextDouble();
            double r = scanner.nextDouble();
            if(n <= r * 2 * 3.14){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
