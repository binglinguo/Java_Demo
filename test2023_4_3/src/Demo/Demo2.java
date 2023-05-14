package Demo;

import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-03 22:03
 **/
//计算日期到天数转换
public class Demo2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int yue = scanner.nextInt();
        int day = scanner.nextInt();
        //判断是否为闰年
        int[] yueday = new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};
        //判断是否为闰年 如果为闰年的话ret = 1;
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            yueday[2]++;
        }
        int count = 0;
        for(int i = 0;i < yue; i++){
            count += yueday[i];
        }
        count += day;
        System.out.println(count);
    }
}
