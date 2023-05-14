package Demo1;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        StringBuilder str1=new StringBuilder(str);
        int i=str1.lastIndexOf(" ");
        str.toUpperCase();
        System.out.println(str1.length()-i-1);

    }
    public int firstUniqChar(String s) {

        StringBuilder s1=new StringBuilder(s);
        for(int i=0;i<s1.length();i++){
            if(s1.indexOf(Character.toString(s1.charAt(i)))==s1.lastIndexOf(Character.toString(s1.charAt(i)))){
                return i;
            }
        }
        return -1;
    }
    public static int func() {
        String s="lencode";
        StringBuilder str=new StringBuilder(s);
        for(int i=0;i<str.length();i++){
            String ch=Character.toString(str.charAt(i));
            int a=str.indexOf(ch,0);
            if(a==-1){
                return i;
            }
        }
        return -1;
    }


    public static void main13(String[] args) {
        int a=9;
        int b=0;
        try{
            System.out.println(a/b);
        }catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("处理除数为0异常");
        }

    }
    public static void main12(String[] args) {
//        int a=func();
//        System.out.println(a);
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        StringBuilder str1=new StringBuilder(str);
        int i=str1.lastIndexOf(" ");
        System.out.println(i);
    }
    /**
     * 从下可知：
     * StringBuffer和StringBuilder的使用是差不多的
     * 他们之间的区别是StringBuffer是有synchronized修饰的
     * 这代表使用StringBUffer是线程安全的  但是效率肯定比不上StringBuilder的
     * 所以在使用中我们就要考虑到线程安全的话就要使用StringBuffer
     * 要求效率就要使用StringBuilder
     * @param args
     */
    //StringBuilder的初始化
    public static void main7(String[] args) {
        //StringBuilder str="sajhdbasj";error
        StringBuilder str=new StringBuilder("hello");
        for (int i = 0; i < 5; i++) {
            str.append(i);
        }
        System.out.println(str);
        System.out.println(str.charAt(2));
        System.out.println(str.length());
        str.setCharAt(2,'6');
        System.out.println(str);
        System.out.println(str.indexOf("e"));
        System.out.println(str.lastIndexOf("e"));
        System.out.println(str.lastIndexOf("e", 4));
        str.insert(3,"s");
        System.out.println(str);
        str.deleteCharAt(2);
        System.out.println(str);
        str.delete(0,2);//左闭右开
        System.out.println(str);
        System.out.println(str.replace(0, 3, "2"));
        //System.out.println(str);
        str=new StringBuilder("hello");
        System.out.println(str);
        System.out.println(str.substring(2));
        System.out.println(str.substring(0,3));
        str.reverse();//反转 要记住
        System.out.println(str);
        System.out.println(str.toString());

    }
    //StringBuffer的创建初始化
    public static void main6(String[] args) {
        //StringBuffer str="askdja";//error
        StringBuffer str=new StringBuffer("sadjkas");
        //使用拼接
        for (int i = 0; i < 5; i++) {
            str.append(i);
        }
        System.out.println(str);
    }
    /**
     * 修改字符串中的内容
     */
    public static void main5(String[] args) {
        String arr="abcdef";
        //这种方法不建议使用 中间会多出来好多个对象 例如
        //i如果要连接到String后就需要先创建出对象存到对象池中
        //然后新连接的String也是一个新的对象也要存到对象池中 这样一来会多出好多对象
        for (int i = 0; i <5 ; i++) {
            arr+=i;
        }
        System.out.println(arr);
    }
    /**
     * 所有设计到字符串的操作都是返回一个新的对象，因为字符串对象是不可变的
     * 一定注意！
     */
    //去除连边空格 大小写转化
    /**
     * trim经常用于去除空格回车这些多余的操作
     * @param args
     */
    public static void main4(String[] args) {
        String arr="        asd  sad a     ";
        arr=arr.trim();
        System.out.print(arr);
        System.out.print(132132132);
        System.out.println("========");
        arr=arr.toUpperCase();
        System.out.println(arr);
        arr=arr.toLowerCase();
        System.out.println(arr);
    }
    //从字符串中取出部分内容
    public static void main3(String[] args) {
        String str="hello,bit";
        String str1=str.substring(3,5);//左闭右开
        System.out.println(str1);
    }
    //将一个字符串按照指定的字符进行划分
    public static void main2(String[] args) {
        String str="he&ll&o";
        String[] ret=str.split("&");
        for (String tmp:ret) {
            System.out.println(tmp);
        }
        String st1="he ll o str gbl yyy";
        String[] re1=st1.split(" ",3);
        for (String tmp:re1) {
            System.out.println(tmp);
        }
        System.out.println("==============");
        //拆分ip地址
        String arr="192.168,2.1";
        String[] arr1=arr.split("\\.|\\,");//切记要使用转义
        for (String x:arr1) {
            System.out.println(x);
        }
    }
    //替换所有指定内容
    public static void main1(String[] args) {
        String str="abcdefgaaaass";
        String atr1=str.replaceAll("a","sb");//方法返回的是一个字符串类型
        //注意：由于字符串是不可变对象, 替换不修改当前字符串, 而是产生一个新的字符串.
        System.out.println(atr1);
        String str2=str.replaceFirst("a","6");
        System.out.println(str2);
    }
}
