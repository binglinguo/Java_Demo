package Demo;

import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-22 00:06
 **/
public class Demo4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str = scanner.nextLine();
            String[] strs = str.split("<br/>");
            for(String s : strs){
                int n = Integer.parseInt(s);
                int count = 0;
                for(int i = 2;i <= Math.sqrt(n); i++){
                    if(n % i == 0){
                        while(n % i == 0){
                            n /= i;
                        }
                        count++;
                    }
                }
                System.out.println(count);
            }
        }
    }
}
