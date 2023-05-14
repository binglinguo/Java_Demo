
class Shape{
    public void func() {
        System.out.println("123");
    }
}
class Rest extends Shape{
    @Override
    public void func(){
        System.out.println("♦");
    }
}

class Flower extends Shape{
    @Override
    public void func(){
        System.out.println("△");
    }
}

class Pentagram extends Shape{
    @Override
    public void func(){
        System.out.println("☆");
    }
}

public class test {

    public static void   fun(Shape shape){
        shape.func();
    }
    public static void main(String[] args) {
        Shape shape=new Rest();
        fun(shape);
        Shape shape1=new Flower();
        fun(shape1);
        Shape pentagram=new Shape();
        fun(pentagram);
    }
}
