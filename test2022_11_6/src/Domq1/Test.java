package Domq1;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String arr="11";
        String arr1=new String("11");
        System.out.println(arr==arr1);
    }
    public static void main6(String[] args) {
        String arr="11";
        String arr1=new String("1")+new String("1");
        arr1.intern();
        System.out.println(arr==arr1);
    }
    public static void main5(String[] args) {
        String arr="11";
        String arr1=new String("1")+new String("1");
        System.out.println(arr==arr1);
    }
    public static void main4(String[] args) {
        String arr="hello";
        String arr1="he"+"llo";
        System.out.println(arr==arr1);
        System.out.println("=============");
        String arr2="he";
        String arr3=arr2+"llo";
        System.out.println(arr==arr3);
        System.out.println("============");
        final String arr4="he";
        String arr5=arr4+"llo";
        System.out.println(arr==arr5);
    }
    public static void main3(String[] args) {
        String arr="hello";
        String arr1="hello";
        System.out.println(arr1==arr);
    }
    public static void main2(String[] args) {
        String arr="hello";
        String arr1=new String("hello");
        System.out.println(arr);
        System.out.println(arr1);
        System.out.println(arr==arr1);
    }
    public static void main1(String[] args) {
        int[][] array=new int[2][3];
        int[][] array1={{1,2},{1,2,3,4}};
        int[][] array2=new int[][]{{1,2},{1,2,3,4}};
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                System.out.print(array[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println("===============");

        for (int[] ret:array1) {
            for (int x:ret) {
                System.out.print(x+"  ");
            }
            System.out.println();
        }
        System.out.println("===============");
        System.out.println(Arrays.deepToString(array2));
    }
}
