package Demo1;

import java.util.Locale;


public class Test {
    public static boolean is(String str){
        String str1=str.toLowerCase();
        return str1=="admin";
    }

    public static void main(String[] args) {
        boolean flg=is("admin");
        System.out.println(flg);
    }
    public static void main4(String[] args) {
        String str1="hello";
        String str2=new String();
        str2=new String("hello");
        String str3=new String("hello");
    }
    public static void main3(String[] args) {
        int[] ch=new int[]{1,2,3};
        System.out.println(ch);
        char[] ch1=new char[]{'a','b','c'};
        System.out.println(ch1);
        StringBuffer buf=new StringBuffer();
        buf.append(1);
    }
    public String toLowerCase(String s) {
        return s.toLowerCase();
    }

    public static void main2(String[] args) {
        int c=countSegments(", , , ,        a, eaefa");
        System.out.println(c);
    }
    public static void main1(String[] args) {
        StringBuffer str=new StringBuffer();
        StringBuilder str1=new StringBuilder();
        str.append(1);
        str1.append(2);
    }
    public static int countSegments(String s) {
        if(s==null||s.equals(""))return 0;
        String[]str = s.split(" |/,");
        int count=0;
        for(String string:str){
            if(string!=null){
                count++;
            }
        }
        return count;
    }
}
