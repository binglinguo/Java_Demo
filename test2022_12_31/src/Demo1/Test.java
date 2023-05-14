package Demo1;

import java.util.Scanner;

public class Test {
    public int x;
    public static void main(String []args)
    {
        System. out. println("Value is" + x);
    }
    public static void main3(String[] args) {
        StringBuilder str=new StringBuilder();
        Scanner scanner=new Scanner(System.in);
        int year=scanner.nextInt();
        int day=scanner.nextInt();
        String[] str1={"a","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","oct","Nov","Dec"};
        str.append(str1[year]);
        if(day<0){
            str.append('0');
        }
        str.append(day);
    }
    /**
     * 编写一个递归程序，求一个一维数组的所有元素的和？
     */
    public static int addnums(int[] array,int i){
        if(i<array.length)return addnums(array,i+1)+array[i];
        else return 0;
    }

    public static void main2 (String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9};
        System.out.println(addnums(array,0));
    }
    /**
     * 一对相亲数是指：甲的约数之和等于乙
     */
    public static boolean isnum(int n){
        int y=0;
        int num=0;
        for (int i = 1 ; i < n ; i++) {
            if(n%i==0){
                num+=i;
            }
        }
        y=num;
        int numy=0;
        for (int i = 1 ; i < n ; i++) {
            if(y%i==0){
                numy+=i;
            }
        }
        return numy==num;
    }
    public static void main1 (String[] args) {
        int n=0;
        for (int i = 1 ; i <= 1000 ; i++) {
            if(isnum(i)){
                System.out.println(i+"是相亲数");
            }
        }
    }
}
