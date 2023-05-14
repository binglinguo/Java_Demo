package dome1;

interface IAnish{
    void func();
}

interface IFly{
    void fly();
}

class Bird implements IAnish,IFly{
    public void func(){
        System.out.println("鸟");
    }

    public void fly(){
        func();
        System.out.println("正在飞");
    }
}



public class test {

//    public static void main(String[] args) {
//        Bird bird=new Bird();
//        bird.fly();
//    }

    public static void main(String[] args) {
        System.out.println("HelloWorld!");
    }

}
