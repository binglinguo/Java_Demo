package Demo1;

import java.util.HashMap;
import java.util.Scanner;

public class Test {
    public boolean isUgly(int n) {
        if(n<=0)return false;
        while(n%2==0)n/=2;
        while(n%3==0)n/=3;
        while(n%5==0)n/=5;
        return n==1;
    }
    public static void main9(String[] args) {
        System.out.println(isHappy(19));
    }
    public static boolean isHappy(int n) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        while(true){
            count=0;
            while(n>0){
                count+=(n%10)*(n%10);
                n/=10;

            }
            if(count==1)return true;
            if(map.getOrDefault(count,0)==1){
                return false;
            }
            map.put(count,1);
            n=count;
        }
        //return true;
    }
    public static void main7 (String[] args) {
        short a=10;
        switch (a){
            case 1:
        }
    }
//    public static void main(String args[]) {
//        byte a = 127;
//        byte b = 126;
//        b = a + b;
//        System.out.println(b);
//    }error
    public static void main6(String args[]) {
        byte a = 127;
        byte b = 127;
        a+=b;
        System.out.println(b);
    }
    public static void main5(String[] args) {
        Double o1 = true ? new Integer(1) : new Double(2.0);
        Object o2;
        if(true){
            o2 = new Integer(1);
        }else{
            o2 = new Double(2.0);
        }
        System.out.print(o1);
        System.out.print(" ");
        System.out.print(o2);
    }
    /**
     * 给定一个3乘以3的二维数组，里面的数据随机生成。分别求出两个对角线的元素之和
     */
    public static void main4 (String[] args) {
        int[][] array=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int left=0;
        int right=0;
        for (int i = 0 ; i < array.length ; i++) {
                left+=array[i][i];
                right+=array[i][2-i];
        }
        System.out.println(left);
        System.out.println(right);
    }
    /**
     * 有5个人坐在一起，问第五个人多少岁？他说比第4个人大2岁。问第4个人岁数，他说比第3个人大2岁。问第三
     * 个人，又说比第2人大两岁。问第2个人，说比第一个人大两岁。最后问第一个人，他说是10岁。请问第五个人多
     * 大？
     */
    public static int func(int n){
        if(n==1)return 10;
        return func(n-1)+2;
    }
    public static void main3 (String[] args) {
        System.out.println(func(5));
    }
    /**
     * 有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子
     * 都不死，问第n个月的兔子对数为多少？
     */
    public static void main2 (String[] args) {
        int rebbit =1;//对
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int one=0;
        int two=0;
        int shirr=0;
        while(n>0){
            shirr+=two;
            two=one;
            one=rebbit;
            rebbit=shirr;
            n--;
        }
        System.out.println(rebbit+one+two+shirr);
    }
    /**
     * 一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在 第10次落地时，共经过多 少
     * 米？第10次反弹多高？
     */
    public static void main1 (String[] args) {
        double boy=100;
        double count=0;
        int n=10;
        while(n>0){
            count+=boy;
            boy/=2;
            count+=boy;
            n--;
        }
        System.out.println(count);
        System.out.println(boy);
    }
}
