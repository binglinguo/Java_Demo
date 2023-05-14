

import java.util.Scanner;

public class test2022_8_4 {
    public static void main1(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int sum=0;
        sum=tiaotaijie(n);
        System.out.println(sum);
    }
     public static int tiaotaijie(int n){
        if(n==1||n==2)return n;
        else return tiaotaijie(n-1)+tiaotaijie(n-2);
    }
}
