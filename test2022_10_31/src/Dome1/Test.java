package Dome1;

import java.util.Scanner;

public class Test {
    //求斐波那契数列的第n项。(迭代实现)
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n=scanner.nextInt();
        int num=0;
        int a=1;
        int b=1;

        for(int i=3;i<=n;i++) {
            num=a+b;
            a=b;
            b=num;
        }
        if(n==1||n==2)num=1;
        System.out.println(num);
    }
    //在同一个类中,分别定义求两个整数的方法 和 三个小数之和的方法。 并执行代码，求出结果
    public static double add(double a,double b,double c) {
        return a+b+c;
    }
    public static int add(int a,int b) {
        return a+b;
    }
    public static void main6(String[] args) {
        int a=10;
        int b=20;
        System.out.println(add(a,b));
        System.out.println(add(10.2,20.1,30.2));
    }
    //创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
    public static int max(int a,int b) {
        return a>b?a:b;
    }
    public static int max(int a,int b,int c) {
        return a>b?(a>c?a:c):(b>c?b:c);
    }
    public static void main5(String[] args) {
        int a=10;
        int b=20;
        int c=15;
        System.out.println(max(a,b));
        System.out.println(max(a,b,c));
    }
    //输出一个整数的每一位，如：123的每一位是3，2，1
    public static void main4(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        while(n>0) {
            System.out.print(n%10+" ");
            n/=10;
        }
    }

    //计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值 。
    public static void main3(String[] args) {
        double fm=1;
        double sum=0;
        int flag=1;
        for(int i=1;i<=100;i++) {
            sum+=fm/i*flag;
            flag=-flag;
        }
        System.out.println(sum);
    }
    //9*9乘法表
    public static void main2(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int i=0;
        int j=0;
        for(i=1;i<=n;i++) {
            for(j=1;j<=i;j++) {
                System.out.print(i+"*"+j+"="+i*j+"  ");
            }
            System.out.println();
        }
    }
    //判断一个数是不是素数
    public static void main1(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=2;i<Math.sqrt(n);i++) {
            if(n%i==0) {
                System.out.println("NO");
                return ;
            }
        }
        System.out.println("YES");
    }
}
