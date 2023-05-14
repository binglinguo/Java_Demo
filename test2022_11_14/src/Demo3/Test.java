package Demo3;

class Animal{
    public String name;
}

interface IEat{
    public void eat();
}

interface IRun{
    public void Run();
}

interface ISwimming{
    public void swim();
}

class Dog extends Animal implements IEat,IRun{

    public Dog(String name){
        this.name=name;
    }
    @Override
    public void eat() {
        System.out.println(name+"吃狗粮");
    }

    @Override
    public void Run() {
        System.out.println(name+"正在用四条狗腿跑");
    }
}

class Fish extends Animal implements IEat,ISwimming{

    public Fish(String name) {
        this.name=name;
    }

    @Override
    public void eat() {
        System.out.println(name+"正在吃鱼食");
    }

    @Override
    public void swim() {
        System.out.println(name+"正在游泳");
    }
}

class Duck extends Animal implements IEat,IRun,ISwimming{

    public Duck(String name) {
        this.name=name;
    }

    @Override
    public void eat() {
        System.out.println(name+"正在吃鸭食");
    }

    @Override
    public void Run() {
        System.out.println(name+"正在用两条鸭腿跑");
    }

    @Override
    public void swim() {
        System.out.println(name+"正在游泳");
    }
}
public class Test {
    public static void funeat(IEat ieat){
        ieat.eat();
    }
    public static void funrun(IRun irun){
        irun.Run();
    }
    public static void funswimming(ISwimming iswimming){
        iswimming.swim();
    }
    public static void main(String[] args) {
        funeat(new Dog("武卓航"));
        funrun(new Dog("武卓航"));

        funeat(new Fish("糖醋"));
        funswimming(new Fish("糖醋"));

        funeat(new Duck("周黑鸭"));
        funrun(new Duck("周黑鸭"));
        funswimming(new Duck("周黑鸭"));
    }
}
