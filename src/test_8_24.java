
import java.util.Arrays;

public class test_8_24 {


    /**
     * 不规则的二维数组
     * @param args
     */
    public static void main4(String[] args) {
  /*      int[][] array={{1,2},{3,4,5}};
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }*/
        int[][] array=new int[2][];
        array[0]=new int[3];
        array[1]=new int[4];
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(array));
    }


    public static void main3(String[] args) {
        //二维数组输出
        int[][] arr={{1,2,3},{4,5,6}};//1
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("============");
        for (int[] ret:arr) {
            for (int x:ret) {
                System.out.print(x+" ");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(arr));
    }

    public static void main2(String[] args) {
        //java二维数组创建方式
        int[][] arr={{1,2,3},{4,5,6}};//1
        int[][] arr1=new int[][]{{1,2,3},{4,5,6}};//2
        int[][] arr2=new int[2][3];
    }


    public static void main1(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] arr1=arr.clone();
        arr[0]=99;
        System.out.println(arr1[0]);
    }
}
