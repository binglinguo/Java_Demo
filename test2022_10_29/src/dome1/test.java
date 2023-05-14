package dome1;

import java.util.Scanner;

class book{

}
public class test {
    //给定两个数，求这两个数的最大公约数
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int tmp=0;
        while(n%m!=0){
            tmp=n%m;
            n=m;
            m=tmp;
        }
        System.out.println(m);
    }
    //求一个整数，在内存当中存储时，二进制1的个数。
    public static void main7(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int count=0;
        while(n!=0){
            n&=n-1;
            count++;
        }
        System.out.println(count);
    }

    //给定一个数字，判定一个数字是否是素数
    public static void main6(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for (int i = 2; i < n ; i++) {
            if(n%i==0){
                System.out.println("NO");
                return ;
            }
        }
        System.out.println("YES");
    }
    //输出 1000 - 2000 之间所有的闰年
    public static void main5(String[] args) {
        for (int i = 1000; i <=2000 ; i++) {
            if(i%4==0&&i%400!=0||i%400==0){
                System.out.print(i+"  ");
            }
        }
    }
    //编写程序数一下 1到 100 的所有整数中出现多少个数字9
    public static void main4(String[] args) {
        int count=0;
        for (int i = 1; i <=100 ; i++) {
            if(i%10==9){
                count++;
            }
            if(i/10==9){
                count++;
            }
        }
        System.out.println(count);
    }
    //打印 1 - 100 之间所有的素数
    public static void main3(String[] args) {
        int i=0;
        boolean flag;
        for ( i = 1; i <=100 ; i++) {
            flag=true;
            for (int j = 2; j < i ; j++) {
                if(i%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.print(i+" ");
            }
        }
    }
    public static void main2(String[] args) {
        //能被3和5整除的数字
        int i=0;
        while(i<100){
            i++;
            if(!(i%3==0&&i%5==0)){
                continue;
            }
            System.out.println(i);
        }
    }
    public static void main1(String[] args) {
        String str="abcde";
        //通过构造方法构造字符串
        String str1=new String("edcba");
        //通过对象引用字符串
        char[] arr={'a','b','c'};
        String str2=new String(arr);
        System.out.println(str2);
        String name="guobingl";
        String age="12";
        String sdaa="123892";
        String asd="123sjkd";
        System.out.println("sad");
    }
}
