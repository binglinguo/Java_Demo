package Demo2;

class Student{
    String name;
    int age;

    public Student(){

    }

    private Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getAge () {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }

    @Override
    public String toString () {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class TestDemo1 {
    public static void main (String[] args) throws ClassNotFoundException {
        //获取方式1
        Class<?> c1=Class.forName("Demo2.Student");
        //获取方式2
        Class<?> c2=Student.class;
        //获取方式3
        Student student=new Student();
        Class<?> c3=student.getClass();

        System.out.println(c1==c2);
        System.out.println(c1==c3);
        System.out.println(c2==c3);
    }
}
