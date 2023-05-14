package Demo1;

/**
 * 泛型
 */

class MyArray{
    public Object[] obj = new Object[10];

    public MyArray(){

    }

    public void set(int pos,Object val){
        this.obj[pos]=val;
    }
    public Object get(int pos){
        return this.obj[pos];
    }
}
class MyArray1<T>{
    public T[] obj = (T[])new Object[10];

    public void set(int pos,T val){
        this.obj[pos]=val;
    }

    public T get(int pos){
        return this.obj[pos];
    }
}
public class Test2 {
    public static void main(String[] args) {
        MyArray1<Integer> myArray=new MyArray1<>();
        //如果加入了类型代表编译器会帮助你检查类型是否一致，这样保持了只能有单一的一种类型传入不会有多种类型传入
       // myArray.set(0,12.0);//error
        myArray.set(0,10);
       // myArray.set(2,"adsg");//error
        //int s1=myArray.get(0);
       //System.out.println(s1);
        int s2=myArray.get(0);
        System.out.println(s2);
        System.out.println("================");
        MyArray1<String> myArray1=new MyArray1<>();
        myArray1.set(0,"asd");
//        myArray1.set(1,12);//error
//        myArray1.set(2,12.3);//error

    }
    public static void main2(String[] args) {
        MyArray1 myArray1=new MyArray1();
        myArray1.set(0,12);
        System.out.println(myArray1.get(0));
    }
    public static void main1(String[] args) {
        MyArray myArray=new MyArray();
        myArray.set(0,1);
        myArray.set(1,"askjdh");
        myArray.set(2,12.07);
        System.out.println();
        //可以正常输出 但是使用变量来接收就显的很难受，因为无法确定类型
        //System.out.println(myArray.get(0));
        //System.out.println(myArray.get(1));
        //System.out.println(myArray.get(2));
        //int a=myArray.get(0);//error
        int a=(int)myArray.get(1);//必须强制类型转换，但是在多数情况下 我们是不知道是什么类型的
    }
}
