package Demo;

import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-10 21:25
 **/
public class Demo2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        int max = 0;
        for(int i = 0;i < str1.length(); i++){
            for(int j = 0;j < str2.length(); j++){
                if(str1.charAt(i) == str2.charAt(j)){
                    int cur1 = i;
                    int cur2 = j;
                    int count = 0;
                    while(cur1 < str1.length() && cur2 < str2.length()){
                        if(str1.charAt(cur1) != str2.charAt(cur2)){
                            break;
                        }
                        count++;
                        cur1++;
                        cur2++;
                    }
                    max = Math.max(max,count);
                }
            }
        }
        System.out.println(max);
    }
}
