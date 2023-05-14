class Animal{//Animal 父类 基类 超类
    public String name;
    public int age;

    public void eat(){
        System.out.println("eat()");
    }

    public Animal(String name,int age){
        this.name =name;
        this.age=age;
    }
}
class Dog extends Animal {//extends 继承
    //new一个类的时候，会默认有一个构造方法
    //public Dog（）{
    // super();
    //       }
    public Dog(String name,int age){
        super(name,age);
    }
//    public String name;
//    public int age;
//
//    public void eat(){
//        System.out.println("eat()");
//    }
}
class Bird extends Animal{//Bird 子类 或者派生类

    public Bird(String name,int age,String wing){
        super(name,age);
        this.wing=wing;

    }
    //    public String name;
//    public int age;
    public String wing;

    //    public void eat(){
//        System.out.println("eat()");
//    }
    public void fly(){
        System.out.println(name +"fly()");
    }

}
public class dome {
    public static void main1(String[] args) {
        Dog dog=new Dog("gaogao",19);
        System.out.println(dog.name+"今年"+dog.age+"岁");
        dog.eat();
        Bird bird=new Bird("zizi",5,"自由的飞翔");
        System.out.println(bird.name+"今年"+bird.age+"岁，正在"+bird.wing);
        bird.eat();
        bird.fly();
    }
//    public static void main(String[] args) {
//        System.out.println(123);
//    }
}
