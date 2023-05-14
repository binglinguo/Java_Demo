package Demo1;

import jdk.nashorn.internal.ir.annotations.Ignore;

import java.util.Arrays;
class Test1 {
    public static void hello() {
        System.out.println("hello");
    }
}
public class Test {
    private int count;

    public static void main(String[] args) {

        Test test=new Test(88);

        System.out.println(test.count);

    }

    Test(int a) {

        count=a;

    }
    public static void main3(String[] args) {
        // TODO Auto-generated method stub
        Test1 test=null;
        test.hello();
    }
    public static void main2(String[] args) {
        String arr1="abc";
        String arr2="Abc";
        int ret=arr1.compareTo(arr2);
        int ret2=arr1.compareToIgnoreCase(arr2);
        System.out.println(ret);
        System.out.println(ret2);
        System.out.println("==========");
        System.out.println(arr1.equals(arr2));
        System.out.println(arr1.equalsIgnoreCase(arr2));
    }
    //判断一个字符串是否为全数字字符串
    public static  boolean isNumber1(String array){
        for (int i = 0; i < array.length() ; i++) {
            char s=array.charAt(i);
            boolean flg=Character.isDigit(s);//判断字符是否是数字类型
            if(flg==false){
                return false;
            }
//            if(s<'0'||s>'9'){
//                return false;
//            }
        }
        return true;
    }
    public static void main1(String[] args) {
        String array="1234567";
        System.out.println(isNumber1(array));
    }
}
