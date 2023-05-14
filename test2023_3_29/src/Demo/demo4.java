package Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-29 21:54
 **/
public class demo4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int length = str.length();//长度
        int letterA = 0;//字母
        int lettera = 0;
        int figures = 0;//数字
        int symbol = 0;//符号
        //计算存在的数量
        for(int i = 0;i < length; i++){
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <='z'){
                lettera++;
            }else if(ch >='A' && ch <= 'Z'){
                letterA++;
            }else if(ch >= '0' && ch <= '9'){
                figures++;
            }else {
                symbol++;
            }
        }
        //计算奖励分
        int reward = 0;
        if(letterA + lettera != 0 && figures != 0){
            if(symbol != 0){
                reward += 1;
                if(letterA != 0 && lettera != 0){
                    reward += 2;
                }
            }
            reward += 2;
        }
        int count = reward;
        //计算密码长度的分数
        if(length <= 4){
            count += 5;
        }else if(length >= 5 && length <= 7){
            count += 10;
        }else {
            count += 25;
        }
        //计算密码字母的分数
        if(lettera + letterA == 0){
            count += 0;
        }else if(lettera != 0 && letterA != 0){
            count += 20;
        }else {
            count += 10;
        }
        //计算数字的分数
        if(figures == 1){
            count += 10;
        }else if(figures > 1){
            count += 20;
        }
        //计算符号的分数
        if(symbol == 1){
            count += 10;
        }else if(symbol > 1){
            count += 25;
        }
        String s = null;
        //处理完毕 查验标准
        if(count >= 90){
            s = "VERY_SECURE";
        }else if(count >= 80){
            s = "SECURE";
        }else if(count >= 70){
            s = "VERY_STRONG";
        }else if(count >= 60){
            s = "STRONG";
        }else if(count >= 50){
            s = "AVERAGE";
        }else if(count >= 25){
            s = "WEAK";
        }else {
            s = "VERY_WEAK";
        }
        System.out.println(s);
    }
}
