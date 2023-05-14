package Demo3;

import java.util.Locale;

public class Test {
    //格式化字符串
    public static void main(String[] args) {
        String str=String.format("%d-%d-%d",192,168,1);
        System.out.println(str);
    }
    //字符串转数组
    public static void main6(String[] args) {
        String str="hello";
        char[] ch=str.toCharArray();
        for (char x:ch) {
            System.out.print(x);
        }
    }
    //字符串大小写转换
    public static void main5(String[] args) {
        String str="Asjcnao";
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
    }
    //数值与字符串之间的转换
    public static void main4(String[] args) {
        int a=1234;
        String str=String.valueOf(a);
        String str1=String.valueOf(12.3);
        String str2=String.valueOf(false);
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println("===========");
        System.out.println("字符串转数字");
        int s=Integer.parseInt(str);
        System.out.println(s);
        double s1=Double.parseDouble(str);
        System.out.println(s1);
    }
    //返回index第一次出现的下标，否则-1
    public static void main3(String[] args) {
        String str="lgnbbbb";
        System.out.println(str.indexOf('b'));
        System.out.println(str.indexOf('b',4));
        System.out.println(str.indexOf("nb"));
        System.out.println(str.indexOf("nb",4));
        System.out.println(str.lastIndexOf("nb"));
        System.out.println(str.lastIndexOf("nb",1));


    }
    //返回index下标上的值
    public static void main2(String[] args) {
        String str="lgnbbbb";
        char ch=str.charAt(2);
        System.out.println(ch);
    }
    //字符串的构造方式
    public static void main1(String[] args) {
        String str=new String("lgnb");
        String str1="lgnb";
        String str2="lGnb";
        //str2=new String("lgnb");
        System.out.println(str.length());
        System.out.println(str.isEmpty());
        System.out.println("java".length());
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
        System.out.println("===============");
        System.out.println(str1.compareToIgnoreCase(str2));//compareTo 比较大小 compareToIgnoreCase是忽略大小写

    }
}
