package Demo1;

import java.util.Objects;
import java.util.PriorityQueue;

class student{
    int age;
    String name;
    public student(String name,int age){
        this.age=age;
        this.name=name;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        student student = (student) o;
        return age == student.age && Objects.equals(name , student.name);
    }

    @Override
    public int hashCode () {
        return Objects.hash(age , name);
    }
}
public class Test1 {
    public static void main1 (String[] args) {
        student student1=new student("zhangsan",10);
        student student2=new student("zhangsan",10);
        System.out.println(student1==student2);
        System.out.println(student1.equals(student2));
    }
}
