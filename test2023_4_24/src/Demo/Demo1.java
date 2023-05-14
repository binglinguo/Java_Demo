package Demo;

import java.util.*;
/**
 * @Author: 冰激凌
 * @Date: 2023-04-24 23:08
 **/

public class Demo1 {
    public static boolean isYear(int year){
        if(year % 4 == 0 && year % 400 != 0 || year % 100 == 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()){
            int year = scanner.nextInt();
            int month = scanner.nextInt();
            int day = scanner.nextInt();
            int lastYear = scanner.nextInt();
            int lastMonth = scanner.nextInt();
            int lastDay = scanner.nextInt();
            int[] table = {0,31,28,31,30,31,30,31,31,30,31,30,31};
            int sum = 0;
            if(year == lastYear){
                for(int i = month;i < lastMonth;i++){
                    sum += table[i];
                }
                if(isYear(year) && lastMonth > 2){
                    sum++;
                }
                if(isYear(year)){
                    sum += lastDay;
                    sum *= 2;
                }
                System.out.println(sum);
                return ;
            }
            for(int i = year + 1;i < lastYear; i++){
                int num = 0;
                for(int j = 1;j <= 12; j++){
                    num += table[j];
                }
                if(isYear(i)){
                    num++;
                    num *= 2;
                }
                sum += num;
            }
            int num = 0;
            for(int i = 1;i < lastMonth;i++){
                num += table[i];
            }
            if(isYear(lastYear) && lastMonth >= 2){
                num++;
            }
            if(isYear(lastYear)){
                num += lastDay;
                num *= 2;
            }
            sum += num;
            System.out.println(sum);
        }
    }
}
