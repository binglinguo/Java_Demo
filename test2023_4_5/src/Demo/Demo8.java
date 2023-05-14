package Demo;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-05 20:55
 **/
public class Demo8 {
    public static boolean isyear(int year){
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            return true;
        }
        return false;
    }
    public static void main (String[] args) {
        //计算天数
        //计算周一的天数
        //计算1号的天数
        //1号和周一的天数
        int[] array = new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};
        //判断是否为闰年
        int sum = 0;
        int sumyue = 10;
        for(int i = 2000;i < 2020 ;i++){
            if(isyear(i)){
                sum++;
            }
            sumyue += 12;
            for(int j = 1;j <= 12; j++) {
                sum += array[j];
            }
        }
        if (isyear(2020)) {
            sum++;
        }
        for(int j = 1;j < 10;j++){
            sum += array[j];
        }
        sum += 1;
        //现在保存的是所有的天数
        //计算有多少个星期
        int day = 6;
        int sumday = 0;
        for(int i = 0;i < sum;i++){//6 7 8 1
            day++;
            if(day % 8 == 0){
                day = 1;
            }
            if(day == 1){
                sumday++;
            }
        }
        //周一和月初重合的天数
        sum = sum + sumyue + sumday - 34;
        System.out.println(sum);
    }
}
