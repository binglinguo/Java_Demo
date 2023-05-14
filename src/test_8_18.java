


import java.util.Scanner;



public class test_8_18 {


    //使用函数求最大值
    public static int max2(int n,int m){
        return n>m?n:m;
    }
    public static int max3(int a,int b,int c){
        return max2(max2(a,b),c);
    }
    public static void main6(String[] args){
        int a=10;
        int b=20;
        int c=15;
        System.out.println(max3(a,b,c));
    }

    //奇数位于偶数之前
    public static void main5(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int tmp;
        int i=0;
        int j=arr.length-1;
        while(i<j){
            while(arr[i]%2!=0&&i<j){
                i++;
            }
            while(arr[j]%2!=1&&i<j){
                j--;
            }
            tmp=arr[i];
            arr[i]=arr[j];
            arr[j]=tmp;
        }

        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }


    //求 N 的阶乘 。
    public static void main4(String[] args){
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int tmp=1;
        for(int i=1;i<=N;i++){
            tmp*=i;
        }
        System.out.println(tmp);
    }

    //求1！+2！+3！+4！+........+n!的和
    public static int piv(int n){
        if(n==1)return 1;
        else return piv(n-1)*n;
    }
    public static void main3(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int sum=0;
        for (int i = 1; i <=n ; i++) {
            sum+=piv(i);
        }
        System.out.println(sum);
    }

    //求斐波那契数列的第n项。(迭代实现)
    public static int fib(int n){
        if(n==1||n==2)return 1;
        else return fib(n-1)+fib(n-2);
    }
    public static void main2(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        System.out.println(fib(n));
    }


    //有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字。
    public static void main1(String[] args) {
        int[] arr={1,1,2,2,3,3,5,6,6,7,7};
        int tmp=0;
        for (int i = 0; i <arr.length ; i++) {
            tmp^=arr[i];
        }
        System.out.println(tmp);
    }
}
