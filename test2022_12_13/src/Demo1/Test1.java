package Demo1;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        final int array[] = {1,2,3,4,5};
        array[0] = 100;
        System.out.println(Arrays.toString(array));
        String str="abc";
        String str1=new String ("abc");
        System.out.println(str==str1);
        String str2="hello";
        //str2.charAt(0)="1";
// array = new int[]{4,5,6}; // 编译报错：Error:(19, 9) java: 无法为最终变量array分配值
    }
}
