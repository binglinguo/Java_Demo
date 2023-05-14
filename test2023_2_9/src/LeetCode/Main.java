package LeetCode;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-09 20:40
 **/
import java.util.*;

public class Main{
    public static void func(String str1,String str2){
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < str2.length(); i++){
            set.add(str2.charAt(i));
        }
        for(int i =0; i < str1.length() ; i++){
            if(!set.contains(str1.charAt(i))){
                System.out.print(str1.charAt(i));
                set.add(str1.charAt(i));
            }
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();
            func(str1,str2);
        }
    }
}
