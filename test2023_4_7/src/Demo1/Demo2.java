package Demo1;

import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-07 21:05
 **/
public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String string2 = scanner.nextLine();
        int stringN = string.length();
        int string2N = string2.length();
        int i = 0;
        int j = 0;
        while(i < stringN && j < string2N) {
            if(string.charAt(i) != string2.charAt(j)) {
                char ch = string2.charAt(j);
                if(ch >= 'a' && ch <= 'z' ||
                        ch >= 'A' && ch <= 'Z' ||
                        ch >= '0' && ch <= '9') {
                    if(string.charAt(i) == '?') {
                        i++;
                        j++;
                    }else if(string.charAt(i) == '*'){
                        j++;
                    }else {
                        System.out.println(false);
                        return ;
                    }
                }else {
                    System.out.println(false);
                    return ;
                }
            }else {
                i++;
                j++;
            }
        }
        System.out.println(true);
    }
}
