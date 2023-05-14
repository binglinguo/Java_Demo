package Demo1;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int tmp = 0;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            tmp = 1;
        }
        for (int i = 1; i <= 12; i++) {
            switch (i) {
                case 1:
                    System.out.println(year + "年" + i + "月:31天");
                    break;
                case 2:
                    System.out.println(year + "年" + i + "月:" + (28 + tmp) + "天");
                    break;
                case 3:
                    System.out.println(year + "年" + i + "月:31天");
                    break;
                case 4:
                    System.out.println(year + "年" + i + "月:30天");
                    break;
                case 5:
                    System.out.println(year + "年" + i + "月:31天");
                    break;
                case 6:
                    System.out.println(year + "年" + i + "月:30天");
                    break;
                case 7:
                    System.out.println(year + "年" + i + "月:31天");
                    break;
                case 8:
                    System.out.println(year + "年" + i + "月:31天");
                    break;
                case 9:
                    System.out.println(year + "年" + i + "月:30天");
                    break;
                case 10:
                    System.out.println(year + "年" + i + "月:31天");
                    break;
                case 11:
                    System.out.println(year + "年" + i + "月:30天");
                    break;
                case 12:
                    System.out.println(year + "年" + i + "月:31天");
                    break;
            }
        }
    }

    public static void main6(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            StringBuilder str=new StringBuilder("");
            if(a==0)str.append(a%2);
            while(a>0){
                str.insert(0, a%2);
                a/=2;
            }
            System.out.println(str.toString());
        }

    }
    public static void main5(String[] args) {//error
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            StringBuilder str=new StringBuilder();
            int i=32;
            while(a>0&&i>0){
                if(a>Math.pow(2,i)){
                    a-=Math.pow(2,i);
                    str.append('1');
                    i--;
                }else{
                    str.append('0');
                    i--;
                }
            }
            str.reverse();
            System.out.println(str.toString()+" ");
        }
    }
    public static void main4(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String str="Hell o ! n o w c o d e r";
        char ch=in.nextLine().charAt(0);
        int count=0;
        for(int i=0;i<str.length();i++){
            if(ch==str.charAt(i)){
                count++;
            }
        }

        System.out.println(count);
    }
    public static void main3(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String str="ooo";
        char ch=in.nextLine().charAt(0);
        int n=0;
        int count=0;
        while(str.indexOf(ch,n)!=-1){
            n=str.indexOf(ch,n+1);
            count++;
        }

        System.out.println(count);
    }
    public static void main2(String[] args) {
        Scanner in = new Scanner(System.in);
        String str=in.nextLine();
        char a= (char) in.nextInt();
        StringBuilder str1=new StringBuilder(str);
        //System.out.println(str1.toString());
        int n=str1.length()-3;
        while(n>0){
            str1.insert(n,",");
            n-=3;
        }
        System.out.println(str1.toString());
    }
    public static void reverse(int[] arr,int row,int right){
        if(right>=arr.length)return ;
        while(row<right){
            int tmp=arr[row];
            arr[row]=arr[right];
            arr[right]=tmp;
            row++;
            right--;
        }
    }
    public static void rotate(int[] nums, int k) {
        reverse(nums,0,nums.length-1);//3 2 1
        reverse(nums,0,k%nums.length-1);//
        reverse(nums,k%nums.length,nums.length-1);//
    }

    public static void main1(String[] args) {
        int[] a={1,2,3};
        rotate(a,4);
        System.out.println(Arrays.toString(a));
    }
}
