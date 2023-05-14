package Demo2;

class Animal{
    public String name;
    public int age;

    public void eat(){
        System.out.println(name+"吃");
    }
}

class Dog extends Animal{
//    public String name;
//    public int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    public void eat(){
//        System.out.println(name+"吃");
//    }

    public void wangwang(){
        System.out.println(name+"旺旺叫");
    }
}
class bread extends Animal{
//    public String name;
//    public int age;
    public String wing;

    public bread(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    public void eat(){
//        System.out.println(name+"吃");
//    }

    public void jiji(){
        System.out.println(name+"叽叽喳喳");
    }

    public void fly(){
        System.out.println(name+"正在用"+wing+"飞");
    }
}

public class Test {
    public static void main(String[] args) {
        Dog dog=new Dog("大黑",1);
        bread bread=new bread("渣渣",3);
        bread.wing="凤凰翅膀";

        dog.eat();
        dog.wangwang();

        bread.eat();
        bread.jiji();
        bread.fly();
    }
}
