package Demo1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Test {
    /**
     * 二维数组中找值
     */
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int i=matrix.length-1;
        int j=0;
        while(i>=0&&j<matrix[i].length){
            if(target>matrix[i][j]){
                j++;
            }else if(target<matrix[i][j]){
                i--;
            }else {
                return true;
            }
        }
        return false;
    }
    //失败
    public boolean findNumberIn2DArrayerror(int[][] matrix, int target) {
        int i=0;
        int j=matrix.length-1;
        while(j>=0 && i<matrix.length&&j<matrix[0].length){
            if(target>matrix[i][j]){
                i++;
            }else if(target<matrix[i][j]){
                j--;
            }else {
                return true;
            }
        }
        return false;
    }
    /**
     * 旋转数组找最小值
     */
    public int minArray(int[] numbers) {
        int left=0;
        int right=numbers.length-1;

        if(right==left){
            return numbers[0];
        }

        while(left<right){
            int mid=left+((right-left)>>>1);
            if(numbers[right]<numbers[mid]){
                left=mid+1;
            }else if(numbers[right]>numbers[mid]){
                right=mid;
            }else {
                right--;
            }
        }
        return numbers[left];
    }
    /**
     * 青蛙跳台阶
     */
    public int numWays(int n) {
        if(n==0)return 1;
        if(n==1||n==2){
            return n;
        }
        int a=1;
        int b=2;
        int c=0;
        for(int i=3;i<=n;i++){
            c=(a+b)%1000000007;
            a=b;
            b=c;
        }
        return c;
    }

    /**
     * 斐波那契N项
     */
    public int fib(int n) {
        if(n==1||n==2){
            return 1;
        }
        int a=1;
        int b=1;
        int c=0;
        for(int i=2;i<n;i++){
            c=(a+b)%1000000007;
            a=b;
            b=c;
        }
        return c;
    }
    /**
     * 求平方根
     */
    public int sqrt (int x) {
        // write code here
        if(x==1)return 1;
        int left=1;
        int right=x;
        while(left<=right){
            int mid=(right+left)/2;
            if(x/mid>=mid&&x/(mid+1)<mid+1)return mid;
            if(x/mid>mid)left=mid+1;
            else right=mid-1;
        }
        return 0;
    }
    /**
     * 判断是否为回文
     */
    public boolean judge (String str) {
        // write code here
        if(str==null){
            return false;
        }
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=(str.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    /**
     * 写程序，对输入的年、月、日，给出该天是该年的第多少天
     */
    public static void main1 (String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        String[] strs=str.split(" ");
        int year=Integer.valueOf(strs[0]);
        int month=Integer.valueOf(strs[1]);
        int day=Integer.valueOf(strs[2]);
        int count=0;
        for (int i = 1 ; i < month ; i++) {
            switch (month-1){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:count+=31;break;
                case 4:
                case 6:
                case 9:
                case 11:count+=30;break;
                case 2:if(isYear(year))count+=29;else count+=28;break;
            }
            count+=day;
            System.out.println(count);
        }
    }
    public static boolean isYear(int year){
        if(year%4==0&&year%100!=0||year%400==0){
            return true;
        }
        return false;
    }
    /**
     * 输入一个字符，判断它是否为小写字母，如果是，将它转换成大写字母，否则，不转换
     * @param args
     */
    public static void main (String[] args) {
        Scanner scanner=new Scanner(System.in);
           String str=scanner.next();
//           if(ch>='a'&&ch<='z'){
//               ch-=32;
//           }
//           System.out.println(ch);
    }
}
