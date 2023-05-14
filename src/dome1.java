

import com.sun.media.jfxmediaimpl.HostUtils;
import org.omg.IOP.TAG_RMI_CUSTOM_MAX_STREAM_FORMAT;
import sun.security.util.Length;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;


public class dome1 {//主类 类名必须与文件名相同

    public static void main(String[] args) {
        int a=10;
        //方法1
        String str=a+"";//直接给a加上一个字符串类型的进行类型转换再赋值
        System.out.println(str);
        //方法2
        String str2=String.valueOf(a);//string如果要被赋值int类型的需要此类包
        System.out.println(str2);
    }

    public static void main11(String[] args) {//常量类型
        final int A=10;//常量只能被初始化一次，并且初始化后不可以改变值
        //也可以先定义后初始化 ，但是还是只能被初始化一次
        System.out.println(A);
    }

    public static void main10(String[] args) {//byte数据类型 比较特别的类型 计算时会被提升为int类型
        byte a=10;
        byte b=20;
        byte c=(byte)(a+b);//如果不使用类型转换 会因为被提升精度无法接收值

        System.out.println(c);
    }

    public static void main9(String[] args) {//字符串数据类型String

        String str="\"hello\"";
        System.out.println(str);

    }

    public static void main8(String[] args) {//布尔类型 boolean
        boolean a=true;
        boolean b=false;
    }

    public static void main7(String[] args) {//short短整型
        short a=19;
        System.out.println(a);
    }
    public static void main6(String[] args) {//byte占一个字节
        byte a=12;
        byte b=21;
        System.out.println(a+" "+b);//使用中间加空格使用字符串类型
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);//println默认是以整形来打印的
    }

    public static void main5(String[] args) {//字符型
        char ch='a';
        System.out.println(ch);
        char ch1='郭';
        System.out.println(ch1);
        char ch2=97;//会转换为ASCII码
        System.out.println(ch2);
        System.out.println(Character.MAX_VALUE);
    }
    public static void main4(String[] args) {//单精度浮点类型
    float s1=1.23f;
        System.out.println(s1);
    }
    public static void main3(String[] args) {//双精度浮点类型
        double a1=3.14;//默认就是双精度类型
        System.out.println(a1);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        int a=1;
        int b=2;
        System.out.println(a/b);//输出结果为0，因为a，b都为整形 整形里无法存储小数
        double a_1=1;
        double b_1=2;
        System.out.println(a_1/b_1);//输出为0.5 因为a_1,b_1都为双精度型，可以存储小数
    }
    public static void main2(String[]args){//数组循环
        for (int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
        System.out.println("123");
    }
    public static void main1(String[] args) {//方法名字只要不为main就不是主函数，int整形类型
        int a  = Integer.MAX_VALUE;
        double b =  0.0;
        String a1 =  "撒娇哈根达斯";
        long s1=100L;//不加L或者l的话仍然为整形不是长整形，不建议写为小写l
        System.err.println(a1);
        System.out.println(a);//输出带换行
        System.out.print(a);//输出不带换行
        System.out.printf("%d",a);//输出指定类型的数据
        System.out.println(a+1);
        System.out.println(Integer.MIN_VALUE);//Integer包装类
        System.out.println(s1);
        System.out.println("最大值为："+ Long.MAX_VALUE);
        int a2=10;
        int b2=20;
        System.out.println("hhh"+ (a2 + b2));//任何类型的数据和字符串进行拼接结果就是字符串

    }
}
