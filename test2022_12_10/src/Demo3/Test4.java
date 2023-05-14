package Demo3;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String str=scanner.nextLine();
        int a=0,b=0,c=0,d=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='0'&&ch<='9'){
                a++;
            }
            else if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z'){
                b++;
            }
            else if(ch==' '){
                c++;
            }
            else {
                d++;
            }
        }
        System.out.println("英文字母"+b+"数字"+a+"空格"+c+"其他"+d);
    }
}
