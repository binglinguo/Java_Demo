package Demo1;

import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-05-13 17:59
 **/
//解读密码
public class Demo1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str = scanner.nextLine();

            StringBuilder strBuilder = new StringBuilder();
            for(int i = 0;i < str.length(); i++){
                if(str.charAt(i) >= '0' && str.charAt(i) <='9'){
                    strBuilder.append(str.charAt(i));
                }
            }
            System.out.println(strBuilder.toString());
        }
    }
}
