


import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;

import java.util.Arrays;
import java.util.Scanner;

public class test_8_22 {

    //实现一个方法 toString, 把一个整型数组转换成字符串. 例如数组 {1, 2, 3} ,
    // 返回的字符串为 "[1, 2, 3]", 注意 逗号 的位置和数量.
    public static String my1_toString(int[] array){
        String str="[";
        for (int i = 0; i <array.length ; i++) {
            str+=array[i];
            if(i<array.length-1){
                str+=",";
            }
        }
        str+="]";
        return str;
    }
    public static void main20(String[] args) {
        int[] array={1,2,3};
        System.out.println(my1_toString(array));
    }


    //实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组.
    public static int[] copyOf(int[] array){
        int[] ret=new int[array.length];
        for (int i = 0; i < array.length; i++) {
            ret[i]=array[i];
        }
        return ret;
    }
    public static void main19(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9};
        int[] ret=copyOf(array);
        System.out.println(Arrays.toString(ret));
    }


    //给定一个有序整型数组, 实现二分查找
    public static void main18(String[] args) {
        int[] array={1,2,3,5,6,7,50};
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int j=array.length-1;
        int i=0;
        while(i<j){
            if(array[(i+j)/2]==n){
                break;
            }
            else if(n>array[(i+j)/2]){
                i=(i+j)/2+1;
            }
            else j=(i+j)/2-1;
        }
        if(i<j){
            System.out.println((i+j)/2);
        }
        else System.out.println("-1");
    }

    //给定一个整型数组, 判定数组是否有序（递增）
    public static void main17(String[] args) {
        int[] array={1,2,3,4,5};
        int i=0;
        for (i = 0; i <array.length-1 ; i++) {
            if(array[i]>array[i+1]){
                break;
            }
        }
        if(i==array.length-1){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }


//给定一个整型数组, 实现冒泡排序(升序排序)
public static void main16(String[] args) {
    int[] arrar={5,6,4,3,2,1,8,7,9};
    for (int i = 0; i <arrar.length-1 ; i++) {
        for (int j = 0; j <arrar.length-i-1 ; j++) {
            if(arrar[j]>arrar[j+1]){
                int tmp=arrar[j];
                arrar[j]=arrar[j+1];
                arrar[j+1]=tmp;
            }
        }
    }
    System.out.println(Arrays.toString(arrar));
}



    //创建一个 int 类型的数组, 元素个数为 100, 并把每个元素依次设置为 1 - 100
    public static void main15(String[] args) {
        int[] array=new int[100];
        for (int i = 0; i <array.length ; i++) {
            array[i]=i+1;
        }
        System.out.println(Arrays.toString(array));

    }


//实现一个方法 printArray, 以数组为参数, 循环访问数组中的每个元素, 打印每个元素的值.
    public static void printArray(int[] array){
        for (int x:array) {
            System.out.print(x+" ");
        }
    }
    public static void main14(String[] args){
        int[] array={1,2,3,4,5};
        printArray(array);
    }


    //实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 ,
    // 并设置到对应的数组元素上. 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
    public static void transform(int[] array){
        for (int i = 0; i <array.length ; i++) {
            array[i]=2*array[i];
        }
    }
    public static void main13(String[] args) {
        int[] array ={1,2,3,4,5};
        transform(array);
        System.out.println(Arrays.toString(array));
    }


    //实现一个方法 sum, 以数组为参数, 求数组所有元素之和.
    public static int sum2(int[] array){
        int sum=0;
        for (int i = 0; i <array.length ; i++) {
            sum+=array[i];
        }
        return sum;
    }
    public static void main12(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9,10};
        System.out.println(sum2(array));
    }


    //实现一个方法 avg, 以数组为参数, 求数组中所有元素的平均值(注意方法的返回值类型).
    public static double avg(int[] array){
        int sum=0;
        for (int i = 0; i <array.length ; i++) {
            sum+=array[i];
        }
        return (double)sum/(double)array.length;
    }
    public static void main11(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9,10};
        System.out.println(avg(array));
    }

    //递归求 N 的阶乘
    public static int piv(int n){
        if(n==1)return 1;
        else return n*piv(n-1);
    }
    public static void main10(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(piv(n));
    }

    //递归求 1 + 2 + 3 + ... + 10
    public static int sum1(int n){
        if(n==1)return 1;
        else return n+sum1(n-1);
    }
    public static void main9(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(sum1(n));
    }

    //按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4) （递归）
    public static void print(int n){
        if(n>=0&&n<=9)System.out.print(n+" ");
        else {
            print(n/10);
            System.out.print(n%10+" ");
        }

    }
    public static void main8(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        print(n);
    }

    //写一个递归方法，输入一个非负整数，返回组成它的数字之和
    public static int num(int n){
        if(n>=0&&n<=9)return n;
        else return num(n/10)+n%10;
    }
    public static void main7(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(num(n));
    }

    //递归求斐波那契数列的第 N 项
    public static int fib(int n){
        if(n==1||n==2)return 1;
        else return fib(n-1)+fib(n-2);
    }
    public static void main6(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(fib(n));
    }

    //递归求解汉诺塔问题
    /**
     *
     * @param n
     * @param pos1 起始位置
     * @param pos2 中转位置
     * @param pos3 目标位置
     */
    public static void hannuo(int n,char pos1,char pos2,char pos3){
        if(n==1){
            func(pos1,pos3);
        }
        else {
            hannuo(n-1,pos1,pos3,pos2);
            func(pos1,pos3);
            hannuo(n-1,pos2,pos1,pos3);
        }
    }
    public static void func(char pos1,char pos2){
        System.out.print(pos1+"-->"+pos2+"  ");
    }
    public static void main5(String[] args) {
        hannuo(3,'A','B','C');
    }


    //递归求解汉诺塔问题
   /* public static void hannuo(int n,char pos1,char pos2,char pos3){
        if(n==1){
            func(pos1,pos3);
        }
        else {
            hannuo(n-1,pos1,pos3,pos2);
            func(pos1,pos3);
            hannuo(n-1,pos2,pos1,pos3);
        }
    }
    public static void func(char pos1,char pos2){
        System.out.print(pos1+"-->"+pos2+"  ");
    }
    public static void main(String[] args) {
        hannuo(3,'A','B','C');
    }
*/

    //青蛙跳台阶问题
    public static int frog(int n){
        if(n==1||n==2)return n;
        else return frog(n-1)+frog(n-2);
    }
    public static void main4(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(frog(n));
    }


    //求和的重载
    public static int sum(int a,int b){
        return a+b;
    }
    public static double sum(double a,double b){
        return a+b;
    }
    public static double sum(double a,double b,double c){
        return a+b+c;
    }
    public static void main3(String[] args) {
        int a=10;
        int b=20;
        System.out.println(sum(a,b));
        double c=2.2;
        double d=9.2;
        double e=4.2;
        System.out.println(sum(c,d,e));
    }


    //求最大值方法的重载
    public static int max(int a,int b){
        return a>b?a:b;
    }
    public static double max(double a,double b){
        return a>b?a:b;
    }
    public static double max(double a,double b,double c){
        return max(a,b)>c?max(a,b):c;
    }
    public static void main2(String[] args) {
    int a=10;
    int b=20;
    System.out.println(max(a, b));
    double c=1.2;
    double d=2.3;
    double e=2.4;
    System.out.println(max(c, d,e));
    }

    public static String my_tostring(int[] arr){
        String array="[";
        for (int i = 0; i <arr.length ; i++) {
            array+=arr[i];
            if(i+1<arr.length){
                array+=",";
            }
        }
        array+="]";
        return array;
    }
    public static void main1(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(my_tostring(arr));
    }
}
