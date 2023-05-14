package Demo;

import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-10 22:24
 **/
public class Demo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] strs = new String[n];
        for (int i = 0; i < n; i++) {
            strs[i] = scanner.next();
        }
        boolean f1 = isEngilshSort(strs);
        boolean f2 = isLengthSort(strs);
        String ret = null;
        System.out.println(f2);
        if (f1 && f2) {
            ret = "both";
        } else if (f1 == false && f2 == true) {
            ret = "lengths";
        } else if (f1 == true && f2 == false) {
            ret = "lexicographically";
        } else {
            ret = "none";
        }
        System.out.println(ret);
    }
    //判断是否是字典排序方法
    public static boolean isEngilshSort(String[] strs) {
        for (int i = 0; i < strs.length - 1; i++) {
            if (strs[i].compareTo(strs[i + 1]) > 0) {
                return false;
            }
            if (strs[i] == null || strs[i + 1] == null) {
                return false;
            }
        }
        return true;
    }
    //判断是否是长度排列
    public static boolean isLengthSort(String[] strs) {
        for (int i = 0; i < strs.length - 1; i++) {
            if (strs[i] == null || strs[i + 1] == null) {
                return false;
            }
            if (strs[i].length() > strs[i + 1].length() ||
                    strs[i].length() == strs[i + 1].length()) {
                return false;
            }
        }
        if(strs[0].length() > strs[1].length()){
            return false;
        }
        return true;
    }
}
