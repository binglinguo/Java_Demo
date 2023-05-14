package Demo;

import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-20 21:07
 **/
//逆置单词顺序
public class demo3 {
    public static void reversal(char[] strs,int left,int right){
        while(left < right){
            char tmp = strs[left];
            strs[left] = strs[right];
            strs[right] = tmp;
            left++;
            right--;
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str = scanner.nextLine();
            char[] strs = new char[str.length()];
            for( int i = 0 ;i < str.length() ; i++){
                strs[i] = str.charAt(i);
            }
            reversal(strs,0,strs.length-1);
            int left = 0;
            int i = 0;
            for(i = 0 ; i < strs.length ; i++){
                if(strs[i] == ' '){
                    reversal(strs,left,i-1);
                    left = i + 1;
                }
            }
            reversal(strs,left,i-1);
            str = new String(strs);
            System.out.println(str);
        }
    }
}
