

//class Person1 {
//    public int age;//成员属性 实例变量
//    public String name;
//    public String sex;
//    public void eat() {//成员方法
//        System.out.println("吃饭!");
//    }
//    public void sleep() {
//        System.out.println("睡觉!");
//    }
//}

class Person2{
   private String name;
   private int age;
   public static int count;
    {
        System.out.println("实例代码块");
    }
    static{
        System.out.println("静态代码块");
    }

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

    @Override
    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class test_8_28 {

    public static void main2(String[] args) {
    Person2 person2=new Person2();
    }

    public static void main1(String[] args) {
       // Person1 person1=new Person1();
        Person2 person2=new Person2();
        person2.setName("guo");
        person2.setAge(18);
        System.out.println(person2.toString());
    }

}
