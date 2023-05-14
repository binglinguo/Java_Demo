package Demo;

import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-09 23:25
 **/
public class Demo2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        if(str1.length() > str2.length()){
            String t = str1;
            str1 = str2;
            str2 = t;
        }
        String maxStr = "";
        for(int i = 0;i < str1.length(); i++){
            for(int j = 0;j < str2.length(); j++){
                if(str1.charAt(i) == str2.charAt(j)){
                    StringBuilder strB = new StringBuilder();
                    int ret1 = i;
                    int ret2 = j;
                    while(ret1 < str1.length() && ret2 < str2.length()){
                        if(str1.charAt(ret1) == str2.charAt(ret2)){
                            strB.append(str2.charAt(ret2));
                        }else {
                            break;
                        }
                        ret1++;
                        ret2++;
                    }
                    if(maxStr.length() < strB.length()){
                        maxStr = strB.toString();
                    }
                }
            }
        }
        System.out.println(maxStr);
    }
}
