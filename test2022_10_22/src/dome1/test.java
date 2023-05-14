package dome1;
//抽象类，被abstract所修饰
abstract class Shape{
    public int a;
    public void func(){
        System.out.println("测试普通方法！");
    }
    public abstract void draw();
}

class Rect extends Shape{
    @Override
    public void draw(){
        System.out.println("♦");
    }
}

class Flower extends Shape{
    @Override
    public void draw() {
        System.out.println("♣");
    }
}

class Triangle extends Shape{
    @Override
    public void draw(){
        System.out.println("△");
    }
}

class Tycle extends Shape{
    @Override
    public void draw(){
        System.out.println("●");
    }
}

abstract class A extends Shape{
    public abstract void func();
}

/**
 * 如果继承的类已经继承了其他类，那么要构造继承的所有类
 */
class C extends A{
    @Override
    public void draw(){
        System.out.println("123");
    }

    @Override
    public void func() {
        System.out.println("321");
    }
}

public class test {

    public  static void drawMap(Shape shape){
        shape.draw();
    }

    public static void main(String[] args) {
        Shape shape=new Flower();
        drawMap(shape);
    }
}
