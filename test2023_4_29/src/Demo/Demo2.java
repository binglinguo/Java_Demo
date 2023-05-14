package Demo;

import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-29 23:30
 **/
public class Demo2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String s = scanner.nextLine();
            char[] array = s.toCharArray();
            StringBuilder str = new StringBuilder();
            for(int i = 0;i < array.length; i++){
                char ch = array[i];
                if(ch >= 'A' && ch <='Z'){
                    if(ch >= 'A' && ch <= 'E'){
                        ch += 21;
                    }else {
                        ch -= 5;
                    }
                }
                str.append(ch);
            }
            System.out.println(str);
        }
    }

}
