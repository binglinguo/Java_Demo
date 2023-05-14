package Demo;

import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-06 20:28
 **/
public class demo1 {
    int[] array = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};//表示所有牌 小王代表14 大王代表15
    public static int fun(StringBuilder s){
        //首先判断是否存在大小王
        boolean flg = false;
        boolean max = false;
        for(int i = 0;i < s.length(); i++){
            if(s.charAt(i) == 'j'){
                if(i + 1 < s.length() && s.charAt(i + 1) == 'o'){
                    if(flg){
                        return 888;
                    }else {
                        flg = true;
                    }
                }
            }else if(s.charAt(i) == 'J'){
                if(i + 2 < s.length() && s.charAt(i + 2) == 'O'){
                    if(flg){
                        return 888;
                    }else {
                        flg = true;
                    }
                }
            }
        }
        return 1;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        int i = 0;
        for(;i < str.length(); i++){
            if(str.charAt(i) == '-'){
                break;
            }
            s1.append(str.charAt(i));
        }
        i++;
        for(;i < str.length(); i++){
            s2.append(str.charAt(i));
        }
        //寻找最大值喽
        int s1Con = fun(s1);
        int s2Con = fun(s2);
        if(s1Con == 999){
            System.out.println(s1);
        }else if(s2Con == 999){
            System.out.println(s2);
        }
    }
}
