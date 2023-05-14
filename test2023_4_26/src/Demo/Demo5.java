package Demo;

import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-26 23:17
 **/
public class Demo5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            scanner.nextLine();
            StringBuilder strs = new StringBuilder();
            while(n > 0){
                String s = scanner.nextLine();
                StringBuilder str = new StringBuilder();
                if(s.indexOf(",") != -1 || s.indexOf(" ") != -1){
                    str.append("\"");
                    str.append(s);
                    str.append("\"");
                }else {
                    str.append(s);
                }
                strs.append(str);
                n--;
                if(n > 0){
                    strs.append(", ");
                }
            }
            System.out.println(strs);
        }
    }
}
