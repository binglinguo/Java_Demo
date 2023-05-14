
//继承
class Animal{
    public String name;
    public int age;

    public void eat(){
        System.out.println(this.name+"eat()"+age);
    }
    public Animal(String name,int age){
        this.name=name;
        this.age=age;
    }
}


class Dog extends Animal{
    //帮助父类构造
    public  Dog(String name,int age){
//        this.name=name;
//        this.age=age;
        super(name,age);
    }
}

class Bird extends Animal{
    public String wing;

    public Bird(String name ,int age,String wing){
//        this.name=name;
//        this.age=age;
        super(name,age);
        this.wing=wing;
    }

    public void fly(){
        System.out.println(wing);
    }

}
//class Dog{
//    public String name;
//    public int age;
//
//    public void eat(){
//        System.out.println("eat()"+"  "+name);
//    }
//}
//class Bird{
//    public String name;
//    public int age;
//    public String wing;
//
//    public void eat(){
//        System.out.println("eat()"+"  "+name);
//    }
//}

public class test {
    public static void main(String[] args) {
        Dog dog=new Dog("haha",10);
        //dog.name="haha";
        dog.eat();
        Bird bird =new Bird("heihei",12,"飞翔");
        //bird.name="heihei";
        bird.eat();
        bird.fly();
    }
}
