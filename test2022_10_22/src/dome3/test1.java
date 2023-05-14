package dome3;
//动物类
class Animal{
    protected String name;

    public Animal(String name){
        this.name=name;
    }
}

//接口飞
interface IFlying{
    void fly();
}

//接口跑
interface IRunning{
    void runn();
}

//接口游泳
interface ISwimming{
    void swimm();
}

//鸟类 鸟继承动物 鸟会飞
class Bird extends Animal implements IFlying{
    public Bird(String name) {
        super(name);
    }
    @Override
    public void fly(){
        System.out.println(this.name+"正在飞");
    }
}

//青蛙 青蛙继承动物 青蛙会跑，会游泳
class Frog extends Animal implements IRunning,ISwimming{
    public Frog(String name) {
        super(name);
    }

    @Override
    public void runn() {
        System.out.println(this.name+"正在跑");
    }

    @Override
    public void swimm() {
        System.out.println(this.name+"正在游泳");
    }
}

//鸭子 继承动物，会飞，会跑，会游泳
class Duck extends Animal implements IFlying,ISwimming,IRunning{
    public Duck(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(this.name+"飞");
    }

    @Override
    public void swimm() {
        System.out.println(this.name+"正在游泳");
    }

    @Override
    public void runn() {
        System.out.println(this.name+"正在跑");
    }
}

//机器人会跑
class Roobot implements IRunning{
    @Override
    public void runn() {
        System.out.println("机器人在跑");
    }
}

public class test1 {

    public static void runn(IRunning irunning){
        irunning.runn();
    }

    public static void fly(IFlying fly){
        fly.fly();
    }

    public static void swimm(ISwimming swimm){
        swimm.swimm();
    }

    public static void main3(String[] args) {
        runn(new Duck("鸭子"));
        runn(new Frog("青蛙"));
        runn(new Roobot());
    }


    public static void main2(String[] args) {
        fly(new Duck("鸭子"));
        fly(new Bird("小鸟"));
    }


    public static void main1(String[] args) {
        swimm(new Frog("青蛙"));
        swimm(new Duck("鸭子"));

    }

}
