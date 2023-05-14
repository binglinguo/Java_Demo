package Demo1;

import java.util.Comparator;
import java.util.PriorityQueue;

@FunctionalInterface//函数式接口
interface Person{
    void fun();
//    void fun1();只能有一共方法
}

@FunctionalInterface//函数式接口
interface Person1{
    void fun(int a);
//    void fun1();只能有一共方法
}

@FunctionalInterface//函数式接口
interface Person2{
    void fun(int a,int b);
//    void fun1();只能有一共方法
}
@FunctionalInterface//函数式接口
interface Person3{
    int fun();
//    void fun1();只能有一共方法
}
@FunctionalInterface//函数式接口
interface Person4{
    int fun(int a);
//    void fun1();只能有一共方法
}
@FunctionalInterface//函数式接口
interface Person5{
    int fun(int a,int b);
//    void fun1();只能有一共方法
}
public class Test1 {
    /**
     * lambda表达式
     * @param args
     */
    public static void main (String[] args) {
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>(3 , new Comparator<Integer>() {
            @Override
            public int compare (Integer o1 , Integer o2) {
                return o1-o2;
            }
        });

        PriorityQueue<Integer> priorityQueue1=new PriorityQueue<>(3,(o1,o2)->o1-o2);
    }
    public static void main4 (String[] args) {
        Person3 person3=()->10;
        System.out.println(person3.fun());

        Person4 person4=a->a;
        System.out.println(person4.fun(10));

        Person5 person5=(a,b)->a+b;
        System.out.println(person5.fun(1,3));
    }
    public static void main3 (String[] args) {
/*        Person1 person1=(a)-> {
            System.out.println(a);
        };
        person1.fun(10);*/

        /*Person1 person1=a-> System.out.println(a);
        person1.fun(10);*/

        Person1 person1= System.out::println;
        person1.fun(10);
    }
    public static void main2 (String[] args) {
        Person person=()-> System.out.println("重写方法");
        person.fun();
    }
    public static void main1 (String[] args) {
        Person person=new Person() {
            @Override
            public void fun () {
                System.out.println("重写方法");
            }
        };
        person.fun();
    }
}
