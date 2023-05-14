package Demo;

import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-23 21:58
 **/
//分解因数
public class Demo1 {
    //判断一个数字是否为素数
    public static boolean isSuShu(int n){
        for(int i = 2;i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String strs = scanner.nextLine();
            String[] str = strs.split("<br/>");
            for(String s : str){
                int n = Integer.parseInt(s);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(n + " = ");
                int ret = n;
                for(int i = 2;i <= Math.sqrt(n); i++){
                    if(isSuShu(i)){
                        while(ret % i == 0){
                            ret /= i;
                            stringBuilder.append(i);
                            if(ret != 1){
                                stringBuilder.append(" * ");
                            }
                        }
                    }
                }
                if(ret != 1){
                    stringBuilder.append(ret);
                }
                System.out.println(stringBuilder.toString());
            }
        }
    }
}
