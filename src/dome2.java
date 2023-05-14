
/*import java.util.Random;//生成随机数需要的包
import java.util.Scanner;//输入需要的包*/
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.lang.reflect.Array;
import java.util.*;//代表导入java.util下的所有的包

/**
 * Java中的方法对应就是c语言中的函数
 */
public class dome2 {//

    public static int[] cpyarr(int[] arr){//拷贝arr数组内容到一个新 的数组
        int[] arry=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arry[i]=arr[i];
        }
        return arry;
    }

    public static void main50(String[] args) {//数组的拷贝
        int[] arr={1,2,3,4,5};
        int[] arr1=cpyarr(arr);
        System.out.println(Arrays.toString(arr1));
    }

    public static String myToString(int[] arry){//实现整形数组转为字符串
        String arr="[";
        for (int i = 0; i <arry.length ; i++) {
            arr+=arry[i];
            if (i!=arry.length-1) arr+=',';
        }
        arr+=']';
        return arr;
    }

    public static void main49(String[] args) {
        int[] a={1,2,3,4};
        System.out.println(myToString(a));
    }

    public static void main48(String[] args) {//将数组按照从小到大顺序排序
        int[] arr={13,31,21,45,1,2,3};
        Arrays.sort(arr);//对于数组进行从小到大排序
        System.out.println(Arrays.toString(arr));//对数组进行字符串型的输出
    }

    public static int[] func(int[] a){//将数组值*2并返回
        int[] arr=new int[a.length];
        for (int i = 0; i <a.length ; i++) {
            arr[i]=2*a[i];
        }
        return arr;
    }

    public static void main47(String[] args) {//将数组中的值*2存放在另一个数组中
        int[] a={1,2,3,4};
        int[] st=func(a);
        System.out.println(Arrays.toString(st));

    }

    public static void main46(String[] args) {//null的使用
        int a=0;
        System.out.println(a);
        int[] arr=null;//null表示arr引用的是个空对象
        System.out.println(arr);
    }

    public static void  printArr(int[] a){//接收数组之间传递的函数 负责打印
        for (int x:a) {
            System.out.print(x+" ");
        }
    }

    public static void main45(String[] args) {//数组之间进行传递
        int[] arr=new int[]{1,2,3,4};
        System.out.println(Arrays.toString(arr));//Arrays.toString(arr)将数组以字符串的形式输出
    }

    public static void main44(String[] args) {//计算字符串的长度
        int[] str=new int[]{1,2,3,4};
        int len=str.length;//length属性
       // System.out.println(len);
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);//数组的打印
        }
        System.out.println();
        for (int a:str) {//Java中的对于数组的打印方式 前面放数组类型 后面放数组名称
            System.out.print(a+" ");
        }
    }

    /**
     * 数组：存放相同数据类型的集合，内存是连续的
     * 在Java中数组存放在堆上
     * 在Java中无需定义数组有多大，它可以自动推导出来有多大
     * new：实例化一个对象  内存在堆上
     * Java取不到栈的地址 但是可以取到堆的地址 这个地址不是真实的，但是你可以当做是真实的 因为它是唯一的
     * @param args
     */
    public static void main43(String[] args) {//Java中数组的三种定义方法
        int[] str={1,2,3,4};
        int[] str1=new int[]{1,2,3,4};
        int[] str2=new int[4];//在Java中如果没有初始化数组的值默认为0

    }

    public static void main42(String[] args) {
        System.out.println(tiaotj(7));
    }

    public static int tiaotj(int n){//青蛙跳台阶
        if (n==1)return 1;
        else if (n==2)return 2;
        else return tiaotj(n-1)+tiaotj(n-2);
    }

    public static int panz(int n){//汉诺塔
        if (n==0)return 1;
        else return 2*panz(n-1);
    }

    public static int fbnq(int n){//递归斐波那契数列第n项  多路递归
        /**
         * 一般情况下不建议使用递归计算斐波那契数列
         */
        if (n==1||n==2){
            return 1;
        }
        else {
            return fbnq(n-1)+fbnq(n-2);
        }
    }

    public static void main41(String[] args) {//主方法
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(fbnq(n));
    }

    public static int sum1(int n){//输入1729返回1+2+7+9的和 =19  单路递归
        if (n<=9&&n>=0)return n;
        else return (n%10)+sum1(n/10);
    }

    public static int sum(int n){//求1加到10的和
        if (n==1)return 1;
        return n+=sum(n-1);
    }

    public static void fun(int n){//打印数字的递归 单路递归
       if(n>9){
           fun(n/10);
       }
        System.out.println(n%10);
    }
    /**
     * 递归：把一个大问题化解为多个小问题
     * 1.要调用自己本身
     * 2.要有一个趋近终止的过程
     * 3.推导出递归的公式（重要！！！）（最难）
     * 递：
     * 归：
     * @param a
     * @param b
     * @return
     */
    public static void main40(String[] args) {//计算阶乘
        System.out.println(fac(5));
    }
    public static int fac(int n){//阶乘 is 递归
        if (n==1)return 1;
        else return n*fac(n-1);
    }

    /**
     * 方法的重载（overload）：
     * 1.方法名相同
     * 2.返回值不做要求
     * 3.参数列表不同（参数的个数或参数的类型不同）
     * 4.必须在同一个类当中
     * @param args
     */

    public static int add(int a,int b) {//法的重载1
        return a+b;
    }
    public static int add(int a,int b,int c){//方法的重载2
        return a+b+c;
    }
    public  static double add(double a,double b){//方法的重载3
        return a+b;
    }
    public  static double add(double a,double b,double c){//方法的重载4
        return a+b+c;
    }
    public static void main39(String[] args) {
        double a=10;
        double b=20;
        System.out.println(add(a,b));
    }
    public static int factor(int a){//求某个数字的阶乘
        int o=1;
        while (a>0){
            o=o*a;
            a--;
        }
        return o;
    }

    public static void main38(String[] args) {//计算阶乘的和
        int i=1,sum=0;
        for (;i<=7;i++){
            sum+=factor(i);
        }
        System.out.println(sum);
    }

    public static int maxNum(int a,int b) {//比两个数大小方法
        return a>b?a:b;
    }

    public static void main37(String[] args) {//调用maxNum3方法实现求三个数的最大值
        Scanner scanner=new Scanner(System.in);
        int n1=scanner.nextInt();
        int n2=scanner.nextInt();
        int n3=scanner.nextInt();
        int temp=maxNum(n1,n2);
        temp=maxNum(temp,n3);
        System.out.println(temp);
    }

    public static void main36(String[] args) {//取出二进制中的奇数位与偶数位
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println("奇数位：");
        for (int i = 31; i >0 ; i=i-2) {
            System.out.print((n>>i)&1);
        }
        System.out.println();
        System.out.println("偶数位：");
        for (int i = 30; i >=0 ; i-=2) {
            System.out.print((n>>i)&1);
        }
    }
    
    
    public static void main35(String[] args) {////求二进制有几位数优化
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int count=0;
        while (n!=0){
            n=n&(n-1);
            count++;
        }
        System.out.println(count);
    }
    

    public static void main34(String[] args) {//求二进制有几位数进阶
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int i=0;
        for (i=1;;i++){
            n=n&(n-1);
            if (n==0){
                break;
            }

        }
        System.out.println(i);
    }

    public static void main33(String[] args) {//求二进制有几位数
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int count=0;
        for (int i=1;i<=32;i++){
            if (((n>>i)&1)==1){
             count++;
            }
            if (n==0){
                break;
            }
        }
        System.out.println(count);

    }

    public static void main32(String[] args) {//密码系统
        Scanner scan=new Scanner(System.in);
        int count=3;
        while(count!=0){
            System.out.println("请输入您的密码：");
            String str=scan.nextLine();
            if (str.equals("666")){//equals比较两个字符串是否相同
                System.out.println("密码正确，登录成功！");break;
            }else {
                count--;
                System.out.println("密码输入错误,你还有"+count+"次机会!");
            }
        }

    }

    public static void main31(String[] args) {//求六合数 有难度
        int i=0,j=0,sum=0,n=0;
        double r=0,t=0;
        for (i=0;i<=99999999;i++){
            r=i;
            n=1;
            sum=0;
            while(r>9){
                n++;
                r/=10;
            }
            for (j=i;j>0;){
                t=j%10;
                j/=10;
                sum=sum+(int)Math.pow(t,n);
            }
            if (i==sum){
                System.out.println(i+"是六合数");
            }

        }
    }

    public static void main30(String[] args) {//猜数字游戏
        Random random=new Random();//
        Scanner scan=new Scanner(System.in);
        int a=random.nextInt(100);//表示生成[0-100)内的随机数
        int t=0;
        while(t!=a){
            System.out.println("请输入你要猜的数字：");
            t=scan.nextInt();
            if (t>a){
                System.out.println("大了");
            }else if (t<a){
                System.out.println("小了");
            }
    }System.out.println("恭喜你答对了");}

    public static void main29(String[] args) {
        Scanner scan= new Scanner(System.in);
        while(scan.hasNextInt()){
            int a=scan.nextInt();
            System.out.println(a);
        }
    }

    public static void main28(String[] args) {//计算1！+2！+3！+4！+5！
        int t=1,i=1,sum=0;
        for (;i<=5;i++){
            t=t*i;
            sum+=t;
        }
        System.out.println(sum);
    }

    public static void main27(String[] args) {//输出一个整数的每一位
        Scanner scan = new Scanner(System.in);
        int a=scan.nextInt();
        while(a>0){
            System.out.println(a%10);
            a=a/10;
        }
    }

    public static void main26(String[] args) {//模拟密码登陆系统
        Scanner scan = new Scanner(System.in);
        int n=3,t=888,temp=0;
        System.out.print("请大爷输入密码：");
        do {
            int a = scan.nextInt();
            if (a==t){
                temp=1;
                break;
            }else if(n-1!=0){
                System.out.print("很抱歉大爷的密码有误，请重新输入:");
            }
        }while(--n>0);
        if (temp==1) System.out.println("恭喜大爷登录成功！");
        else System.out.println("输入错误，你个臭傻逼!");
    }

    public static void main25(String[] args) {//输出0-999之间所有水仙花数
        int i=0;
        int g=0,s=0,b=0;
        for (i=0;i<=999;i++){
            g=i%10;
            s=i/10%10;
            b=i/100;
            if (g*g*g+s*s*s+b*b*b==i) System.out.println(i);
        }
    }

    public static void main24(String[] args) {//编程    算一下1-100出现多少个数字9
        int a=1,g=0,s=0,t=0;
        for (a=1;a<=100;a++){
            g=a%10;
            s=a/10;
            if(g==9){
                t++;
            }
            if(s==9){
                t++;
            }
        }
        System.out.println(t);
    }

    public static void main23(String[] args) {//计算1/1-1/2+1/3……1/100
        double a=1,sum=0;
        double i=1;
        while (i<=100){
            sum+= a / i;
            i++;
            a=-a;
        }
        System.out.println(sum);
    }

    public static void main22(String[] args) {//求两个数的最大公约数 枚举法
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int i=a;
        while(i>=1){
            if (a%i==0&&b%i==0){
                break;
            }
            i--;
        }
        System.out.println(i);
    }

    public static void main21(String[] args) {//求两个数的最大公约数 辗转取余法
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int t=0;
        if(a<b){
            t=a;
            a=b;
            b=t;
        }
        while(b>0){
            t= a % b;
            a = b;
            b = t;
        }
        System.out.println(a);
    }

    public static void main20(String[] args) {//输出乘法口诀表
        int i=1,j=1;
        for (i=1;i<=9;i++){
            for (j=1;j<=i;j++){
                System.out.printf("%2d*%2d=%2d  ",i,j,i*j);
            }
            System.out.printf("\n");
        }
    }

    public static void main19(String[] args) {//输出1000-2000之间所有的闰年
        int a=0;
        for (a=1000;a<=2000;a++){
            if(a%4==0&&a%100!=0||a%400==0){
                System.out.println(a);
            }
        }
    }

    public static void main18(String[] args) {//1-100之间的所有素数
        int a=0,i=0;
        for (a=1;a<=100;a++){
            for (i=2;i<a;i++){
                if (a%i==0){break; }}
                if (a==i) System.out.println(a);

    }
    }

    public static void main17(String[] args) {//判断一个数是否为素数
        Scanner scan =new  Scanner(System.in);
        int a=scan.nextInt();
        int i=0;
        for (i=2;i<a;i++){
            if (a%i==0)break;
        }
        if (a==i){
            System.out.println(a+"是素数");
        } else {
            System.out.println(a+"不是素数");
        }
    }

    public static void main16(String[] args) {//打印出当前是少年（18）青年（19-28）中年（29-55）老年（56以上）
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n<=18){
            System.out.println("少年");
        } else if (n >=19 && n <=23){
            System.out.println("青年");
        } else if (n >= 29 && n<=55){
            System.out.println("中年");
        } else {
            System.out.println("老年");
        }
    }

    public static void main15(String[] args) {//计算5的阶乘
        int a = 1, num = 1 ,sum=0;
        while (a <= 5) {
            num = num * a++;
            sum+=num;
        }
        System.out.println(sum);
    }

    public static void main14(String[] args) {//计算1-100的和
        int sum=0,a=1;
        while(a<=100){
            sum+=a++;
        }
        System.out.println(sum);
    }

    public static void main13(String[] args) {//打印1-10数字
        int a=1;
        while (a<=10){
            System.out.println(a++);

        }
    }
    public static void main12(String[] args) {//switc语句
        Scanner scan=new Scanner(System.in);
        int a = scan.nextInt();
        switch(a){
            case 1: System.out.println(1);break;
            case 2: System.out.println(2);break;
            default:break;
        }

    }
    //退出循环
    // ctri+c（直接中断程序）
    // ctri+d（正常退出程序）
    public static void main11(String[] args) {//判断一年是否为闰年
        Scanner scanf = new Scanner(System.in);
        while(scanf.hasNext()){
            int a = scanf.nextInt();
            if( a % 4 == 0 && a % 100 != 0 || a % 400 == 0 ) {
                System.out.println(a+"是闰年");
            } else {
                System.out.println(a+"不是闰年");
            }
        }
        }



    public static void main10(String[] args) {//判断一个数是奇数还是偶数
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        if (a>0){
            System.out.println(a+"是正数");
        }
        else if (a<0){
            System.out.println(a+"是负数");
        }
        else System.out.println(a+"既不是正数也不是负数");
    }


    public static void main9(String[] args) {//判断一个数是奇数还是偶数
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        if (a%2==0){
            System.out.println(a+"是偶数");
        }
        else System.out.println(a+"是奇数");

    }

    public static void main8(String[] args) {//输入练习
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        System.out.println(a);
        String str=scan.next();
        System.out.println(str);
    }

    public static void main7(String[] args) {//斐波那契数列
        int i=1;
        int j=1;
        System.out.printf("%d ",i);
        System.out.printf("%d ",j);
        int a=0,b=0,t=0;
        for (a=0;a<=19;a++){
            b=i+j;
            i=j;
            j=b;
            System.out.printf("%d ",b);
        }
    }
    public static void main6(String[] args) {
        Scanner scanf=new Scanner(System.in);
        int a=scanf.nextInt();
        System.out.println(a);
    }
    public static void main5(String[] args) {//输入类
        Scanner scan=new Scanner(System.in);//System.in表示从键盘输入
        int a=scan.nextInt();
        System.out.println(a);
    }
    public static void main4(String[] args) {//定义三个数取出最大值最小值
        int a=1,b=2,c=3;
        int max=a,min=a;
        max=max>b?max:b;
        max=max>c?max:c;
        min=min<b?min:b;
        min=min<c?min:c;
        System.out.println(max);
        System.out.println(min);
    }
    public static void main3(String[] args) {//定义两个数 使两数交换值
        int a=1,b=2;
        int t=0;
        t=a;
        a=b;
        b=t;
        System.out.println(a);
        System.out.println(b);
    }
    public static void main2(String[] args) {
        boolean a=true;
        int b=10;
        int c=20;
        System.out.println(!a);
        System.out.println(b<c);
        System.out.println(!(b<c));
        System.out.println(!a&&10/0==0);
    }
    public static void main1(String[] args) {
        System.out.println(5/2);
        System.out.println(5.0/2);
        System.out.println(10%3);
        System.out.println(-10%3);
    }
}
