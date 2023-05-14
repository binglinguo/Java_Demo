package Demo;

import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-21 23:32
 **/
public class Demo2 {
    public static void main(String[] args){
        String table = "VWXYZABCDEFGHIJKLMNOPQRSTU";
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str = scanner.nextLine();
            StringBuilder strbuilder = new StringBuilder(str);
            for(int i = 0;i < strbuilder.length(); i++){
                char ch = strbuilder.charAt(i);
                if(ch >= 'A' && ch <='Z'){
                    strbuilder.setCharAt(i,table.charAt((ch - 'A')));
                }
            }
            System.out.println(strbuilder);
        }
    }
}
