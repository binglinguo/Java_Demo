package Demo1;

import com.sun.java.swing.plaf.windows.WindowsTextAreaUI;

/**
 * 装箱拆箱
 */
public class Test {
    public static void main(String[] args) {

    }
    public static void main2(String[] args) {
        int a=10;
        Integer b=a;//自动装箱
        Integer b1=(Integer)a;//半自动装箱

        int c=b;//自动装箱
        int c1=(int)b;//半自动转箱

    }
    public static void main1(String[] args) {
        int a=10;
        Integer b=a;//隐式装箱
        Integer b1=Integer.valueOf(a);//如果不在-128~127范围内就新建对象，否则存入数组中
        Integer b2=new Integer(a);//新建一个对象
        int c=b;//隐式拆箱
        int c1= b.intValue();//显示拆箱
        //Integer b3=Integer.valueOf(a);
        //System.out.println((b3 == b1));//因为如果在范围内的数值一样都会放在数组中，如果取到同样的数字就一样
        //==如果是简单类型比较的是值，如果是引用类型比较的是地址
        Integer b4=new Integer(a);
        System.out.println(b2==b4);//因为都是产生了新的对象，所以不一样
        System.out.println(c);
    }
}
