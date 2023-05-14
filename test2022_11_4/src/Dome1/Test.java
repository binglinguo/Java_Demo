package Dome1;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void space(String array){

    }
    //java实现将空格换为0
    public static void main(String[] args) {
        String array="Hello World Guo Bing Lin";

    }
    //给你一个整数数组 arr，请你判断数组中是否存在连续三个元素都是奇数的情况：如果存在，
    //请返回 true ；否则，返回 false 。
    public static boolean fun(int[] arr) {
        int count=3;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]%2!=0) {
                count--;
            }else {
                count=3;
            }
            if(count==0)return true;
        }
        return false;
    }
    public static void main8(String[] args) {

        int[] arr= {1,1,3,4,5,6,7,8};
        System.out.println(fun(arr));
    }
    //给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
    public static void main7(String[] args) {
        int[] array= {1,1,3,3,3,3,3,3,3,3,3,4,5,6,6,5,4};
        int n=0;
        int count=0;
        for(int i=0;i<array.length;i++) {
            if(count==0) {
                n=array[i];
            }
            if(n==array[i]) {
                count++;
            }
            else {
                count--;
            }

        }
        System.out.println(n);
    }
    //给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
    public static void main6(String[] args) {
        int[] array= {1,1,2,3,3,4,5,6,6,5,4};
        int m=0;
        for(int i=0;i<array.length;i++) {
            m^=array[i];
        }
        System.out.println(m);
    }
    //给定一个整数数组 nums 和一个整数目标值 target，
    //请你在该数组中找出 和为目标值 target 的那 两个 整数，并返回它们的数组下标。
    public static int[] func(int[] array,int target) {
        int[] nums=new int[2];
        for(int i=0;i<array.length-1;i++) {
            for(int j=i+1;j<array.length;j++) {
                if(array[i]+array[j]==target) {
                    nums[0]=i;
                    nums[1]=j;
                    return nums;
                }
            }
        }
        return nums;
    }
    public static void main5(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] array=new int[4];
        for(int i=0;i<array.length;i++) {
            array[i]=scanner.nextInt();
        }
        int target=scanner.nextInt();
        int[] nums=func(array,target);
        System.out.println(Arrays.toString(nums));

    }
    //给定一个整型数组, 实现冒泡排序(升序排序)
    public static void main4(String[] args) {
        int[] array= {12,32,52,11,2,5,3,4,9,10};
        int i=0;
        int j=0;
        for(i=0;i<array.length-1;i++) {
            for(j=0;j<array.length-i-1;j++) {
                if(array[j]>array[j+1]) {
                    int tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
    //给定一个有序整型数组, 实现二分查找
    public static boolean Binary(int[] array,int n) {
        int i=0;
        int j=array.length-1;
        while(i<j) {
            int mid=(i+j)/2;
            if(n>array[mid]) {
                i=mid+1;
            }
            else if(n<array[mid]) {
                j=mid-1;
            }
            else if(n==array[mid]){
                return true;
            }

        }
        return false;
    }
    public static void main3(String[] args) {
        int[] array= {1,2,3,4,5,6,7,8};
        boolean flag=Binary(array,12);
        System.out.println(flag);
    }
    //调整数组顺序使得奇数位于偶数之前。
    public static void arraypx(int[] array) {
        int i=0;
        int j=array.length-1;
        while(i<j) {
            if(array[i]%2==0) {
                while(array[j]%2==0&&j>i) {
                    j--;
                }
                if(j==i)break;
                int tmp=array[j];
                array[j]=array[i];
                array[i]=tmp;
            }
            i++;
        }
    }
    public static void main2(String[] args) {
        int[] array= {1,2,3,4,5,6};
        arraypx(array);
        System.out.println(Arrays.toString(array));
    }
    //实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 ,
    //并设置到对应的数组元素上. 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
    public static void transform(int[] array) {
        for(int i=0;i<array.length;i++) {
            array[i]*=2;
        }
    }
    public static void main1(String[] args) {
        int[] array= {1,2,3};
        transform(array);
        System.out.println(Arrays.toString(array));
    }
}
