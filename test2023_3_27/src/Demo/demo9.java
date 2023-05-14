package Demo;

import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-27 23:39
 **/
public class demo9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] strs = new String[n];
        for(int i = 0;i < n; i++){
            strs[i] = scanner.nextLine();
        }
        if(n == 0){
            System.out.println("none");
            return ;
        }
        boolean f1 = true;//如果变为false则表示不是按照字典排序
        boolean f2 = true;//如果变为false则表示不是按照字符疮毒排列
        String ret = null;
        for(int i = 1; i < n ;i++){
            String s1 = strs[i - 1];
            String s2 = strs[i];
            if(f1 && !(s1.length() < s2.length())){
                f1 = false;
            }
            if(f2 && !(isSort(s1,s2) < 0)){
                f2 = false;
            }
            if(!f1 && !f2){
                ret = "none";
                break;
            }
        }
        if(ret == null){
            if(f1 && f2 ){
                ret = "both";
            }else if(f1 == true && f2 == false){
                ret = "lengths";
            }else{
                ret = "lexicographically";
            }
        }
        System.out.println(ret);

    }
    public static int isSort(String s1,String s2){
        return s1.compareTo(s2);
    }
}
