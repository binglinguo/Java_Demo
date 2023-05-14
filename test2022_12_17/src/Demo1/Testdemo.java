package Demo1;

import java.util.ArrayList;

class A {

}
class Person extends A{

}
class Student extends Person {

}
class C extends Student {

}
public class Testdemo {


    public static void main(String[] args) {
        ArrayList<? super Person> arrayList1 = new ArrayList<Person>();

        //ArrayList<? super Person> arrayList2 = new ArrayList<Student>();
        arrayList1.add(new Person());
        //arrayList1.add(new A());
        arrayList1.add(new Student());//添加的元素 是person或者person的子类
        arrayList1.add(new C());

        ArrayList<? super Person> arrayList2 = new ArrayList<A>();
        arrayList2.add(new Person());
        arrayList2.add(new Student());

        //Person person = arrayList2.get(0);//why????

        //Student student = arrayList1.get(0);//why????
        //A a=arrayList2.get(0);
        Object o = arrayList1.get(0);//只能那object获取
    }
}
