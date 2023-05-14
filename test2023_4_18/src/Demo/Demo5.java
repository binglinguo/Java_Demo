package Demo;

import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-18 23:44
 **/
public class Demo5 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();
            if(a + b > c && a + c > b && b + c > a){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
