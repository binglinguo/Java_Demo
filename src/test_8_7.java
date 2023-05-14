

import sun.security.krb5.SCDynamicStoreConfig;

import java.util.Random;
import java.util.Scanner;

public class test_8_7 {


    //模拟登陆
    /**
     * 编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，提示“登录成功”,密码错误，
     * 可以重新输 入，最多输入三次。三次均错，则提示退出程序
     * @param args
     */
    public static void main21(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=3;
        String mima="123456";
        while(n-->0){
            System.out.println("请输入密码");
            String str=scanner.nextLine();
            if(str.equals(mima)){
                System.out.println("登录成功！");
                break;
            }
            else {
                System.out.println("输入错误，你还有"+n+"次机会");
            }
        }

    }

    //获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列
    public static void main20(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        //奇数位
        System.out.println("奇数位");
        for (int i = 31; i >0; i-=2) {
            System.out.print((n>>i&1)+" ");
        }
        //偶数位
        System.out.println();
        System.out.println("偶数位");
        for(int i=30;i>=0;i-=2){
            System.out.print((n>>i&1)+" ");
        }
    }

    //二进制1的个数。
    public static void main19(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int sum=0;
        while(n!=0){
            sum+=n&1;
            n>>>=1;
        }
        System.out.println(sum);
    }



    //求2个整数的最大公约数
    public static void main18(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int m=scanner.nextInt();
        int n=scanner.nextInt();
        int t=0;
        while(m%n!=0){
            t=m%n;
            m=n;
            n=t;
        }
        System.out.println(n);
    }


    //计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值 。
    public static void main17(String[] args) {
        int flag=1;
        int i=0;
        double sum=0;
        for(i=1;i<=100;i++){
            sum+=1.0/i*flag;
            flag=-flag;
        }
        System.out.println(sum);
    }


    //水仙花数
    public static void main16(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int i=0;
        int n=scanner.nextInt();
        for(i=0;i<=n;i++){
            int r=i;
            int nu=0;
            int sum=0;
            while(r>0){
                nu++;
                r/=10;
            }
            r=i;
            while(r>0){
                sum+=Math.pow(r%10,nu);
                r/=10;
            }
            if(sum==i){
                System.out.print(i+"  ");
            }
        }
    }

    //猜数字游戏
    public static void tame(){

        System.out.println("*******猜数字游戏******");
        System.out.println("*********************");
        System.out.println("********1.play*******");
        System.out.println("********0.exit*******");
        System.out.println("*********************");

    }
    public static void game(){
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        int ret=Math.abs(random.nextInt()%100);
        System.out.println(ret);
        int clo=0;
        while(true){
            System.out.println("请输入你要猜的数字");
            clo=scanner.nextInt();
            if(clo==ret){
                System.out.println("恭喜你猜对了！");
                break;
            }
            else if(clo>ret){
                System.out.println("猜大了！");
            }
            else {
                System.out.println("猜小了！");
            }
        }
    }
    public static void main15(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int input=0;
        do{
            tame();
            input=scanner.nextInt();
            switch(input){
                case 1:game();break;
                case 0:
                    System.out.println("退出游戏");
                    break;
                default:
                    System.out.println("输入错误，请重新输入");
            }
        }while(input!=0);
    }

        public static void main14(String[] args){
            Scanner scanner=new Scanner(System.in);
            int n=0;
            while(scanner.hasNext()){
                n=scanner.nextInt();
                int i=0;
                int j=0;
                for(i=1;i<=n;i++){
                    for(j=1;j<=n;j++){
                        if(n-i+1==j||i==j){
                            System.out.print("*");
                        }
                        else System.out.print(" ");
                    }
                    System.out.println();
                }
            }
        }
    //输出一个数的每一位数
    public static void main13(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        while(n>0){
            System.out.print(n%10+" ");
            n/=10;
        }
    }

    //99乘法表
    public static void main12(String[] args) {
        for (int i = 1; i <=9 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i+"*"+j+"="+i*j+"  ");
            }
            System.out.println();
        }
    }

    //求一个数字是不是素数进阶 以后直接都这么写
    public static void main11(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int i=0;
        for (i = 2; i <=Math.sqrt(n) ; i++) {
            if(n%i==0){
                break;
            }
        }
        if(i>Math.sqrt(n)){
            System.out.println(n+"是素数");
        }
        else {
            System.out.println(n+"不是素数");
        }
    }

    //猜数字小游戏
    public static void main10(String[] args) {
        Random random=new Random();
        int rand=random.nextInt(100);
        Scanner scanner=new Scanner(System.in);
        int n=0;
        do {
            System.out.println("是否开始游戏？");
            System.out.println("输入1开始游戏");
            System.out.println("输入0退出游戏");
            n=scanner.nextInt();
            switch(n){
                case 1:
                    while(true){
                        System.out.println("请输入你要猜的数字");
                        int input=scanner.nextInt();
                        if(input>rand){
                            System.out.println("猜大了");
                        }
                        else if(input<rand){
                            System.out.println("猜小了");
                        }
                        else {
                            System.out.println("恭喜你回答正确");
                            break;
                        }
                    }
                    break;
                case 0:
                    System.out.println("退出游戏");
                    break;
                default:
                    System.out.println("输入错误，请重新输入");
                    break;
            }
        }while(n!=0) ;

    }

    //根据输入的年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
    public static void main9(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int year=scanner.nextInt();
        if(year>=0&&year<=18){
            System.out.println("少年");
        }
        else if(year>=19&&year<=28){
            System.out.println("青年");
        }
        else if(year>=29&&year<=55){
            System.out.println("中年");
        }
        else {
            System.out.println("老年");
        }
    }

    //给定一个数字，判定一个数字是否是素数
    public static void main8(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int i=0;
        for (i = 2; i < n ; i++) {
            if(n%i==0){
                break;
            }
        }
        if(i==n){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }

    //打印 1 - 100 之间所有的素数
    public static void main7(String[] args) {
        for (int i = 1; i < 101; i++) {
            int j=0;
            for (j = 2; j <i ; j++) {
                if(i%j==0){
                    break;
                }
            }
            if(i==j){
                System.out.println(i);
            }
        }
    }

    //输出 1000 - 2000 之间所有的闰年
    public static void main6(String[] args) {
        for (int i = 1000; i <2001 ; i++) {
            if((i%4==0&&i%100!=0)||i%400==0){
                System.out.print(i+" ");
            }
        }
    }


    //编写程序数一下 1到 100 的所有整数中出现多少个数字9
    public static void main5(String[] args) {
        int sum=0;
        for (int i = 1; i <=100 ; i++) {
            if(i/10==9){
                sum++;
            }
            if(i%10==9){
                sum++;
            }
        }
        System.out.println(sum);
    }

    public static void main4(String[] args) {
        for (int i = 1; i <=100 ; i++) {
            if(i%3!=0||i%5!=0){
                continue;
            }
            System.out.println(i);
        }
    }

    public static void main3(String[] args) {
        //找到1-100之间能被三和五整除的数字
        for (int i = 1; i <=100 ; i++) {
            if(i%3!=0){
                continue;
            }
            if(i%5!=0){
                continue;
            }
            System.out.println(i);
        }
    }

    public static void main2(String[] args) {
        int i=0;
        int sum=0;
        for ( i = 0; i <10 ; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }
    public static void main1(String[] args) {
        System.out.println("hello"+"wolrd");
        System.out.println("hello"+10+20);// hello1020其他数据类型和字符串使用+拼接，就是一个字符串
        System.out.println(10+20+"hello");//30hello
        System.out.println(10+""+20+"hello");//1020hello
        System.out.println("hello"+(10+20));//hello30
        //a=10,b=20
        System.out.println("a = "+10+" , b = "+20);
        byte a=1+2;//为什么不报错？ 是因为编译器在编译的时候，这里已经是3了//byte a=3;
        System.out.println(a);
        int ar=1;
        long br=2;
     //   int cr=ar+br;//此项是错误的  编译器在运算的时候如果有小类型会将其提升为大类型
        int cr=(int)(ar+br);
        //不同类型的类型运算 会将类型小的转换为大的类型
        short arr=1;
        //arr=arr+9;//报错 需要进行类型转换
        arr+=9;//会自动进行强制类型转换
        //>>>无符号右移 1111 1111 >>>1--->0111 1111
    }
}
