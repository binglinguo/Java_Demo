import java.util.Arrays;

//class Test {
//    public static void hello() {
//        System.out.println("hello");
//    }

//    public int aMethod() {
//        static int i = 0;
//        i++;
//        return i;
//    }
//}
//public class Person{
//
//    private String name = "Person";
//
//    int age=0;
//
//}
//class Calc{
//    private int num1;
//    private int num2;
//
//    public int getNum2() {
//        return num2;
//    }
//
//    public void setNum2(int num2) {
//        this.num2 = num2;
//    }
//
//    public int getNum1() {
//        return num1;
//    }
//
//    public void setNum1(int num1) {
//        this.num1 = num1;
//    }
//    public int add(){
//        return num1+num2;
//    }
//    public int jia(){
//        return num1-num2;
//    }
//    public int day(){
//        return num1*num2;
//    }
//    public double div(){
//        return num1*1.0/num2;
//    }
//}
//class Mytemp{
//    private int a=10;
//    private int b=20;
//
//    public int getA() {
//        return a;
//    }
//
//    public void setA(int a) {
//        this.a = a;
//    }
//
//    public int getB() {
//        return b;
//    }
//
//    public void setB(int b) {
//        this.b = b;
//    }
//}
//class Myvalue{
//    public int arr;
//}
public class test2022_8_29 {
//
//    public static void swap(Myvalue num1,Myvalue num2){
//        int tmp=num1.arr;
//        num1.arr=num2.arr;
//        num2.arr=tmp;
//    }
//        Myvalue myvalue1=new Myvalue();
//        Myvalue myvalue2=new Myvalue();
//        myvalue1.arr=10;
//        myvalue2.arr=20;
//        swap(myvalue1,myvalue2);
//        System.out.println(myvalue1.arr+" "+myvalue2.arr);
//    }
//
//    public static void main5(String[] args) {
//        Mytemp mytemp=new Mytemp();
//        System.out.println("交换前"+mytemp.getA()+" "+mytemp.getB());
//        int tmp=mytemp.getA();
//        mytemp.setA(mytemp.getB());
//        mytemp.setB(tmp);
//        System.out.println("交换后"+mytemp.getA()+" "+mytemp.getB());
//    }
//    public static void main4(String[] args) {
//        Calc calc=new Calc();
//        calc.setNum1(10);
//        calc.setNum2(20);
//        System.out.println(calc.add());
//    }

    //给定两个整型数组, 交换两个数组的内容.
//    public static void main3(String[] args) {
//        int[] arr={1,2,2,2,2,2,2,2,2,2,2,3,4,5,6,7};
//        int[] arr1={7,6,5,4,3,2,1,0};
//        int[] tmp=arr.clone();
//        arr=arr1.clone();
//        arr1=tmp.clone();
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arr1));
//    }

//给定整型数组, 把所有的偶数放到数组前面, 把所有奇数放到数组后面.
//    public static void main(String[] args) {
//        int[] arr={1,2,3,4,5,6,7,8,9,10};
//        int j=arr.length-1;
//        int i=0;
//        while(i<j){
//        int tmp=0;
//        while(arr[i]%2==0&&i<j){
//            i++;
//        }
//        while(arr[j]%2==1&&i<j){
//            j--;
//        }
//        tmp=arr[i];
//        arr[i]=arr[j];
//        arr[j]=tmp;
//        i++;
//        j--;
//        }
//        System.out.println(Arrays.toString(arr));
//    }


//    public String grade;
//
//    public static void main(String[] args){
//
//        Person p = new test();
//
//        System.out.println(p.name);
//
//    }

//    private float f=1.0f;
//
//    int m=12;
//
//    static int n=1;

//    public static void main(String args[]){
//
//        test2022_8_29 t=new test2022_8_29();
//        test2022_8_29.n=0;
//        t.m=0;
//    }
//    static boolean Paddy;
//    public static void main3(String args[]){
//        System.out.println(Paddy);
//    }

//    public static void main(String args[]) {
//        Test test = new Test();
//        test.aMethod();
//        int j = test.aMethod();
//        System.out.println(j);
//    }


//    public static void main2(String[] args) {
//        // TODO Auto-generated method stub
//        Test test = null;
//        test.hello();
//    }
//
//    public static void main1(String[] args) {
//
//        String s = null;
//
//        System.out.println("s=" + s);
//
//    }
}
