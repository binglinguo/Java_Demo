package Demo1;

import java.util.Scanner;

public class Test {
    /**
     * 将用户输入的字符串转化（压缩）
     */
    public static String test4(String str) {
        StringBuilder stringBuilder=new StringBuilder();
        int i=0;
        while(i<str.length()){
            char ch=str.charAt(i);
            stringBuilder.append(ch);
            int count=0;
            while(i<str.length()&&str.charAt(i)==ch){
                count++;
                i++;
            }
            stringBuilder.append(count);
        }
        return stringBuilder.toString();
    }

    public static void main (String[] args) {
        String s="abbcccffr";
        System.out.println(test4(s));
    }
    /**
     * 字符串逆置
     * @param args
     */
    public static String reverseSentence(String str) {
        StringBuilder stringBuilder=new StringBuilder();
        for (int i = 0 ; i < str.length() ; i++) {
            stringBuilder.append(str.charAt(i));
        }

        //整体反转
        int i=0;
        int j=str.length()-1;
        reverse(stringBuilder,i,j);
        System.out.println(stringBuilder);
        //单个单词反转
        for (i = 0 ; i < str.length()  ; i++) {
            j=i;
            while(j<str.length()&&stringBuilder.charAt(j)!=' '){
                j++;
            }
            if(j<str.length()){
                reverse(stringBuilder,i,j-1);
            }else{
                j=str.length()-1;
                reverse(stringBuilder,i,j);
            }
            i=j;
        }
        return stringBuilder.toString();
    }
    public static void reverse(StringBuilder stringBuilder,int i,int j){
        while(i<=j){
            char t=stringBuilder.charAt(i);
            stringBuilder.setCharAt(i,stringBuilder.charAt(j));
            stringBuilder.setCharAt(j,t);
            i++;
            j--;
        }
    }
    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string2 = scanner.nextLine();
        System.out.println(reverseSentence(string2));
    }
    public static void main1(String args[]){
        int num = 10;
        System.out.println(test(num));
    }
    public static int test(int b) {
        try {
            b += 10;
            return b;
        } catch (RuntimeException e) {
        } catch (Exception e2) {
        } finally {
            b += 10;
            return b;
        }
    }
}
