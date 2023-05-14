package Demo;
import java.util.*;
/**
 * @Author: 冰激凌
 * @Date: 2023-03-23 22:49
 **/
//统计回文
public class demo5 {
    public static boolean ispalid(StringBuilder str){
        if(str == null){
            return false;
        }
        int start = 0;
        int end = str.length() - 1;
        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String A = scanner.nextLine();
            String B = scanner.nextLine();
            StringBuilder str = new StringBuilder();
            if(A == null || B == null){
                System.out.println(0);
                return ;
            }
            int n = 0;
            int count = 0;
            for(int i = 0; i < A.length() ; i++){
                for(int j = 0; j < A.length() ; j++){
                    if(i == j){
                        str.append(B);
                    }
                    str.append(A.charAt(j));
                }
                if(ispalid(str)){
                    count++;
                }
                //System.out.println(str);
                str.delete(0,str.length());
            }
            str.append(A);
            str.append(B);
            if(ispalid(str)){
                count++;
            }
            System.out.println(count);
        }
    }
}
