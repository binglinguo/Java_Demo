package Code;

import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-22 22:58
 **/
//回文数索引
public class demo9 {
    public static int isIndex(char[] array, int i, int j) {
        if (array[i + 1] == array[j]) {
            return i;
        } else {
            return j;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.valueOf(scanner.nextLine());

        while (size > 0) {
            String str = scanner.nextLine();
            int i = 0;
            int j = str.length() - 1;
            int ret = -1;
            while (i < j) {
                if (str.charAt(i) == str.charAt(j)) {
                    i++;
                    j--;
                } else {
                    ret = isIndex(str.toCharArray(), i, j);
                    break;
                }
            }
            System.out.println(ret);
            size--;

        }
    }
}
