package Demo;

import java.util.Comparator;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-22 14:46
 **/
class Student implements Comparable<Student>{
    int id;
    int age;
    String name;

    public Student(int id,int age,String name){
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo (Student o) {
        return this.age - o.age;
    }
}
class StudentComparable implements Comparator<Student> {
    @Override
    public int compare (Student o1 , Student o2) {
        return o1.age - o2.age;
    }
}
public class Demo5 {
    public static void main (String[] args) {
        Student zhangSan = new Student(1,14,"zhangsan");
        Student liSi = new Student(2,8,"lisi");
        StudentComparable studentComparable = new StudentComparable();
        System.out.println(studentComparable.compare(zhangSan,liSi));
        //System.out.println(zhangSan.compareTo(liSi));
    }
}
