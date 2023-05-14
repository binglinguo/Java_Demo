package dome1;
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
    public void eat(){
        System.out.println(name+"狼吞虎咽的eat（）");
    }
}
class Bird extends Animal {//Bird 子类 或者派生类

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


public class Test {

    public static void main(String[] args) {
        //Animal animal1=new Bird("hehi",12,"feixiang ");
        //animal1.eat();
        //通过父类引用只能访问自己的成员
        //animal1.fly();访问失败
        //向下转型
        Animal animal=new Bird("姜鑫",22,"自由的飞翔");
        //animal.fly(); 此时是不能调用的
        Bird bird=(Bird) animal;//切记要进行类型转换‘
        bird.fly();//可以使用
        //但是不建议这样写
    }

    public static void main2(String[] args) {
        Animal animal=new Dog("旺财",12);
        animal.eat();
        Animal animal1=new Bird("hehi",12,"feixiang ");
        animal1.eat();
        //通过父类引用只能访问自己的成员
    }

    public static Animal func(){
        Animal animal=new Dog("haha",19);
        return animal;
    }

    public static void main1(String[] args) {
        Animal animal=new Dog("haha",19);
    }
}
