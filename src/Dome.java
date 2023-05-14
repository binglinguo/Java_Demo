
/**
 * 封装就是用private来修饰属性或者方法
 * 限定你只能在类中使用
 * 为什么要封装?
 *如果没有特殊要求 那么属性都设置为私有的
 *
 * 关键字：
 * this：代表对当前对象的引用
 * 要习惯使用this
 * 如果没有特殊要求 一定要习惯使用this 用来体现封装
 */
class Student{
    private String name;//
    public  int age;
    //如果已经进行过封装  那么需要提供一个公开的接口
    //使用Ait+Lnsert快速创建
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //重新 实现了一下Object类的 toString方法
    //object是所有方法的父类
    @Override//注解：这个注解指的是 这个方法是重新写的
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /*    public String MyName(){//调用返回name内容
                return this.name;
            }
            public void getname(String name1){//调用修改name值
                this.name=name1;
            }
            public void getname1(String name){//如果发生以上这种情况 是因为名称一样 局部变量优先 等于自己给自己赋值了
                this.name=name;//this代表对当前对象的引用
            }*/
    public void func1(){
        System.out.println("func1()");
    }
}
//以上是类的实现者写的代码
//以下是类的使用者写的代码
public class Dome {

    public static void main1(String[] args) {
        Student student=new Student();
        student.setName("guobinglin");
        student.setAge(20);
        System.out.println(student);

    }

}
